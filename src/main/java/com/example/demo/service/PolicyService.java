package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.CreatePolicyRequest;
import com.example.demo.dto.PolicyResponse;
import com.example.demo.entity.Customer;
import com.example.demo.entity.Policy;
import com.example.demo.enums.PolicyStatus;
import com.example.demo.exception.CustomerNotFoundException;
import com.example.demo.exception.InvalidPolicyException;
import com.example.demo.exception.PolicyNotFoundException;
import com.example.demo.mapper.PolicyDtoMapper;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.PolicyRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PolicyService {
    private final PolicyRepository policyRepository;
    private final CustomerRepository customerRepository;

    public List<PolicyResponse> getAllPolicies() {
        return policyRepository.findAll()
                .stream()
                .map(PolicyDtoMapper::toResponse)
                .toList();
    }

    public PolicyResponse getPolicyById(Integer id) {
        Policy policy = policyRepository.findById(id)
                .orElseThrow(() -> new PolicyNotFoundException("找不到保單，id = " + id));

        return PolicyDtoMapper.toResponse(policy);
    }

    public PolicyResponse createPolicy(CreatePolicyRequest request) {
        validateCreatePolicyRequest(request);

        Customer customer = customerRepository.findById(request.getCustomerId())
                .orElseThrow(() -> new CustomerNotFoundException("找不到客戶，id = " + request.getCustomerId()));

        Policy policy = PolicyDtoMapper.toEntity(request, customer);

        Policy savedPolicy = policyRepository.save(policy);

        return PolicyDtoMapper.toResponse(savedPolicy);
    }

    public PolicyResponse cancelPolicy(Integer id) {
        Policy policy = policyRepository.findById(id)
                .orElseThrow(() -> new PolicyNotFoundException("找不到保單，id = " + id));

        if (policy.getStatus() == PolicyStatus.CANCELLED) {
            throw new InvalidPolicyException("保單已經取消，不能重複取消");
        }

        policy.setStatus(PolicyStatus.CANCELLED);

        Policy savedPolicy = policyRepository.save(policy);

        return PolicyDtoMapper.toResponse(savedPolicy);
    }

    private void validateCreatePolicyRequest(CreatePolicyRequest request) {
        if (request.getCustomerId() == null) {
            throw new InvalidPolicyException("客戶 ID 不能為空");
        }

        if (request.getPolicyNo() == null || request.getPolicyNo().isBlank()) {
            throw new InvalidPolicyException("保單號碼不能為空");
        }

        if (request.getProductName() == null || request.getProductName().isBlank()) {
            throw new InvalidPolicyException("商品名稱不能為空");
        }

        if (request.getPremium() == null || request.getPremium() <= 0) {
            throw new InvalidPolicyException("保費必須大於 0");
        }

        if (request.getInsuredAmount() == null || request.getInsuredAmount() <= 0) {
            throw new InvalidPolicyException("保額必須大於 0");
        }

        if (request.getStartDate() == null) {
            throw new InvalidPolicyException("開始日期不能為空");
        }

        if (request.getEndDate() == null) {
            throw new InvalidPolicyException("結束日期不能為空");
        }

        if (request.getEndDate().isBefore(request.getStartDate())) {
            throw new InvalidPolicyException("結束日期不能早於開始日期");
        }
    }

}

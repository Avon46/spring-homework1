package com.example.demo.mapper;

import com.example.demo.dto.CreatePolicyRequest;
import com.example.demo.dto.PolicyResponse;
import com.example.demo.entity.Customer;
import com.example.demo.entity.Policy;
import com.example.demo.enums.PolicyStatus;

public class PolicyDtoMapper {

    public static Policy toEntity(CreatePolicyRequest request, Customer customer) {
        return new Policy(
                request.getPolicyNo(),
                customer,
                request.getProductName(),
                request.getPremium(),
                request.getInsuredAmount(),
                request.getStartDate(),
                request.getEndDate(),
                PolicyStatus.ACTIVE);
    }

    public static PolicyResponse toResponse(Policy policy) {
        return new PolicyResponse(
                policy.getId(),
                policy.getPolicyNo(),
                policy.getCustomer().getId(),
                policy.getCustomer().getName(),
                policy.getProductName(),
                policy.getPremium(),
                policy.getInsuredAmount(),
                policy.getStartDate(),
                policy.getEndDate(),
                policy.getStatus());
    }
}
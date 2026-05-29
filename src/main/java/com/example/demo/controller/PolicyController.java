package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.CreatePolicyRequest;
import com.example.demo.dto.PolicyResponse;
import com.example.demo.service.PolicyService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/policies")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173")
public class PolicyController {

    private final PolicyService policyService;

    @GetMapping
    public List<PolicyResponse> getAllPolicies() {
        return policyService.getAllPolicies();
    }

    @GetMapping("/{id}")
    public PolicyResponse getPolicyById(@PathVariable Integer id) {
        return policyService.getPolicyById(id);
    }

    @PostMapping
    public ResponseEntity<PolicyResponse> createPolicy(@RequestBody CreatePolicyRequest request) {
        PolicyResponse response = policyService.createPolicy(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PatchMapping("/{id}/cancel")
    public PolicyResponse cancelPolicy(@PathVariable Integer id) {
        return policyService.cancelPolicy(id);
    }
}
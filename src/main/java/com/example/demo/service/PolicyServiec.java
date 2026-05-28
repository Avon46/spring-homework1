package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.mapper.PolicyMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PolicyServiec {
    private final PolicyMapper policyMapper;
}

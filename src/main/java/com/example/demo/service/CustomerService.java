package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.CreateCustomerRequest;
import com.example.demo.entity.Customer;
import com.example.demo.enums.CustomerStatus;
import com.example.demo.exception.CustomerNotFoundException;
import com.example.demo.exception.InvalidCustomerException;
import com.example.demo.repository.CustomerRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer getByIdCustomer(Integer id) {
        return customerRepository.findById(id)
                .orElseThrow(() -> new CustomerNotFoundException("找不到客戶id = " + id));
    }

    public Customer createCustomer(CreateCustomerRequest ccr) {
        if (ccr.getName() == null || ccr.getName().isBlank()) {
            throw new InvalidCustomerException("客戶姓名不能為空");
        }

        if (ccr.getIdentityNumber() == null || ccr.getIdentityNumber().isBlank()) {
            throw new InvalidCustomerException("身分證字號不能為空");
        }

        Customer customer = new Customer(
                ccr.getName(),
                ccr.getPhone(),
                ccr.getEmail(),
                ccr.getIdentityNumber(),
                ccr.getBirthday(),
                CustomerStatus.ACTIVE);

        return customerRepository.save(customer);
    }

    public Customer updateCustomer(Integer id, CreateCustomerRequest ccr) {
        Customer customer = customerRepository.findById(id)
                .orElseThrow(() -> new CustomerNotFoundException("找不到客戶，id = " + id));

        if (ccr.getName() == null || ccr.getName().isBlank()) {
            throw new InvalidCustomerException("客戶姓名不能為空");
        }

        customer.setName(ccr.getName());
        customer.setPhone(ccr.getPhone());
        customer.setEmail(ccr.getEmail());
        customer.setBirthday(ccr.getBirthday());

        return customerRepository.save(customer);
    }

    public void deleteCustomer(Integer id) {
        Customer customer = customerRepository.findById(id)
                .orElseThrow(() -> new CustomerNotFoundException("找不到客戶，id = " + id));

        customerRepository.delete(customer);
    }
}
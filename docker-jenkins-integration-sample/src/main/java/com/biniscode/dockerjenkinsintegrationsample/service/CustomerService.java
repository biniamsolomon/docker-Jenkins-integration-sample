package com.biniscode.dockerjenkinsintegrationsample.service;

import com.biniscode.dockerjenkinsintegrationsample.entity.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    public Customer register() {
        return new Customer("1234","bin");
    }
}

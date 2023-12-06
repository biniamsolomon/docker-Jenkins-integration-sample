package com.biniscode.dockerjenkinsintegrationsample.controller;

import com.biniscode.dockerjenkinsintegrationsample.entity.Customer;
import com.biniscode.dockerjenkinsintegrationsample.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/a1")
    public Customer customer(){
        return customerService.register();
    }
}

package com.biniscode.dockerjenkinsintegrationsample.controller;

import com.biniscode.dockerjenkinsintegrationsample.entity.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping("/a1")
    public Customer customer(){
        return new Customer("1234", "Bekele");
    }
}

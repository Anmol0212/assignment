package com.login.login.service;

import com.login.login.entity.Register;
import com.login.login.externalservice.RegisterService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService{


    @Autowired
    private RegisterService registerService;


    @Override
    public String getAddresss(String email, String password) {
       Register register= registerService.Validate(email, password);
        return register.getAddress();
    }
}

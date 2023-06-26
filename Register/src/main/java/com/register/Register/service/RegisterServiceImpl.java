package com.register.Register.service;

import com.register.Register.entity.Register;
import com.register.Register.exception.ResourceNotFoundException;
import com.register.Register.repository.RegisterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class RegisterServiceImpl implements RegisterService{
    @Autowired
    private RegisterRepo registerRepo;

    @Override
    public Register registration(Register register)  {
        boolean register1=registerRepo.findById(register.getEmail()).isPresent();
        if(register1)
        {
            throw new ResourceNotFoundException("email ID already present");

        }
        else {
            return registerRepo.save(register);
        }
    }

    @Override
    public void deleteData(String email) {
       Register register= registerRepo.findById(email).orElseThrow(()->new ResourceNotFoundException("email id not found"));
       registerRepo.delete(register);

    }

    @Override
    public Register login(String email, String password){
        Register register= registerRepo.findById(email).orElseThrow(()->new ResourceNotFoundException("email id not found"));
        if(password.equals(register.getPassword()))
        {return register ;}
        else {
            throw new ResourceNotFoundException("wrong password ");

        }

    }




}

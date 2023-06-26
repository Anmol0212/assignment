package com.register.Register.service;

import com.register.Register.entity.Register;

import java.io.IOException;

public interface RegisterService {
    Register registration(Register register);
    void deleteData(String email);




    Register login(String email,String password);




}

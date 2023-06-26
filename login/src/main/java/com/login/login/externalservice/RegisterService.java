package com.login.login.externalservice;

import com.login.login.entity.Register;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "Register", url = "http://localhost:9091")
public interface RegisterService {



    @GetMapping(value = "/register/")
    Register Validate(@RequestParam String email, @RequestParam String password);


}

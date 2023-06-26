package com.register.Register.controller;

import com.register.Register.entity.Register;
import com.register.Register.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/register")
public class RegisterController {
    @Autowired
    private RegisterService registerService;


   @PostMapping("/add")
    public ResponseEntity<Register> Registration(@RequestBody Register register) {
       Register register1=registerService.registration(register);
       return ResponseEntity.status(HttpStatus.CREATED).body(register1);

   }

   @GetMapping("/")
   public ResponseEntity<Register> Validate(@RequestParam String email,@RequestParam String password){
       Register register=registerService.login(email, password);
       return ResponseEntity.ok(register);


   }


    @DeleteMapping("/{email}")
    public String deleteData(@PathVariable("email") String email){


        registerService.deleteData(email);

        return "deleted";

    }

}

package com.register.Register.repository;

import com.register.Register.entity.Register;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterRepo extends JpaRepository<Register,String> {
}

package com.hopmafoti.demo.demo.repository;




import com.hopmafoti.demo.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}


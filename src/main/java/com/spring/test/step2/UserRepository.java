package com.spring.test.step2;

import com.spring.test.step2.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
package com.example.finalwork.actions;

import com.example.finalwork.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAction extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

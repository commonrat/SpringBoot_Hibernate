package com.example.hibernate.repository;

import com.example.hibernate.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,String> {
    public List<User> findAll();
    public Optional<User> findById(String id);
}

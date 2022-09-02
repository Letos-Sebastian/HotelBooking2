package com.example.hotelbooking2.service;

import com.example.hotelbooking2.entity.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public interface UserService {

    public List<User> findAll();
    public User findByEmail(String email);
    public void save(User theUser);

    public void delete(User theUser);

}

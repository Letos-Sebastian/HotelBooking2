package com.example.hotelbooking2.service;

import com.example.hotelbooking2.entity.User;
import com.example.hotelbooking2.entity.View;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ViewService {

    public List<View> findAll();
    public void save(View theView);
    public void delete(View theView);
    
}

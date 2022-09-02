package com.example.hotelbooking2.service;

import com.example.hotelbooking2.entity.View;
import com.example.hotelbooking2.repository.ViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViewServiceImpl implements ViewService{

    private ViewRepository viewRepository;
    @Autowired
    public ViewServiceImpl(ViewRepository theViewRepository){
        viewRepository=theViewRepository;
    }
    @Override
    public List<View> findAll() {
        return viewRepository.findAll();
    }

    @Override
    public void save(View theView) {
        viewRepository.save(theView);
    }

    @Override
    public void delete(View theView) {
        viewRepository.delete(theView);
    }
}

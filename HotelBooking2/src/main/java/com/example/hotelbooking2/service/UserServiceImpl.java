package com.example.hotelbooking2.service;

import com.example.hotelbooking2.entity.User;
import com.example.hotelbooking2.repository.HotelRepository;
import com.example.hotelbooking2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;;

@Service
public class UserServiceImpl implements UserService{



    ////////////////////////////// Constructor Injection //////////////////////////////
    private UserRepository userRepository;
    @Autowired
    public UserServiceImpl(UserRepository theUserRepository){
        userRepository = theUserRepository;
    }

    private HotelRepository hotelRepository;
    public UserServiceImpl(HotelRepository theHotelRepository)
    {
        hotelRepository = theHotelRepository;
    }


    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }


    @Override
    public void save(User theUser) {
        userRepository.save(theUser);
    }

    @Override
    public void delete(User theUser) {
        userRepository.delete(theUser);
    }

}

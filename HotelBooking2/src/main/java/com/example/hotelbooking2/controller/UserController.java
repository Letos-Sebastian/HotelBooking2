package com.example.hotelbooking2.controller;

import com.example.hotelbooking2.entity.Hotel;
import com.example.hotelbooking2.entity.User;
import com.example.hotelbooking2.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    private UserServiceImpl userService;
    @Autowired
    public UserController(UserServiceImpl theUserService){
        userService = theUserService;
    }

    /////#####----- GET "/users" - get all users
    @GetMapping("/users")
    public List<User> findAll(){
        return userService.findAll();
    }

    /////#####----- POST "/user/register" - add a new user
    @PostMapping("/user/register")
    public User addUser(@RequestBody User theUser){
        System.out.println("pass bd inainte "+theUser.getPassword());
        String encodedPassword = Base64.getEncoder().encodeToString(theUser.getPassword().getBytes());
        theUser.setPassword(encodedPassword);
        theUser.setId(0);
        userService.save(theUser);
        System.out.println("user: " + theUser.getEmail() + " ," + theUser.getPassword());
        return theUser;
    }

    /////#####----- POST "/user/login"
    // Step 1: check if user exist in DB ( email & password )
    // Step 2:
    //          if email is OK but password NO => 401 Unauthorized
    //          if email is OK but password OK => 200 OK
    //          if email is NO => 404 Not found


    /////#####----- POST "/user/login" - login user
    @PostMapping("/user/login")
    public ResponseEntity checkUser(@RequestBody User theUser){
        List<User> users = userService.findAll();
        System.out.println("parola data de user pentru login "+theUser.getPassword());

        for(User other : users){
            if(other.equals(theUser)){
                return new ResponseEntity(HttpStatus.OK);
            }
        }
        return new ResponseEntity(HttpStatus.UNAUTHORIZED);
    }

    /////#####----- PATCH "/user/changePassword/{email}" - change password on a given email

    // Step 1: check if user exist in DB
    // Step 2: store old password
    // Step 3: encode new password
    // Step 4: set new password and save in DB
    @PatchMapping("/user/changePassword/{email}")
    public User changePassword(@PathVariable String email, @RequestBody User user) {
        User theUser = userService.findByEmail(email);
        if(theUser == null){
            throw new RuntimeException("User not found!");
        }
        System.out.println("current pass in db " + theUser.getPassword());
        System.out.println(user.getPassword());
        String encodedPassword = Base64.getEncoder().encodeToString(user.getPassword().getBytes());
        theUser.setPassword(encodedPassword);
        System.out.println("pass after change: " + theUser.getPassword());
        System.out.println("decode: "+new String(Base64.getDecoder().decode(theUser.getPassword())));
        userService.save(theUser);
        return theUser;
    }

}

package com.hr.JournalApplicationEngDigest.controller;


import com.hr.JournalApplicationEngDigest.model.UserLoginRequest;
import com.hr.JournalApplicationEngDigest.model.UserRequest;
import com.hr.JournalApplicationEngDigest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping("/test-api")
    public ResponseEntity<String> testt(){
        return new ResponseEntity<>("Test API working", HttpStatus.ACCEPTED);

    }
    
    @PostMapping("/addUser")
    public ResponseEntity<String> addUser(@RequestBody UserRequest userRequest){
        String userMessage = userService.addUser(userRequest);
        return new ResponseEntity<>(userMessage, HttpStatus.CREATED);
    }




    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody UserLoginRequest userLoginRequest){
        String loginMessage = userService.userLogin(userLoginRequest);
        
        return new ResponseEntity<>(loginMessage, HttpStatus.ACCEPTED);
    }

    

    



}

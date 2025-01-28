package com.hr.JournalApplicationEngDigest.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.JournalApplicationEngDigest.entity.User;
import com.hr.JournalApplicationEngDigest.model.UserLoginRequest;
import com.hr.JournalApplicationEngDigest.model.UserRequest;
import com.hr.JournalApplicationEngDigest.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;


    @Override
    public String addUser(UserRequest userRequest) {

        // Create User using UserRequest
        User myUser = User.builder()
                .UserName(userRequest.getName())
                .UserEmail(userRequest.getEmail())
                .UserPassword(userRequest.getPassword())
                .build();
        // User newUser = new User("Test User","testuser123@testmail.com","1234");
        // Add User to repo

        userRepository.save(myUser);

        return "User Registered successfully";
    }


    @Override
    public String userLogin(UserLoginRequest userLoginRequest) {
        // Check if user exists
        User user = userRepository.findByEmail(userLoginRequest.getEmail());
        if(user==null){
            return "USER NOT FOUND";
        }
        if(user.getUserPassword() == userLoginRequest.getPassword()){
            return "SUCCESS";
        }
        else{
            return "FAILED";
        }


    }


    @Override
    public String deleteUser(Integer id) {
        
        User myUser = userRepository.findById(id).get();
        if(myUser == null){
            return "USER DOES NOT EXIST";
        }
        try{
            userRepository.delete(myUser);
        }
        catch(Exception e){

        }
        return "USER DELETED SUCCESSFULLY";
    }


    
}

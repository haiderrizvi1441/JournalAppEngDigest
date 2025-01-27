package com.hr.JournalApplicationEngDigest.service;


import com.hr.JournalApplicationEngDigest.entity.User;
import com.hr.JournalApplicationEngDigest.model.UserRequest;
import com.hr.JournalApplicationEngDigest.model.UserResponse;
import com.hr.JournalApplicationEngDigest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public String addUser(UserRequest userRequest) {

        // Create User using UserRequest
        User myUser = User.builder()
                .UserName(userRequest.getUsername())
                .UserEmail(userRequest.getUseremail())
                .UserPassword(userRequest.getUserpassword())
                .build();
        User newUser = new User("Haider","h@gmail.com","1234");
        // Add User to repo
        userRepository.save(newUser);

        return "User added successfully";
    }
}

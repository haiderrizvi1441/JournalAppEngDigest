package com.hr.JournalApplicationEngDigest.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {


    @GetMapping("/test-api")
    public ResponseEntity<String> testt(){
        return new ResponseEntity<>("Test API working", HttpStatus.ACCEPTED);

    }



}

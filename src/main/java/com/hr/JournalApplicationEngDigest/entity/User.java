package com.hr.JournalApplicationEngDigest.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.naming.Name;

@Entity
@Table(name="Users")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int UserId;

    @Column(name = "name")
    private String UserName;

    @Column(name = "email")
    private String UserEmail;

    @Column(name = "password")
    private String UserPassword;

    public User(String name,String email, String password){}


}

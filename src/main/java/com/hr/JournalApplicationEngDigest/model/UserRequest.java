package com.hr.JournalApplicationEngDigest.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class UserRequest {


    private String name;
    private String email;
    private String password;
}

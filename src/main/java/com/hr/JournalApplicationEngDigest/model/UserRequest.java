package com.hr.JournalApplicationEngDigest.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserRequest {


    private String Username;
    private String Useremail;
    private String Userpassword;
}

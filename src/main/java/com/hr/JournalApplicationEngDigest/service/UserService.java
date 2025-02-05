package com.hr.JournalApplicationEngDigest.service;

import com.hr.JournalApplicationEngDigest.model.UserLoginRequest;
import com.hr.JournalApplicationEngDigest.model.UserRequest;

public interface UserService {

    String addUser(UserRequest userRequest);

    String userLogin(UserLoginRequest userLogin);

    String deleteUser(Integer id);

}

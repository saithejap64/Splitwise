package com.saitheja.Splitwise.service;


import com.saitheja.Splitwise.entity.User;

public interface UserService {
    User signup(String name, String email, String password);
    User login(String email, String password);
}

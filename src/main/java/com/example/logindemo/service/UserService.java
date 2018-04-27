package com.example.logindemo.service;

import com.example.logindemo.model.User;

public interface UserService {
    public User findUserByEmail(String email);
    public void saveUser(User user);
}

package com.example.springbootdockermysql.service;

import com.example.springbootdockermysql.dto.UserDTO;
import com.example.springbootdockermysql.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User getByUserId(Long id);

    List<User> getUsers();

    User createUser(UserDTO userDTO);

    User updateUser(Long id, UserDTO userDTO);

    void deleteUser(Long id);


}

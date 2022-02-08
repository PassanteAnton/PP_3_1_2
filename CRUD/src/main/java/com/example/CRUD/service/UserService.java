package com.example.CRUD.service;

import com.example.CRUD.models.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    boolean saveUser(User user, int role);
    List<User> getAllUser();
    User findById(Long id);
    boolean updateUser( User user);
    boolean deleteUser(Long ID);
    List<User> userGtList(Long idMin);
}

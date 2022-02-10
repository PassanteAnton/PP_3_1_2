package com.example.CRUD.service;

import com.example.CRUD.models.Role;

import java.util.List;

public interface RoleService {
    void saveRole(Role role);
    List<Role> getAllRoles();
    Role findById(Long id);
}

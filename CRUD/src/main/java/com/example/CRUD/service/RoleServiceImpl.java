package com.example.CRUD.service;

import com.example.CRUD.models.Role;
import com.example.CRUD.userrepository.RolesRepository;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService{
    RolesRepository rolesRepository;

    @Override
    public void saveRole(Role role) {
        rolesRepository.save(role);
    }

    public RoleServiceImpl(RolesRepository rolesRepository) {
        this.rolesRepository = rolesRepository;
    }
}

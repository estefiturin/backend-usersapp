package com.estefiturin.backend.userapp.backendusersapp.services;

import java.util.List;
import java.util.Optional;

import com.estefiturin.backend.userapp.backendusersapp.models.entities.User;

public interface UserService {
    

    List<User> findAll();

    Optional<User> findById(Long id);

    User save(User user);

    Optional<User> update(User user, Long id);

    void remove(Long id);
}

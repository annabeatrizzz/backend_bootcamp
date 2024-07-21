package me.dio.santander_coders_challenge.service;

import me.dio.santander_coders_challenge.domain.model.Users;

public interface UserService {
    Users findById(Long id);

    Users create(Users userToCreate);
}
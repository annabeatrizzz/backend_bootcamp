package me.dio.santander_coders_challenge.service.impl;

import me.dio.santander_coders_challenge.domain.model.Users;
import me.dio.santander_coders_challenge.domain.repository.UserRepository;
import me.dio.santander_coders_challenge.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public Users findById(Long id){
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Users create(Users userToCreate){
        if(userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())){
            throw new IllegalArgumentException("This user id already exists");
        }else if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("This account number already exists");
        }

        return userRepository.save(userToCreate);
    }
}
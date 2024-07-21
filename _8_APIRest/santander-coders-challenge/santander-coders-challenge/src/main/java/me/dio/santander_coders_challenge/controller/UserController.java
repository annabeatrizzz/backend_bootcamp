package me.dio.santander_coders_challenge.controller;

import me.dio.santander_coders_challenge.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import me.dio.santander_coders_challenge.domain.model.Users;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Users> findById(@PathVariable Long id){
        var user = userService.findById(id);

        return ResponseEntity.ok(user);
    }

    @PostMapping
    public ResponseEntity<Users> create(@RequestBody Users userToCreate){
        var userCreated = userService.create(userToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(userCreated.getAccount())
                .toUri();
        return ResponseEntity.created(location).body(userCreated);
    }
}
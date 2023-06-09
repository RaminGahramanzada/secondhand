package com.company.secondhand.user.controller;

import com.company.secondhand.user.model.User;
import com.company.secondhand.user.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody CreateUserRequest userRequest) {
        return ResponseEntity.ok(userService.createUser(userRequest));
    }

    @PutMapping("/{id}")
    public  ResponseEntity<User> updateUser(@RequestBody UpdateUserRequest updateUserRequest){
        return  ResponseEntity.ok(userService.updateUser(updateUserRequest));
    }
    @PatchMapping("/{id}")
     public ResponseEntity<Void> deactiveUser(@PathVariable("id") Long id){
       userService.deactiveUser(id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")

    public ResponseEntity<Void>deleteUser(@PathVariable("id") Long id){
        userService.deleteUser(id);
        return ResponseEntity.ok().build();
    }


}

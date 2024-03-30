package com.hopmafoti.demo.demo.controller;

import com.hopmafoti.demo.demo.dto.Userdto;
import com.hopmafoti.demo.demo.entity.User;
import com.hopmafoti.demo.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
@RequestMapping("api/users")
public class UserController {


    private ModelMapper modelMapper;

    private UserService userService;

    // build create User REST API
    @PostMapping
    public ResponseEntity<Userdto> createUser(@RequestBody Userdto userdto){

        User userRequest = modelMapper.map(userdto , User.class);

        //convert dto to entity
        User savedUser = userService.createUser(userRequest);

        //convert entity to dto
       Userdto userResponse = modelMapper.map(savedUser,Userdto.class);


        return new ResponseEntity<>(userResponse, HttpStatus.CREATED);
    }


    // build get user by id REST API
    // http://localhost:8080/api/users/1

    @GetMapping("{id}")
    public ResponseEntity<Userdto> getUserById(@PathVariable("id") long id){

        User user = userService.getUserById(id);
        //convert entity to dto
        Userdto postResponse = modelMapper.map(user , Userdto.class);


        return  ResponseEntity.ok().body(postResponse);
    }

    // Build Get All Users REST API
    // http://localhost:8080/api/users


    @GetMapping
    public List<Userdto> getAllUsers(){
        return userService.getAllUsers().stream().map
                        (post -> modelMapper.map(post, Userdto.class))
                .collect(Collectors.toList());
    }

    // Build Update User REST API

    @PutMapping("{id}")

    // http://localhost:8080/api/users/1

    public ResponseEntity<Userdto> updateUser(@PathVariable("id") Long id,
                                              @RequestBody Userdto userdto){
        //convert dto to entity
        User userRequest = modelMapper.map(userdto, User.class);

        User updatedUser = userService.updateUser(userRequest);

        //entity to dto
        Userdto postResponse = modelMapper.map(updatedUser, Userdto.class);

        return ResponseEntity.ok().body(postResponse);
    }

    // Build Delete User REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long id){
        userService.deleteUser(id);

        return new ResponseEntity<>("User successfully deleted!", HttpStatus.OK);
    }
}


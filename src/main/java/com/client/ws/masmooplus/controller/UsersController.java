package com.client.ws.masmooplus.controller;

import com.client.ws.masmooplus.dto.UsersDto;
import com.client.ws.masmooplus.model.Users;
import com.client.ws.masmooplus.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UsersController {


    private final UserService userService;

    public UsersController(UserService userService){
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<Users>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(userService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Users> findById(@PathVariable("id") Long id){
        return ResponseEntity.status(HttpStatus.OK).body(userService.findById(id));
    }

    @PostMapping("/save")
    public ResponseEntity<Users> save(@Valid @RequestBody UsersDto dto){
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(dto));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Users> update(@Valid @RequestBody UsersDto dto, @PathVariable("id") Long id){
        return ResponseEntity.status(HttpStatus.OK).body(userService.update(dto, id));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id){
        userService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }


}

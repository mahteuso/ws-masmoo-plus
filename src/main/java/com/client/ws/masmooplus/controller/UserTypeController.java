package com.client.ws.masmooplus.controller;

import com.client.ws.masmooplus.model.UserType;
import com.client.ws.masmooplus.service.UserTypeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user-type")
public class UserTypeController {

    private final UserTypeService userTypeService;

    public UserTypeController(UserTypeService userTypeService){
        this.userTypeService = userTypeService;
    }

    @GetMapping
    public ResponseEntity<List<UserType>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(userTypeService.findAll());
    }
}

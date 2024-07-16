package com.client.ws.masmooplus.controller;

import com.client.ws.masmooplus.dto.UserTypeDto;
import com.client.ws.masmooplus.model.UserType;
import com.client.ws.masmooplus.service.UserTypeService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public ResponseEntity<UserType> findById(@PathVariable("id") Long id){
        return ResponseEntity.status(HttpStatus.OK).body(userTypeService.findById(id));
    }


    @PostMapping("/save")
    public ResponseEntity<UserType> save(@RequestBody UserTypeDto dto){
        return ResponseEntity.status(HttpStatus.OK).body(userTypeService.save(dto));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<UserType> update(@RequestBody UserTypeDto dto, @PathVariable("id") Long id){
        return ResponseEntity.status(HttpStatus.OK).body(userTypeService.update(dto, id));
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id){
        userTypeService.delete(id);
    }

}

package com.client.ws.masmooplus.controller;


import com.client.ws.masmooplus.dto.SubscriptionsTypeDto;
import com.client.ws.masmooplus.model.SubscriptionsType;
import com.client.ws.masmooplus.service.SubscriptionsTypeService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("subscriptions-type")
public class SubscriptionsTypeController {

    private final SubscriptionsTypeService subscriptionsTypeService;

    public SubscriptionsTypeController(SubscriptionsTypeService subscriptionsTypeService){
        this.subscriptionsTypeService = subscriptionsTypeService;
    }

    @GetMapping
    public ResponseEntity<List<SubscriptionsType>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(subscriptionsTypeService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SubscriptionsType> findById(@PathVariable("id") Long id){
        return ResponseEntity.status(HttpStatus.OK).body(subscriptionsTypeService.findById(id));
    }

    @PostMapping("/save")
    public ResponseEntity<SubscriptionsType> save(@Valid @RequestBody SubscriptionsTypeDto dto){
        return ResponseEntity.status(HttpStatus.OK).body(subscriptionsTypeService.save(dto));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<SubscriptionsType> update(@RequestBody SubscriptionsTypeDto dto, @PathVariable("id") Long id){
        return ResponseEntity.status(HttpStatus.OK).body(subscriptionsTypeService.update(dto, id));
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id){
        subscriptionsTypeService.delete(id);
    }

}

package com.client.ws.masmooplus.service;


import com.client.ws.masmooplus.model.Users;

import java.util.List;

public interface UserService {

    Users save(Users users);

    List<Users> findAll();

    Users findById(Long id);

    Users update(Users users, Long id);

    void delete(Long id);
}

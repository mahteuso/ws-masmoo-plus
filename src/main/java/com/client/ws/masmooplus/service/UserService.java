package com.client.ws.masmooplus.service;


import com.client.ws.masmooplus.dto.UsersDto;
import com.client.ws.masmooplus.model.Users;

import java.util.List;

public interface UserService {

    Users save(UsersDto dto);

    List<Users> findAll();

    Users findById(Long id);

    Users update(UsersDto dto, Long id);

    void delete(Long id);
}

package com.client.ws.masmooplus.service;


import com.client.ws.masmooplus.dto.UserTypeDto;
import com.client.ws.masmooplus.model.UserType;

import java.util.List;

public interface UserTypeService {

    UserType save(UserTypeDto dto);

    List<UserType> findAll();

    UserType findById(Long id);

    UserType update(UserTypeDto dto, Long id);

    void delete(Long id);
}

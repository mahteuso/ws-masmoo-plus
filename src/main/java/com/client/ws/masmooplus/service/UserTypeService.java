package com.client.ws.masmooplus.service;


import com.client.ws.masmooplus.model.UserType;

import java.util.List;

public interface UserTypeService {

    UserType save(UserTypeService userType);

    List<UserType> findAll();

    UserType findById(Long id);

    UserType update(UserType userType, Long id);

    void delete(Long id);
}

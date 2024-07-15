package com.client.ws.masmooplus.service.impl;

import com.client.ws.masmooplus.model.UserType;
import com.client.ws.masmooplus.repository.UserTypeRepository;
import com.client.ws.masmooplus.service.UserTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserTypeServiceImpl implements UserTypeService {

    @Autowired
    private UserTypeRepository userTypeRepository;

    @Override
    public UserType save(UserTypeService userType) {
        return null;
    }

    @Override
    public List<UserType> findAll() {
        return userTypeRepository.findAll();
    }

    @Override
    public UserType findById(Long id) {
        return null;
    }

    @Override
    public UserType update(UserType userType, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}

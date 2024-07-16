package com.client.ws.masmooplus.service.impl;

import com.client.ws.masmooplus.dto.UserTypeDto;
import com.client.ws.masmooplus.exception.BadRequestException;
import com.client.ws.masmooplus.exception.NotFoundException;
import com.client.ws.masmooplus.mapper.UserTypeMapper;
import com.client.ws.masmooplus.model.UserType;
import com.client.ws.masmooplus.repository.UserTypeRepository;
import com.client.ws.masmooplus.service.UserTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserTypeServiceImpl implements UserTypeService {

    @Autowired
    private UserTypeRepository userTypeRepository;

    @Override
    public UserType save(UserTypeDto dto) {
        if (Objects.nonNull(dto.getId())){
            throw new BadRequestException("Id must be null");
        }
        return userTypeRepository.save(UserTypeMapper.fromDtoToEntity(dto));
    }

    @Override
    public List<UserType> findAll() {
        return userTypeRepository.findAll();
    }

    @Override
    public UserType findById(Long id) {
        Optional<UserType> opt = userTypeRepository.findById(id);
        if (opt.isEmpty()) {
            throw new NotFoundException("UserType not found");
        }
        return opt.get();
    }

    @Override
    public UserType update(UserTypeDto dto, Long id) {
        Optional<UserType> opt = userTypeRepository.findById(id);
        if (opt.isEmpty()) {
            throw new NotFoundException("UserType not found");
        }
        return userTypeRepository.save(UserTypeMapper.fromDtoToEntity(dto));
    }

    @Override
    public void delete(Long id) {
        Optional<UserType> opt = userTypeRepository.findById(id);
        if (opt.isEmpty()) {
            throw new NotFoundException("UserType not found");
        }
        userTypeRepository.deleteById(id);
    }
}

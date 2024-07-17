package com.client.ws.masmooplus.service.impl;

import com.client.ws.masmooplus.dto.UserPaymentInfoDto;
import com.client.ws.masmooplus.exception.BadRequestException;
import com.client.ws.masmooplus.exception.NotFoundException;
import com.client.ws.masmooplus.mapper.UserPaymentInfoMapper;
import com.client.ws.masmooplus.model.UserPaymentInfo;
import com.client.ws.masmooplus.model.Users;
import com.client.ws.masmooplus.repository.UserPaymentInfoRepository;
import com.client.ws.masmooplus.repository.UsersRepository;
import com.client.ws.masmooplus.service.UserPaymentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserPaymentInfoImpl implements UserPaymentInfoService {

    @Autowired
    private UserPaymentInfoRepository userPaymentInfoRepository;


    private final UsersRepository usersRepository;

    public UserPaymentInfoImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public UserPaymentInfo save(UserPaymentInfoDto dto, Users users) {
        Optional<Users> optUsers = usersRepository.findById(users.getId());
        if (optUsers.isEmpty()) {
            throw new NotFoundException("User not exists");
        }
        if (Objects.nonNull(dto.getId())) {
            throw new BadRequestException("Id must be null");
        }
        return userPaymentInfoRepository.save(UserPaymentInfoMapper.fromDtoToEntity(dto, users));
    }

    @Override
    public List<UserPaymentInfo> findAll() {
        return userPaymentInfoRepository.findAll();
    }

    @Override
    public UserPaymentInfo findById(Long id) {
        return idIsValid(id).get();
    }

    @Override
    public void delete(Long id) {
        idIsValid(id);
        userPaymentInfoRepository.deleteById(id);
    }

    public Optional<UserPaymentInfo> idIsValid(Long id) {
        Optional<UserPaymentInfo> optPaymentInfo = userPaymentInfoRepository.findById(id);
        if (optPaymentInfo.isEmpty()) {
            throw new NotFoundException("UserPaymentInfo not found");
        }
        return optPaymentInfo;
    }
}

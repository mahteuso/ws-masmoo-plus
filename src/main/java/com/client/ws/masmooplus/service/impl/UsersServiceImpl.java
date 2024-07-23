package com.client.ws.masmooplus.service.impl;

import com.client.ws.masmooplus.dto.UsersDto;
import com.client.ws.masmooplus.exception.BadRequestException;
import com.client.ws.masmooplus.exception.NotFoundException;
import com.client.ws.masmooplus.mapper.UsersMapper;
import com.client.ws.masmooplus.model.UserType;
import com.client.ws.masmooplus.model.Users;
import com.client.ws.masmooplus.repository.UserTypeRepository;
import com.client.ws.masmooplus.repository.UsersRepository;
import com.client.ws.masmooplus.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UsersServiceImpl implements UserService {

    private final UsersRepository usersRepository;
    private final UserTypeRepository userTypeRepository;

    public UsersServiceImpl(UsersRepository usersRepository, UserTypeRepository userTypeRepository) {
        this.usersRepository = usersRepository;
        this.userTypeRepository = userTypeRepository;
    }


    @Override
    public Users save(UsersDto dto) {
        if (Objects.nonNull(dto.getId())) {
            throw new BadRequestException("Id must be null!");
        }
        Optional<UserType> userTypeOpt = userTypeRepository.findById(dto.getUserTypeId());
        if (userTypeOpt.isEmpty()) {
            throw new NotFoundException("UserType not found");
        }

        Users users = UsersMapper.fromDtoToEntity(dto, userTypeOpt.get(), null);
        return usersRepository.save(users);
    }

    @Override
    public List<Users> findAll() {
        return usersRepository.findAll();
    }

    @Override
    public Users findById(Long id) {
        return idIsValid(id);
    }

    @Override
    public Users update(UsersDto dto, Long id) {
        idIsValid(id);
        Optional<UserType> userTypeOpt = userTypeRepository.findById(dto.getUserTypeId());
        if (userTypeOpt.isEmpty()) {
            throw new NotFoundException("UserType not found");
        }

        Users user = UsersMapper.fromDtoToEntity(dto, userTypeOpt.get(), null);
        return usersRepository.save(user);
    }

    @Override
    public void delete(Long id) {
        idIsValid(id);
        usersRepository.deleteById(id);
    }

    public Users idIsValid(Long id) {
        Optional<Users> userOpt = usersRepository.findById(id);
        if (userOpt.isEmpty()) {
            throw new NotFoundException("User not found");
        }
        return userOpt.get();
    }

}

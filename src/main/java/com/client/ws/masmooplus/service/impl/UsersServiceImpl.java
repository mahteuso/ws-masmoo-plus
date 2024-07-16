package com.client.ws.masmooplus.service.impl;

import com.client.ws.masmooplus.dto.UsersDto;
import com.client.ws.masmooplus.exception.BadRequestException;
import com.client.ws.masmooplus.model.Users;
import com.client.ws.masmooplus.repository.UserTypeRepository;
import com.client.ws.masmooplus.repository.UsersRepository;
import com.client.ws.masmooplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UsersServiceImpl implements UserService {

    @Autowired
    private UsersRepository usersRepository;

    private UserTypeRepository userTypeRepository;
    public UsersServiceImpl(UserTypeRepository userTypeRepository){
        this.userTypeRepository = userTypeRepository;
    }


    @Override
    public Users save(UsersDto dto) {
        if (Objects.nonNull(dto.getId())){
            throw new BadRequestException("Id must be null!");
        }
        return usersRepository.save(Users.builder().build());
    }

    @Override
    public List<Users> findAll() {
        return usersRepository.findAll();
    }

    @Override
    public Users findById(Long id) {
        Optional<Users> opt = usersRepository.findById(id);
        if (opt.isEmpty()) {
            return null;
        }
        return opt.get();
    }

    @Override
    public Users update(UsersDto dto, Long id) {
        Optional<Users> opt = usersRepository.findById(id);

        if (opt.isEmpty()) {
            return null;
        }
        return usersRepository.save(Users.builder()
                        .id(id)
                        .name(dto.getName())
                        .email(dto.getEmail())
                        .phone(dto.getPhone())
                        .cpf(dto.getCpf())
                        .dtSubscription(dto.getDtSubscription())
                        .dtExpiration(dto.getDtExpiration())
                        .userType(dto.getUserType())
                .build());
    }

    @Override
    public void delete(Long id) {
        usersRepository.deleteById(id);
    }

}

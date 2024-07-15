package com.client.ws.masmooplus.service.impl;

import com.client.ws.masmooplus.model.Users;
import com.client.ws.masmooplus.repository.UsersRepository;
import com.client.ws.masmooplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;
import java.util.Optional;

@Service
public class UsersServiceImpl implements UserService {

    @Autowired
    private UsersRepository usersRepository;


    @Override
    public Users save(Users users) {
        return null;
    }

    @Override
    public List<Users> findAll() {
        return usersRepository.findAll();
    }

    @Override
    public Users findById(Long id) {
        Optional<Users> opt = usersRepository.findById(id);
        if (opt.isEmpty()){
            return null;
        }
        return opt.get();
    }

    @Override
    public Users update(Users users, Long id) {
        Optional<Users> opt = usersRepository.findById(id);
        if (opt.isEmpty()){
            return null;
        }
        return usersRepository.save(users);
    }

    @Override
    public void delete(Long id) {
        usersRepository.deleteById(id);
    }

}

package com.client.ws.masmooplus.service.impl;

import com.client.ws.masmooplus.dto.SubscriptionsTypeDto;
import com.client.ws.masmooplus.exception.BadRequestException;
import com.client.ws.masmooplus.exception.NotFoundException;
import com.client.ws.masmooplus.mapper.SubscriptionsTypeMapper;
import com.client.ws.masmooplus.model.SubscriptionsType;
import com.client.ws.masmooplus.model.UserPaymentInfo;
import com.client.ws.masmooplus.repository.SubscriptionsTypeRepository;
import com.client.ws.masmooplus.service.SubscriptionsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class SubscriptionsTypeServiceImpl implements SubscriptionsTypeService {

    @Autowired
    private SubscriptionsTypeRepository subscriptionsTypeRepository;

    @Override
    public SubscriptionsType save(SubscriptionsTypeDto dto) {
        if (Objects.nonNull(dto.getId())) {
            throw new BadRequestException("Id must be null");
        }
        return subscriptionsTypeRepository.save(SubscriptionsTypeMapper.fromDtoToEntity(dto));
    }

    @Override
    public List<SubscriptionsType> findAll() {
        return subscriptionsTypeRepository.findAll();
    }

    @Override
    public SubscriptionsType findById(Long id) {
        return idIsValid(id).get();
    }

    @Override
    public SubscriptionsType update(SubscriptionsTypeDto dto, Long id) {
        idIsValid(id);
        return subscriptionsTypeRepository.save(SubscriptionsTypeMapper.fromDtoToEntity(dto));
    }

    @Override
    public void delete(Long id) {
        idIsValid(id);
        subscriptionsTypeRepository.deleteById(id);
    }

    public Optional<SubscriptionsType> idIsValid(Long id) {
        Optional<SubscriptionsType> opt = subscriptionsTypeRepository.findById(id);
        if (opt.isEmpty()) {
            throw new NotFoundException("SubscriptionsType not exists");
        }
        return opt;
    }
}

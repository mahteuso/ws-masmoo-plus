package com.client.ws.masmooplus.service;

import com.client.ws.masmooplus.dto.SubscriptionsTypeDto;
import com.client.ws.masmooplus.model.SubscriptionsType;

import java.util.List;

public interface SubscriptionsTypeService {

    SubscriptionsType save(SubscriptionsTypeDto dto);

    List<SubscriptionsType> findAll();

    SubscriptionsType findById(Long id);

    SubscriptionsType update(SubscriptionsTypeDto dto, Long id);

    void delete(Long id);
}

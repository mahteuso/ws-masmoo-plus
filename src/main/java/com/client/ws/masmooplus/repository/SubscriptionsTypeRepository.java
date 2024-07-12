package com.client.ws.masmooplus.repository;

import com.client.ws.masmooplus.model.SubscriptionsType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionsTypeRepository extends JpaRepository<SubscriptionsType, Long> {
}

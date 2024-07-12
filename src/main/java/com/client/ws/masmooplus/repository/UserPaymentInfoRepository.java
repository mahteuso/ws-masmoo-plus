package com.client.ws.masmooplus.repository;

import com.client.ws.masmooplus.model.UserPaymentInfo;
import com.sun.jdi.LongType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPaymentInfoRepository extends JpaRepository<UserPaymentInfo, Long> {
}

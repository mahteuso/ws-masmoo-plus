package com.client.ws.masmooplus.service;

import com.client.ws.masmooplus.model.UserPaymentInfo;

import java.util.List;

public interface UserPaymentInfoService {

    UserPaymentInfo save(UserPaymentInfo userPaymentInfo);

    List<UserPaymentInfo> findAll();

    UserPaymentInfo findById(Long id);

    void delete(Long id);
}

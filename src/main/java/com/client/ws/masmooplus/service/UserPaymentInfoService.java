package com.client.ws.masmooplus.service;

import com.client.ws.masmooplus.dto.UserPaymentInfoDto;
import com.client.ws.masmooplus.model.UserPaymentInfo;
import com.client.ws.masmooplus.model.Users;

import java.util.List;

public interface UserPaymentInfoService {

    UserPaymentInfo save(UserPaymentInfoDto dto, Users users);

    List<UserPaymentInfo> findAll();

    UserPaymentInfo findById(Long id);

    void delete(Long id);
}

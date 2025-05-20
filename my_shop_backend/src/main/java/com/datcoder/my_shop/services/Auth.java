package com.datcoder.my_shop.services;

import com.datcoder.my_shop.dto.response.ApiResponse;
import com.datcoder.my_shop.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Auth {
    @Autowired
    private AccountRepository accountRepository;

    public ApiResponse login(String username, String password) {

    }
}

package com.example.webbanhang.service;

import com.example.webbanhang.DTO.AccountDTO;
import com.example.webbanhang.entity.Account;
import com.example.webbanhang.pojo.LoginRequest;

import java.util.List;

public interface AccountService {
    List<AccountDTO> findAll();
    AccountDTO findById(String username);

    Account existsAccount(LoginRequest loginRequest);

    Account getUser(String username);

    AccountDTO create(AccountDTO AccountDto);
    AccountDTO update(AccountDTO AccountDto);
    void remove(Integer id);
}

package com.eisgroup.cb.dao;

import com.eisgroup.cb.model.Account;

import java.util.List;

/**
 * Created by Titarenko on 31.05.2017 at 14:08.
 */
public interface AccountDao extends BaseObjectDAO<Account>, LastNumberGetter {
    List<Account> getAccountByNumber(Long accountNumber);
}
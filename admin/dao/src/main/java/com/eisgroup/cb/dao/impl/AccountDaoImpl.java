package com.eisgroup.cb.dao.impl;

import com.eisgroup.cb.dao.AccountDao;
import com.eisgroup.cb.model.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Titarenko on 31.05.2017 at 14:09.
 */
@Repository
public class AccountDaoImpl extends BaseObjectDAOImpl<Account> implements AccountDao {

    AccountDaoImpl() {
        super(Account.class);
    }

    @Override
    public Long getLastNumber() {
        return entityManager.createQuery(
                "SELECT accountNumber FROM Account WHERE id = (SELECT max(id) FROM Account)", Long.class)
                .getSingleResult();
    }

    @Override
    public List<Account> getAccountByNumber(Long accountNumber) {
        return entityManager.createQuery(
                "SELECT a FROM Account a WHERE a.accountNumber=:accountNumber", Account.class)
                .setParameter("accountNumber", accountNumber)
                .getResultList();
    }
}
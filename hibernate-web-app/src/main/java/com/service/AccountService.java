package com.service;

import com.dao.AccountDao;
import com.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AccountService {

    AccountDao accountDao;

    @Autowired
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public List listAllAccounts() {
        return accountDao.listAllAccounts();
    }

    public void saveOrUpdate(Double balance, int customer_id, int branch_id) {
        accountDao.saveOrUpdate(balance, customer_id, branch_id);
    }

    public Account findAccountById(int id) {
        return accountDao.findAccountById(id);
    }

    public void deleteAccount(int id) {
        accountDao.deleteAccount(id);
    }

    public void withdraw(Account account , Double amount){

        accountDao.withdraw(account, amount);

    }

    public void deposit(Account account, Double amount){
        accountDao.deposit(account, amount);
    }

}

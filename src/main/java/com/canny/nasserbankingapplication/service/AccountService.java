package com.canny.nasserbankingapplication.service;

import com.canny.nasserbankingapplication.entity.Account;
import java.util.List;

public interface AccountService {

    Account createAccount(Account account);

    Account getAccountById(Long id);

    Account deposit(Long id, double amount);

    Account withdraw(Long id, double amount);

    List<Account> getAllAccounts();

    void deleteAccount(Long id);
}

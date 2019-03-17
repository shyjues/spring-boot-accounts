package au.com.acct.demo.controller;

import java.util.List;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import au.com.acct.demo.dto.AccountRepository;
import au.com.acct.demo.dto.AccountTransactionsRepository;
import au.com.acct.demo.exception.AccountTransNotFoundException;
import au.com.acct.demo.model.Account;
import au.com.acct.demo.model.AccountTransactions;
import lombok.extern.slf4j.Slf4j;


/**
 * 
 * Key Controller class
 * Request methods with GET method
 * /v1/ will return all the accounts 
 * /v1/<accound number> will return specific account details
 * /v1/listTransactions/<account number> will return transaction details for the specified account
 */
@Slf4j
@RestController
public class AccountController {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    AccountTransactionsRepository accountTransactionsRepository;

    @GetMapping("/")
    public List<Account> listAll() {
        return accountRepository.findAll();
    }

    @GetMapping("/{id}")
    public Account listId(@PathVariable(value = "id") Long id) throws Exception {

        Account account = accountRepository.findByAccountNumber(id);

        if (account == null)
            throw new AccountNotFoundException("Account details cannot be found for account Number: " + id);

        return account;
    }

    @GetMapping("/listTransactions/{id}")
    public List<AccountTransactions> listTransactions(@PathVariable(value = "id") Long id) throws Exception {
        List<AccountTransactions> acctTransactions = accountTransactionsRepository.findByAccountNumber(id);

        if (acctTransactions.size() == 0)
            throw new AccountTransNotFoundException("Transactions not found for account number:" + id);

        return acctTransactions;
    }

}

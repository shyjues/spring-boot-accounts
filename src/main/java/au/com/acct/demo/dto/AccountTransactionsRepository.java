package au.com.acct.demo.dto;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import au.com.acct.demo.model.AccountTransactions;

@Repository
@Transactional
public interface AccountTransactionsRepository extends JpaRepository<AccountTransactions, Long> {
    List findByAccountNumber(Long accountNumber);

}

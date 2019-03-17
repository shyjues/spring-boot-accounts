package au.com.acct.demo.dto;


import au.com.acct.demo.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface AccountRepository extends JpaRepository<Account, Long> {


    List<Account> findAll();

    Account findByAccountNumber(Long accountNumber);

}

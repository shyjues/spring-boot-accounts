package au.com.acct.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "ACCOUNT_TRANSACTIONS", schema="ACCOUNT_BANKING")
@Data
public class AccountTransactions {

    @Id
    @NotNull
    @Column(name="account_number")
    public Long accountNumber;

    @NotNull
    @Size(max=50)
    @Column(name="account_name")
    public String accountName;

    @NotNull
    @Column(name="account_value_date")
    public String accountValueDate;

    @NotNull
    @Size(max=3)
    @Column(name="account_currency")
    public String accountCurrency;


    @Column(name="account_credit_amt")
    public Float accountCreditAmt;

    @Column(name="account_debit_amt")
    public Float accountDebitAmt;

    @NotNull
    @Size(max=10)
    @Column(name="account_debit_credit")
    public String accountDebitCredit;

    @Size(max=100)
    @Column(name="account_transaction_narrative")
    public String accountTransactionNarrative;

    public AccountTransactions(){
        super();
    }

}


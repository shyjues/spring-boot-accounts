package au.com.acct.demo.model;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Date;

@Entity
@Getter
@Setter
@Table(name = "ACCOUNT", schema="ACCOUNT_BANKING")
@Data
public class Account {

    @Id
    @NotNull
    @Column(name="account_number")
    public Long accountNumber;

    @NotNull
    @Size(max=50)
    @Column(name="account_name")
    public String accountName;

    @NotNull
    @Size(max=20)
    @Column(name="account_type")
    public String accountType;

    @NotNull
    @Column(name="balance_date")
    public Date balanceDate;

    @NotNull
    @Size(max=3)
    @Column(name="account_currency")
    public String accountCurrency;

    @NonNull
    @Column(name="account_balance")
    public Long accountBalance;

    public Account(){
        super();
    }

   
}

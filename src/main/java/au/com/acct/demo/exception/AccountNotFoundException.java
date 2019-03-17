package au.com.acct.demo.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class AccountNotFoundException extends  RuntimeException{

    public AccountNotFoundException(String exception ){
        super(exception);
    }

}

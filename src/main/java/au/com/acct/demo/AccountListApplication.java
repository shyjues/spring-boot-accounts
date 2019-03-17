/**
 * This is the application class of the spring boot.
 * Start from this class.
 *
 * @author Shyju E
 * @version 1.0
 */
package au.com.acct.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * Application class for starting spring-boot.
 */
@SpringBootApplication(scanBasePackages =  {"au.com.acct.demo"})
@EnableJpaRepositories
public class AccountListApplication {

    /**
     *
     * Main method for spring boot invocation.
     *
     * @param args
     */
    public static void main(String[] args) {

        SpringApplication.run(AccountListApplication.class, args);
    }

}

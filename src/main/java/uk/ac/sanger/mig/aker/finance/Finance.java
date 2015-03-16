package uk.ac.sanger.mig.aker.finance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author pi1
 * @since March 2015
 */
@SpringBootApplication
@ComponentScan
@EnableTransactionManagement
public class Finance {
	public static void main(String[] args) {
		SpringApplication.run(Finance.class, args);
	}
}

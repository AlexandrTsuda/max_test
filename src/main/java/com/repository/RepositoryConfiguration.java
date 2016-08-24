package com.repository;

import com.handler.LoanHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoryConfiguration {

    @Bean
    LoanHandler loanHandler() {
        return new LoanHandler();
    }
}

package com.handler;

import com.entity.Loan;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

@Component
@RepositoryEventHandler(Loan.class)
public class LoanHandler {

    @HandleBeforeCreate
    public void handleBeforeCreate(Loan loan) {
        System.out.print("Loan saving...");
    }
}

package org.example.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CurrentAccount extends BankAccount{
    private Integer overdraft;
    public CurrentAccount(Integer pay, String openBankAccounts, Client client) {
        super(pay, openBankAccounts, client);
       this.overdraft = 1000;
    }

}

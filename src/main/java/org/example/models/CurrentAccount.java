package org.example.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CurrentAccount extends BankAccount{
    private Integer overdraft;
    public CurrentAccount(Integer pay, String openBankAccounts, String name, String firstName) {
        super(pay, openBankAccounts, name, firstName);
       this.overdraft = 1000;
    }


}

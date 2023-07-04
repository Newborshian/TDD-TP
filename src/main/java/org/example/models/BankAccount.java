package org.example.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BankAccount extends Client {
    private Integer idBankAccount;
    private Integer pay;
    private String openBankAccount;
    private String name;
    private String firstName;


    public BankAccount(Integer pay, String openBankAccounts, String name, String firstName) {
        super(name, firstName);
        this.pay = pay;
        openBankAccount = openBankAccounts;
        this.name = name;
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "pay=" + pay +
                ", openBankAccount='" + openBankAccount + '\'' +
                ", name='" + name + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}

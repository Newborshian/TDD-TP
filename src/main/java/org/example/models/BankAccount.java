package org.example.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BankAccount {
    private Integer idBankAccount;
    private Integer pay;
    private String openBankAccount;


    public BankAccount(Integer pay, String openBankAccounts, Client client) {
        this.pay = pay;
        openBankAccount = openBankAccounts;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "idBankAccount=" + idBankAccount +
                ", pay=" + pay +
                ", OpenBankAccount=" + openBankAccount +
                '}';
    }
}

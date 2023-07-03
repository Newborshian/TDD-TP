package org.example.services;

import org.example.models.BankAccount;
import org.example.models.Client;
import org.example.models.CurrentAccount;

import java.util.List;

public interface BankAccountServices {
    void createBankAccount(BankAccount bankAccount);

    void deletedBankAccount(int id);
    List<BankAccount> bankAccountNegativePay(List<BankAccount> bankAccounts);
    List<BankAccount> findAll(List<BankAccount> bankAccount);
    void OperationsBankAccount(CurrentAccount currentAccount1, CurrentAccount currentAccount2, Integer addition);
}



package org.example.persistance;

import org.example.models.BankAccount;
import org.example.models.CurrentAccount;


import java.util.List;
import java.util.Optional;

public interface BankAccountDAO {

    void createBankAccount(BankAccount bankAccount);
    void deletedBankAccount(int id);
    List<BankAccount> bankAccountNegativePay(List<BankAccount> bankAccounts);
    List<BankAccount> findAll();
    void OperationsBankAccount(CurrentAccount bankAccount1, CurrentAccount bankAccount2, Integer addition);

}

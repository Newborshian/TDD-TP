package org.example.persistance;

import org.example.models.BankAccount;
import org.example.models.Client;
import org.example.models.CurrentAccount;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersitanceMemoryBankAccount implements BankAccountDAO{

    private static final Map<Integer, BankAccount> BANKDB = new HashMap<>();
    private static int key = 0;

    @Override
    public void createBankAccount(BankAccount bankAccount) {
        bankAccount.getFirstName();
        bankAccount.getName();
        bankAccount.setIdBankAccount(key);
        BANKDB.put(key, bankAccount);

        key++;

    }

    @Override
    public void deletedBankAccount(int id) {

        BANKDB.remove(id);
    }

    @Override
    public List<BankAccount> bankAccountNegativePay(List<BankAccount> bankAccounts) {
        return BANKDB.values().stream().toList();
    }

    @Override
    public List<BankAccount> findAll(List<BankAccount> bankAccount) {
        for (BankAccount bankAccount1 : bankAccount){
            bankAccount1.setName(bankAccount1.getName());
            bankAccount1.setFirstName(bankAccount1.getFirstName());
            bankAccount1.getFirstName();
        }
        return BANKDB.values().stream().toList();
    }

    @Override
    public void OperationsBankAccount(CurrentAccount currentAccount1, CurrentAccount currentAccount2, Integer addition) {
        BANKDB.get(currentAccount1).getPay();
        BANKDB.get(currentAccount2).getPay();
    }
}

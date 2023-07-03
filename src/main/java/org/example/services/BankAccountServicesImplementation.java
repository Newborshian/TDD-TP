package org.example.services;

import org.example.models.BankAccount;
import org.example.models.CurrentAccount;
import org.example.persistance.BankAccountDAO;
import org.example.persistance.PersitanceMemoryBankAccount;

import java.util.List;

public class BankAccountServicesImplementation implements BankAccountServices{

    BankAccountDAO dao = new PersitanceMemoryBankAccount();


    @Override
    public void createBankAccount(BankAccount bankAccount) {
      if (bankAccount != null){
          if ((!bankAccount.getOpenBankAccount().isBlank())){
              dao.createBankAccount(bankAccount);
          }
      }
    }

    @Override
    public void deletedBankAccount(int id) {

        dao.deletedBankAccount(id);
    }

    @Override
    public List<BankAccount> bankAccountNegativePay(List<BankAccount> bankAccounts) {
                return bankAccounts.stream().filter(s -> s.getPay() <= 0).toList();
    }

    @Override
    public List<BankAccount> findAll() {
        return dao.findAll();
    }

    @Override
    public void OperationsBankAccount(CurrentAccount currentAccount1, CurrentAccount currentAccount2, Integer addition) {

        if (currentAccount1.getPay() + currentAccount1.getOverdraft() >= addition) {
            currentAccount1.setPay(currentAccount1.getPay() - addition);
            currentAccount2.setPay(currentAccount2.getPay() + addition);
        } else {
            System.err.println("Le montant est supérieur au solde");
        }
    }
}

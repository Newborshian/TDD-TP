package org.example.presentation;

import org.example.models.BankAccount;
import org.example.models.Client;
import org.example.models.CurrentAccount;
import org.example.services.BankAccountServices;
import org.example.services.BankAccountServicesImplementation;
import org.example.services.ClientServices;
import org.example.services.ClientServicesImplementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProxiBanqueApp {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Implementation services
        BankAccountServices bankAccountServices = new BankAccountServicesImplementation();
        ClientServices clientServices = new ClientServicesImplementation();

        //Déclaration d'objets Clients
        Client client = new Client("Albert", "Einstein", "12 rue de Paris", 76500, "06-33-44-22-58");
        clientServices.createClient(client);
        Client client1 = new Client("Nicolas", "Tesla", "18 rue des caves", 72500, "03-78-85-52-45");
        clientServices.createClient(client1);
        Client client2 = new Client("Nicolas", "Copernic", "12 rue Charles de Gaulle", 01150, "07-52-12-78-52");
        clientServices.createClient(client2);

        //Déclarations d'objets ComptesBancaires relié au client
       CurrentAccount bankAccount = new CurrentAccount(2500, "04-11-2020", client.getName(), client.getFirstName());
       bankAccountServices.createBankAccount(bankAccount);
       CurrentAccount bankAccount1 = new CurrentAccount(5000, "11-20-1870", client1.getName(), client.getFirstName());
       bankAccountServices.createBankAccount(bankAccount1);
       CurrentAccount bankAccount2 = new CurrentAccount(0, "20-11-1987", client2.getName(), client2.getFirstName());
       bankAccountServices.createBankAccount(bankAccount2);

        //Récupère la liste de tout les clients
        List<Client> clientList = clientServices.findAll();
        System.out.println("\n" + "Liste de tout les clients : ");
        System.out.println("\n" + clientList);

        //Récupère tout les clients par ID;
        System.out.println("\n" +"Liste de client trié par ID : ");
        System.out.println("\n" + clientServices.getById(1));

        //Fonction Remove puis get de la liste de client
        System.out.println("\n" +"Liste de client obtenu après le remove par ID : ");
        System.out.println("\n" + clientServices.deleteClient(1));

        //Récupère la lsite de tout les comptes bancaires
        System.out.println("\n" + "Liste de tout les comptes bancaires : ");

        List<BankAccount> bankAccounts = new ArrayList<>();
        bankAccounts.add(0, bankAccount);
        bankAccounts.add(1, bankAccount1);
        bankAccounts.add(2, bankAccount2);

        bankAccountServices.findAll(bankAccounts);
        System.out.println("\n" + bankAccounts);

        //Récupère la liste de tout les comptes bancaire négatifs
        System.out.println("\n" + "Liste de tout les comptes bancaires négatifs");
        System.out.println( "\n" + bankAccountServices.bankAccountNegativePay(bankAccounts));

        //Virement entre compte Bancaire
        bankAccountServices.OperationsBankAccount(bankAccount2, bankAccount, 1000);
        System.out.println("\n" + "Exemple de virement entre compte courant :");
        System.out.println("\n" + bankAccount2);
        System.out.println(bankAccount);

    }

}

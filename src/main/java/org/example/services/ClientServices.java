package org.example.services;

import org.example.models.Client;

import java.util.List;
import java.util.Optional;

public interface ClientServices {
    void createClient(Client client);
    Client getById(int id);
    List<Client> findAll();
    List<Client> deleteClient(int id);
}

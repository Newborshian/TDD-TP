package org.example.persistance;

import org.example.models.Client;

import java.util.List;
import java.util.Optional;

public interface ClientDAO {

    void createClient(Client client);
    Optional<Client> getById(int id);
    List<Client> findAll();
    List<Client> deleteClient(int id);
}

package org.example.services;

import org.example.models.Client;
import org.example.persistance.ClientDAO;
import org.example.persistance.PersistanceMemoryClient;

import java.util.List;


public class ClientServicesImplementation implements ClientServices {

    ClientDAO dao = new PersistanceMemoryClient();

    @Override
    public void createClient(Client client) {

        if (client !=null){
            if ((!client.getName().isBlank())){
                dao.createClient(client);
            }
        }

    }

    @Override
    public Client getById(int id) {
        return dao.getById(id).orElse(new Client("Default", "Default", "Default", 00000, "xx-xx-xx-xx-xx"));
    }

    @Override
    public List<Client> findAll() {
        return dao.findAll();
    }

    @Override
    public List<Client> deleteClient(int id) {
        return dao.deleteClient(id);
    }
}

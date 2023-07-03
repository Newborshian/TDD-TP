package org.example.persistance;

import org.example.models.Client;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class PersistanceMemoryClient implements ClientDAO{

    private static final Map<Integer, Client> DB = new HashMap<>();
    private static int key = 0;

    @Override
    public void createClient(Client client) {

        client.setId(key);
        DB.put(key, client);

        key++;

    }

    @Override
    public Optional<Client> getById(int id) {

        return Optional.ofNullable(DB.get(id));
    }

    @Override
    public List<Client> findAll() {

        return DB.values().stream().toList();
    }

    @Override
    public List<Client> deleteClient(int id) {
        DB.remove(id);
        return DB.values().stream().toList();
    }
}

package org.example.springprojectclient.dao;

import org.example.springprojectclient.modele.Client;
import java.util.List;

public interface ClientDao {
    List<Client> findAll();
    Client findById(int id);
    Client save(Client client);
    Client update(Client client, int id);
    Client deleteById(int id);
}
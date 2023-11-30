package com.EntrainePro.projet.services.IServices;

import com.EntrainePro.projet.Entities.Client;
import com.EntrainePro.projet.Entities.Coach;

public interface IClientService {
    Client addClient(Client client);

    Client getClient(int id);

    boolean deleteClient(int id);

    Client updateClient(int id, Client client);
}

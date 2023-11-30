package com.EntrainePro.projet.services.IServicesImpl;

import com.EntrainePro.projet.Entities.Client;
import com.EntrainePro.projet.repository.IClientRepository;
import com.EntrainePro.projet.services.IServices.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IClientServiceImpl implements IClientService {
    @Autowired
    IClientRepository clientRepository;

    @Override
    public Client addClient(Client client){
        return clientRepository.save(client);
    }

    @Override
    public Client getClient(int id){
        return clientRepository.findById(id).orElse(null);
    }
    @Override
    public boolean deleteClient(int id) {
        Client client = clientRepository.findById(id).get();
        clientRepository.delete(client);
        return true;
    }

    @Override
    public Client updateClient (int id, Client client){
        Client client1 = clientRepository.findById(id).orElse(null);
        client1.setNom(client.getNom());
        client1.setPrenom(client.getPrenom());
        client1.setAdresseEmail(client.getAdresseEmail());
        client1.setMdp(client.getMdp());
        client1.setAdresse(client.getAdresse());
        client1.setNumTele(client.getNumTele());

        clientRepository.save(client1);
        return client;

    }

}

package com.EntrainePro.projet.repository;

import com.EntrainePro.projet.Entities.Client;
import org.springframework.data.repository.CrudRepository;

public interface IClientRepository extends CrudRepository<Client , Integer> {
}

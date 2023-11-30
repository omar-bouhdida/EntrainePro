package com.EntrainePro.projet.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Coach {
    @Id
    private int id;
    private String nom;
    private String prenom;
    private String adresseEmail;
    private String mdp;
    private String adresse;
    private Number numTele;

    @OneToMany(mappedBy = "coach")
    List<Client> clientList;
}

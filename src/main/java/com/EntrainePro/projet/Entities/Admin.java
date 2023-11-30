package com.EntrainePro.projet.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Admin {
    @Id
    private int id;
    private String nom;
    private String prenom;
    private String adresseEmail;
    private String mdp;
    private String adresse;
    private Number numTele;
}

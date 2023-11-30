package com.EntrainePro.projet.services.IServices;

import com.EntrainePro.projet.Entities.Coach;

public interface ICoachService {
    Coach addCoach(Coach coach);

    Coach getCoach(int id);

    boolean deleteCoach(int id);

    Coach updateCoach(int id, Coach coach);
}

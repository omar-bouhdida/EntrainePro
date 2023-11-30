package com.EntrainePro.projet.services.IServicesImpl;

import com.EntrainePro.projet.Entities.Coach;
import com.EntrainePro.projet.repository.ICoachRepository;
import com.EntrainePro.projet.services.IServices.ICoachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ICoachServiceImpl implements ICoachService {

    @Autowired
    ICoachRepository iCoachRepository;
    @Override
    public Coach addCoach(Coach coach){
        return iCoachRepository.save(coach);
    }

    @Override
    public Coach getCoach(int id){
        return iCoachRepository.findById(id).orElse(null);
    }

    @Override
    public boolean deleteCoach(int id) {
        Coach coach = iCoachRepository.findById(id).get();
        iCoachRepository.delete(coach);
        return true;
    }
    @Override
    public Coach updateCoach(int id, Coach coach) {
        Coach coach1 = iCoachRepository.findById(id).get();
        coach1.setNom(coach.getNom());
        coach1.setPrenom(coach.getPrenom());
        coach1.setAdresseEmail(coach.getAdresseEmail());
        coach1.setMdp(coach.getMdp());
        coach1.setAdresse(coach.getAdresse());
        coach1.setNumTele(coach.getNumTele());

        iCoachRepository.save(coach1);
        return coach;
    }
}

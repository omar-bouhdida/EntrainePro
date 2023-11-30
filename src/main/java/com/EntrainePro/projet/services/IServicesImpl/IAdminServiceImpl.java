package com.EntrainePro.projet.services.IServicesImpl;

import com.EntrainePro.projet.Entities.Admin;
import com.EntrainePro.projet.repository.IAdminRepository;
import com.EntrainePro.projet.services.IServices.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IAdminServiceImpl implements IAdminService {
    @Autowired
    IAdminRepository iAdminRepository;
    @Override
    public Admin addAdmin(Admin admin){
        return iAdminRepository.save(admin);
    }
    @Override
    public Admin getAdmin(int id){
        return iAdminRepository.findById(id).orElse(null);
    }
    @Override
    public boolean deleteAdmin(int id) {
        Admin admin = iAdminRepository.findById(id).get();
        iAdminRepository.delete(admin);
        return true;
    }
    @Override
    public Admin updateAdmin(int id, Admin admin){
        Admin Admin1 = iAdminRepository.findById(id).orElse(null);
        Admin1.setNom(admin.getNom());
        Admin1.setPrenom(admin.getPrenom());
        Admin1.setAdresseEmail(admin.getAdresseEmail());
        Admin1.setMdp(admin.getMdp());
        Admin1.setAdresse(admin.getAdresse());
        Admin1.setNumTele(admin.getNumTele());

        iAdminRepository.save(Admin1);
        return admin;

    }
}

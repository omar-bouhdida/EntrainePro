package com.EntrainePro.projet.services.IServices;

import com.EntrainePro.projet.Entities.Admin;

public interface IAdminService {
    Admin addAdmin(Admin admin);

    Admin getAdmin(int id);

    boolean deleteAdmin(int id);

    Admin updateAdmin(int id, Admin admin);
}

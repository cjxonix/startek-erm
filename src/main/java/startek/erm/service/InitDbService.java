/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startek.erm.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import startek.erm.entity.AccountDetails;
import startek.erm.entity.AppUser;
import startek.erm.entity.Role;
import startek.erm.repositories.AppUserRepository;
import startek.erm.repositories.RoleRepository;

/**
 *
 * @author Niwoogaba_Joel
 */
@Transactional
@Service
public class InitDbService {

    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private AppUserRepository appUserRepository;

    @PostConstruct
    public void init() {
        Role roleAdmin = new Role();
        roleAdmin.setRoleName("ROLE_ADMIN");
        roleRepository.save(roleAdmin);

        Role roleUser = new Role();
        roleUser.setRoleName("ROLE_USER");
        roleRepository.save(roleUser);

        Role rolePubliser = new Role();
        rolePubliser.setRoleName("ROLE_PUBLISHER");
        roleRepository.save(rolePubliser);

        Role roleAdvertizer = new Role();
        roleAdvertizer.setRoleName("ROLE_BRAND");
        roleRepository.save(roleAdvertizer);

        AccountDetails acc = new AccountDetails("0787888899", null, "www.startekcrop.com", "Kitagat, Sheema", null, "Uganda", "Western", "Sheema", "256");

        AppUser user = new AppUser("Eng.", "Male", "admin", "admin@xmail.com",
                "Niwoogaba", "Joel", "admin", true, new Date(), new Date());
        user.setAccountDetails(acc);
        List<Role> roles = new ArrayList<Role>();
        roles.add(roleAdmin);
        roles.add(roleUser);
        user.setRoles(roles);
        appUserRepository.save(user);

    }
}

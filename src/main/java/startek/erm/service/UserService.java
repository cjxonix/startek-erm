/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startek.erm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import startek.erm.entity.AppUser;
import startek.erm.repositories.AppUserRepository;
import startek.erm.repositories.RoleRepository;

/**
 *
 * @author Niwoogaba_Joel
 */
@Service
public class UserService {

    @Autowired
    AppUserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;

    public AppUser findOneByUsername(String name) {
        AppUser user = userRepository.findOneAppUserByUsername(name);
        return user;
    }

}

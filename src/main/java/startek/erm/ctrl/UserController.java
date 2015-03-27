package startek.erm.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import startek.erm.repositories.AppUserRepository;
import startek.erm.repositories.RoleRepository;


@Controller
public class UserController {

	@Autowired
	private AppUserRepository appUserRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	
}

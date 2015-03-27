/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startek.erm.ctrl;

import java.security.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import startek.erm.service.UserService;

/**
 *
 * @author Niwoogaba_Joel
 */
@Controller
public class LocationController {

    @Autowired
    private UserService userService;

    @RequestMapping("/region")
    public String showRegions(Model model, Principal principal) {
        String name = principal.getName();
        if (name == null) {
            System.out.println("Not loggoed in");
            return "redirect:/index.html?msg=Not-Logged-in";
        }
        System.out.println("Loged in user " + name);

        model.addAttribute("user", userService.findOneByUsername(name));
        return "region";
    }
}

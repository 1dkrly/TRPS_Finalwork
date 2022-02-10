package com.example.finalwork.controllers;

import com.example.finalwork.model.User;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {


    @GetMapping(path = "/")
    public String index(@AuthenticationPrincipal User user,
                        Model model){
        return main(user, model);
    }

    @GetMapping(path = "/main")
    public String main(@AuthenticationPrincipal User user,
            Model model) {

            model.addAttribute("subscriptions", user.getSubscriptions());
        return "main";
    }

    @PreAuthorize("hasRole(T(com.example.finalwork.model.Role).ROLE_ADMIN)")
    @GetMapping(path = "/admin")
    public String admin(){
        return "admin";
    }

}

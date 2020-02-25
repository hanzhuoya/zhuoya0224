package io.hzy.jcartadministrationback.controller;

import io.hzy.jcartadministrationback.dto.in.AdministratorLoginDTO;
import io.hzy.jcartadministrationback.dto.in.AdministratorUpdateProfileInDTO;
import io.hzy.jcartadministrationback.dto.out.AdministratorGetProfileOutDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("administrator")
public class AdministratorController {

    @GetMapping("/login")
    public String login(AdministratorLoginDTO administratorLoginDTO){
         return null;
    }

    @PostMapping("/getProfile")
    public AdministratorGetProfileOutDTO getProfile(Integer adminstratorId){
        return null;
    }

    @PostMapping("/updateProdfile")
    public void updateProdfile(AdministratorUpdateProfileInDTO administratorUpdateProfileInDTO){

    }
}

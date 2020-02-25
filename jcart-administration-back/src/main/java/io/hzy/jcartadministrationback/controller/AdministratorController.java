package io.hzy.jcartadministrationback.controller;

import io.hzy.jcartadministrationback.dto.in.*;
import io.hzy.jcartadministrationback.dto.out.AdministratorGetProfileOutDTO;
import io.hzy.jcartadministrationback.dto.out.AdministratorListOutDTO;
import io.hzy.jcartadministrationback.dto.out.AdministratorShowOutDTO;
import io.hzy.jcartadministrationback.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("administrator")
public class AdministratorController {

    @GetMapping("/login")
    public String login(AdministratorLoginDTO administratorLoginDTO){
         return null;
    }

    @PostMapping("/getProfile")
    public AdministratorGetProfileOutDTO getProfile(@RequestParam(required = false) Integer adminstratorId){
        return null;
    }

    @PostMapping("/updateProdfile")
    public void updateProdfile(AdministratorUpdateProfileInDTO administratorUpdateProfileInDTO){

    }

    @GetMapping("/getPwdResetCode")
    public String getPwdResetCode(@RequestParam String email){
        return null;
    }

    @PostMapping("/resetPwd")
    public void resetPwd(@RequestBody AdministratorResetPwdInDTO administratorResetPwdInDTO){

    }

    @GetMapping("/getList")
    public PageOutDTO<AdministratorListOutDTO> getList(@RequestParam Integer pageNum){
      return null;
    }


    @GetMapping("/getById")
    public AdministratorShowOutDTO getById(@RequestParam Integer administratorId){
        return null;
    }

    @GetMapping("/create")
    public Integer create(@RequestBody AdministratorCreateInDTO administratorCreateInDTO){
     return null;
    }

    @PostMapping("/update")
    public void update(@RequestBody AdministratorUpdateInDTO administratorUpdateInDTO){

    }
}
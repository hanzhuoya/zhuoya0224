package io.hzy.jcartadministrationback.controller;

import io.hzy.jcartadministrationback.dto.in.AdministratorLoginDTO;
import io.hzy.jcartadministrationback.dto.in.AdministratorResetPwdInDTO;
import io.hzy.jcartadministrationback.dto.in.AdministratorUpdateProfileInDTO;
import io.hzy.jcartadministrationback.dto.out.AdministratorGetProfileOutDTO;
import io.hzy.jcartadministrationback.dto.out.AdministratorListOutDTO;
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
}
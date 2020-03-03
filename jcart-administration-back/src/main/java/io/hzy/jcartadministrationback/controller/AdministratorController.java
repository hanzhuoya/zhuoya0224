package io.hzy.jcartadministrationback.controller;

import io.hzy.jcartadministrationback.constant.ClientExceptionConstant;
import io.hzy.jcartadministrationback.dto.in.*;
import io.hzy.jcartadministrationback.dto.out.*;
import io.hzy.jcartadministrationback.exception.ClientException;
import io.hzy.jcartadministrationback.po.Administrator;
import io.hzy.jcartadministrationback.service.AdministratorService;
import io.hzy.jcartadministrationback.util.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("administrator")
public class AdministratorController {

    @Autowired
    private AdministratorService administratorService;
    private Integer administratorId;
     @Autowired
    private JWTUtil jwtUtil;

    @GetMapping("/login")

    public AdministratorLoginOutDTO login(AdministratorLoginInDTO administratorLoginInDTO) throws ClientException {
        Administrator administrator = administratorService.getByUsername(administratorLoginInDTO.getUsername());
        if (administrator == null){
            throw new ClientException(ClientExceptionConstant.ADMINISTRATOR_USERNAME_NOT_EXIST_ERRCODE, ClientExceptionConstant.ADMINISTRATOR_USERNAME_NOT_EXIST_ERRMSG);
        }
        String encPwdDB = administrator.getEncryptedPassword();
        BCrypt.Result result = BCrypt.verifyer().verify(administratorLoginInDTO.getPassword().toCharArray(), encPwdDB);

        if (result.verified) {
            AdministratorLoginOutDTO administratorLoginOutDTO = jwtUtil.issueToken(administrator);
            return administratorLoginOutDTO;
        }else {
            throw new ClientException(ClientExceptionConstant.ADNINISTRATOR_PASSWORD_INVALID_ERRCODE, ClientExceptionConstant.ADNINISTRATOR_PASSWORD_INVALID_ERRMSG);
        }
    }

    @PostMapping("/getProfile")
    public AdministratorGetProfileOutDTO getProfile(@RequestParam(required = false) Integer adminstratorId){
        Administrator administrator = administratorService.getById(adminstratorId);
        AdministratorGetProfileOutDTO administratorGetProfileOutDTO = new AdministratorGetProfileOutDTO();
        administratorGetProfileOutDTO.setAdministratorId(administrator.getAdministratorId());
        administratorGetProfileOutDTO.setUsername(administrator.getUsername());
        administratorGetProfileOutDTO.setRealName(administrator.getRealName());
        administratorGetProfileOutDTO.setEmail(administrator.getEmail());
        administratorGetProfileOutDTO.setAvatarUrl(administrator.getAvatarUrl());
        administratorGetProfileOutDTO.setCreateTimestamp(administrator.getCreateTime().getTime());

        return administratorGetProfileOutDTO;
    }

    @PostMapping("/updateProdfile")
    public void updateProdfile(AdministratorUpdateProfileInDTO administratorUpdateProfileInDTO){
        Administrator administrator = new Administrator();
        administrator.setAdministratorId(administratorId);
        administrator.setRealName(administratorUpdateProfileInDTO.getRealName());
        administrator.setEmail(administratorUpdateProfileInDTO.getEmail());
        administrator.setAvatarUrl(administratorUpdateProfileInDTO.getAvatarUrl());
        administratorService.update(administrator);

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

    @PostMapping("/delete")
    public void delete(@RequestBody Integer adminstratorId){

    }

    @PostMapping("/batchDelete")
    public void batchDelete(List<Integer> administratorIds){

    }
}
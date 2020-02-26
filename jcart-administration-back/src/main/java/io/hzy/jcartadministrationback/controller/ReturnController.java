package io.hzy.jcartadministrationback.controller;

import io.hzy.jcartadministrationback.dto.in.ReturnSearchInDTO;
import io.hzy.jcartadministrationback.dto.in.ReturnUpdateActionInDTO;
import io.hzy.jcartadministrationback.dto.out.PageOutDTO;
import io.hzy.jcartadministrationback.dto.out.ReturnListOutDTO;
import io.hzy.jcartadministrationback.dto.out.ReturnShowOutDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/return")
public class ReturnController {

    @GetMapping("/search")
    public PageOutDTO<ReturnListOutDTO> search(ReturnSearchInDTO returnSearchInDTO, @RequestParam Integer pageNum){
        return null;
    }


    @GetMapping("/getById")
    public ReturnShowOutDTO getById(@RequestParam Integer returnId){
       return null;
    }

    @GetMapping("/updateAction")
    public void updateAction(@RequestParam ReturnUpdateActionInDTO returnUpdateActionInDTO){

    }
}

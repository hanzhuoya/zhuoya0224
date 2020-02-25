package io.hzy.jcartadministrationback.controller;

import io.hzy.jcartadministrationback.dto.in.CustomerSearchInDTO;
import io.hzy.jcartadministrationback.dto.out.CustomerListOutDTO;
import io.hzy.jcartadministrationback.dto.out.CustomerShowOutDTO;
import io.hzy.jcartadministrationback.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping("/search")
    public PageOutDTO<CustomerListOutDTO> search(CustomerSearchInDTO customerSearchInDTO, @RequestParam Integer pageName){
        return null;
    }

    @GetMapping("/getById")
    public CustomerShowOutDTO getById(@RequestParam Integer customerId){
       return null;
    }

    @PostMapping("/disable")
    public void disable(@RequestParam Integer customerId){

    }
}

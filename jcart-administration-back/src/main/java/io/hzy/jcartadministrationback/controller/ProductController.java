package io.hzy.jcartadministrationback.controller;

import io.hzy.jcartadministrationback.dto.in.ProductCreateInDTO;
import io.hzy.jcartadministrationback.dto.in.ProductSearchInDTO;
import io.hzy.jcartadministrationback.dto.in.ProductUpdateInDTO;
import io.hzy.jcartadministrationback.dto.out.PageOutDTO;
import io.hzy.jcartadministrationback.dto.out.ProductListOutDTO;
import io.hzy.jcartadministrationback.dto.out.ProductShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO, @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId){
       return null;
    }


    @PostMapping("/create")
    public Integer create(@RequestBody ProductCreateInDTO productCreateInDTO){
      return null;
    }

    @PostMapping("/update")
    public void update(@RequestBody ProductUpdateInDTO productUpdateInDTO){

    }
}

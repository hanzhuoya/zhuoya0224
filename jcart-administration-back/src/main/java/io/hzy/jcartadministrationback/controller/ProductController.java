package io.hzy.jcartadministrationback.controller;

import com.github.pagehelper.Page;
import io.hzy.jcartadministrationback.dto.in.ProductCreateInDTO;
import io.hzy.jcartadministrationback.dto.in.ProductSearchInDTO;
import io.hzy.jcartadministrationback.dto.in.ProductUpdateInDTO;
import io.hzy.jcartadministrationback.dto.out.PageOutDTO;
import io.hzy.jcartadministrationback.dto.out.ProductListOutDTO;
import io.hzy.jcartadministrationback.dto.out.ProductShowOutDTO;
import io.hzy.jcartadministrationback.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO, @RequestParam Integer pageNum){
        Page<ProductListOutDTO> page = productService.search(pageNum);

        PageOutDTO<ProductListOutDTO> pageOutDTO = new PageOutDTO<>();
        pageOutDTO.setTotal((int) page.getTotal());
        pageOutDTO.setPageSize(page.getPageSize());
        pageOutDTO.setPageNum(page.getPageNum());
        pageOutDTO.setList(page);

        return pageOutDTO;
    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId){
        ProductShowOutDTO productShowOutDTO =.getById(productId);
        return productShowOutDTO;
    }


    @PostMapping("/create")
    public Integer create(@RequestBody ProductCreateInDTO productCreateInDTO){
        Integer productId = productService.create(productCreateInDTO);
        return productId;
    }

    @PostMapping("/update")
    public void update(@RequestBody ProductUpdateInDTO productUpdateInDTO){
        productService.update(productUpdateInDTO);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody Integer productId){
        productService.delete(productId);
    }

    @PostMapping("/batchDelete")
    public void batchDelete(@RequestBody List<Integer> productIds){
        productService.batchDelete(productIds);
    }

}

package io.hzy.jcartadministrationback.service;


import com.github.pagehelper.Page;
import io.hzy.jcartadministrationback.dto.in.ProductCreateInDTO;
import io.hzy.jcartadministrationback.dto.in.ProductSearchInDTO;
import io.hzy.jcartadministrationback.dto.in.ProductUpdateInDTO;
import io.hzy.jcartadministrationback.dto.out.ProductListOutDTO;
import io.hzy.jcartadministrationback.dto.out.ProductShowOutDTO;

import java.util.List;

public interface ProductService {

    Integer create(ProductCreateInDTO productCreateInDTO);

    void update(ProductUpdateInDTO productUpdateInDTO);

    void delete(Integer productId);

    void batchDelete(List<Integer> productIds);

    Page<ProductListOutDTO> search(Integer pageNum);
    Page<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
                                   Integer pageNum);


    ProductShowOutDTO getById(Integer productId);

}

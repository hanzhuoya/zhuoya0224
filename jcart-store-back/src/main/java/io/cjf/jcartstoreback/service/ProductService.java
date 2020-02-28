package io.cjf.jcartstoreback.service;


import com.github.pagehelper.Page;

public interface ProductService {

    ProductShowOutDTO getById(Integer productId);

    Page<ProductListOutDTO> search(Integer pageNum);

}

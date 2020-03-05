package io.hzy.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.hzy.jcartadministrationback.dto.in.CustomerSetStatusInDTO;
import io.hzy.jcartadministrationback.po.Customer;

public interface CustomerService {

    Page<Customer> search(Integer pageNum);

    Customer getById(Integer customerId);

    void setStatus(CustomerSetStatusInDTO customerSetStatusInDTO);

}

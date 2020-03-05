package io.hzy.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.hzy.jcartadministrationback.dto.out.OrderListOutDTO;
import io.hzy.jcartadministrationback.dto.out.OrderShowOutDTO;
import org.springframework.core.annotation.Order;

public interface OrderService {

    Page<OrderListOutDTO> search(Integer pageNum);

    OrderShowOutDTO getById(Long orderId);

    void update(Order order);

}

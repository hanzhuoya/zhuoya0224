package io.hzy.jcartadministrationback.dao;

import com.github.pagehelper.Page;
import io.hzy.jcartadministrationback.dto.out.OrderListOutDTO;
import org.springframework.core.annotation.Order;

public interface OrderMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    Page<OrderListOutDTO> search();
}
package io.cjf.jcartstoreback.dao;

import com.github.pagehelper.Page;
import org.springframework.core.annotation.Order;

public interface OrderMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    Page<io.cjf.jcartstoreback.po.Order> selectByCustomerId(Integer customerId);
}
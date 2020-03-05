package io.hzy.jcartadministrationback.service;

import io.hzy.jcartadministrationback.po.OrderHistory;

import java.util.List;

public interface OrderHistoryService {

    List<OrderHistory> getByOrderId(Long orderId);

    Long create(OrderHistory orderHistory);

}

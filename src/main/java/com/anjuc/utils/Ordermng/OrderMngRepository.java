package com.anjuc.utils.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderMngRepository extends JpaRepository<Order, Integer> {
    public Order findOrderByOrderCode(String OrderCode);
    public void deleteOrderById (int id);
    public Order findOrdersById (int id);
}

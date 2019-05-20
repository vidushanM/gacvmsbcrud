package com.anjuc.utils.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    public Order findOrderByOrderCode(String OrderCode);
    public void deleteOrderById (int id);
    public Order findOrdersById (int id);
}

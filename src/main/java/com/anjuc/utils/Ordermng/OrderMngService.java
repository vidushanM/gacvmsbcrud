package com.anjuc.utils.Order;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class OrderService {

    @Autowired
    OrderRepository OrderRepository;

    public List<Order> getAllOrders(){
        return OrderRepository.findAll();
    }

    public Order getOrderByOrderCode (String OrderCode){
        return OrderRepository.findOrderByOrderCode(OrderCode);
    }

    public Order createOrder (Order Order){
        return OrderRepository.save(Order);
    }

    public Order updateOrder (int id, Order OrderDetails){
        Order Order = OrderRepository.findOrderById(id);

        Order.setOrderCode(OrderDetails.getOrderCode());
        Order.setOrderName(OrderDetails.getOrderName());
        Order.setOrderDescription(OrderDetails.getOrderDescription());
        Order.setOrderCategory(OrderDetails.getOrderCategory());
        Order.setOrderImage(OrderDetails.getOrderImage());
        Order.setOrderSellerId(OrderDetails.getOrderSellerId());

        return OrderRepository.save(Order);


    }
}

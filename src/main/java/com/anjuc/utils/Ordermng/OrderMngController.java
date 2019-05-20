package com.anjuc.utils.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderMngController {

    @Autowired
    OrderService OrderService;

    @GetMapping(value= "/utils/Orders", params = "Order_code" )
    public ResponseEntity<Order> getOrderByOrderCode (@RequestParam(name = "Order_code")String OrderCode){
        return new ResponseEntity<> (OrderService.getOrderByOrderCode(OrderCode), HttpStatus.OK);
    }
    @GetMapping("utils/Orders")
    public ResponseEntity<List<Order>> getAllOrders(){
        return new ResponseEntity<>(OrderService.getAllOrders(),HttpStatus.OK);
    }

    @PostMapping("utils/Orders")
    public ResponseEntity<Order> createOrder(@RequestBody Order Order){
        return new ResponseEntity<Order>(OrderService.createOrder(Order), HttpStatus.OK);
    }

    @PutMapping("utils/Orders/{id}")
    public ResponseEntity<Order> updateOrder(@PathVariable int id, @RequestBody Order Order){
        return new ResponseEntity<Order>(OrderService.updateOrder(id, Order),HttpStatus.OK);
    }
}

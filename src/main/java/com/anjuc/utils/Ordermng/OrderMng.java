package com.anjuc.utils.order;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entitys
@Table(name = "ordermng")
public class OrderMngs {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "order_code", nullable = false, unique = true)
    private String orderCode;

    @Column(name = "order_name", nullable = false)
    private String orderName;

    @Column(name ="order_description", nullable = false)
    private String orderDescription;

    @Column(name = "order_Date",nullable = true)
    private String orderDate;

    @Column(name = "order_buyer_id", nullable = false)
    private int orderBuyerId;

    public int getorderBuyerId() {
        return orderBuyerId;
    }

    public void setorderBuyerId(int orderBuyerId) {
        this.orderBuyerId = orderBuyerId;
    }

    @Column(name = "created_at")
    @CreationTimestamp
    private Date createdAt;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private Date updatedAt;

    public order(){

    }

    public order(String orderCode, String orderName, String orderDescription, String orderDate, String orderImage){
        this.setorderCode(orderCode);
        this.setorderName(orderName);
        this.setorderDescription(orderDescription);
        this.setorderDate(orderDate);
       
    }

    public int getId() {
        return id;
    }

    public String getorderCode() {
        return orderCode;
    }

    public void setorderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getorderName() {
        return orderName;
    }

    public void setorderName(String orderName) {
        this.orderName = orderName;
    }

    public String getorderDescription() {
        return orderDescription;
    }

    public void setorderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }

    public String getorderDate() {
        return orderDate;
    }

    public void setorderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getorderImage() {
        return orderImage;
    }

    public void setorderImage(String orderImage) {
        this.orderImage = orderImage;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}

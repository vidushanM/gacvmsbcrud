package com.anjuc.utils.Payment;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "payment_id", nullable = false)
    private String paymentId;

    @Column(name = "payment_amount",nullable = true)
    private double paymentAmount;

    @Column(name = "payment_date",nullable = true)
    private Date paymentDate;


    @Column(name = "payment_buyer_id", nullable = false)
    private int paymentBuyerId;

    public int getPaymentBuyerId() {
        return paymentBuyerId;
    }

    public void setPaymentBuyerId(int paymentBuyerId) {
        this.paymentBuyerId = paymentBuyerId;
    }

    @Column(name = "created_at")
    @CreationTimestamp
    private Date createdAt;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private Date updatedAt;

    public Payment(){

    }

    public Payment(String paymentId, double paymentAmount, Date paymentDate){
        this.setPaymentId(paymentId);
        this.setPaymentAmount(paymentAmount);
        this.setPaymentDate(paymentDate);
    }

    public int getId() {
        return id;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
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
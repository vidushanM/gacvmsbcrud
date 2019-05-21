package com.anjuc.utils.Payment;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer>  {
    public Payment findPaymentByPaymentCode(String PaymentCode);
    public void deletePaymentById (int id);
    public Payment findPaymentById (int id);

}

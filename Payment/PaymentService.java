package com.anjuc.utils.Payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    public List<Payment> getAllPayments(){
        return paymentRepository.findAll();
    }

//    public Payment getSpeceficPayments(){
//        return paymentRepository.();
//    }

    public Payment getPaymentByPaymentCode (String paymentCode){
        return paymentRepository.findPaymentByPaymentCode(paymentCode);
    }

    public Payment createPayment (Payment payment){
        return paymentRepository.save(payment);
    }

    public Payment updatePayment (int id, Payment paymentDetails){
        Payment payment = paymentRepository.findPaymentById(id);

        payment.setPaymentId(paymentDetails.getPaymentId());
        payment.setPaymentAmount(paymentDetails.getPaymentAmount());
        payment.setPaymentDate(paymentDetails.getPaymentDate());
        payment.setPaymentBuyerId(paymentDetails.getPaymentBuyerId());

        return paymentRepository.save(payment);

    }

    public void deletePayment (int id){
        paymentRepository.deletePaymentById(id);
    }
}

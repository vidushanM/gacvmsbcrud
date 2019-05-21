package com.anjuc.utils.Payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @GetMapping(value= "/utils/payments", params = "payment_code" )
    public ResponseEntity<Payment> getPaymentByPaymentId (@RequestParam(name = "payment_id")String paymentCode){
        return new ResponseEntity<> (paymentService.getPaymentByPaymentCode(paymentCode), HttpStatus.OK);
    }
    @GetMapping("utils/payments")
    public ResponseEntity<List<Payment>> getAllPayments(){
        return new ResponseEntity<>(paymentService.getAllPayments(),HttpStatus.OK);
    }




    @PostMapping("utils/payments")
    public ResponseEntity<Payment> createPayment(@RequestBody Payment payment){
        return new ResponseEntity<Payment>(paymentService.createPayment(payment), HttpStatus.OK);
    }

    @PutMapping("utils/payments/{id}")
    public ResponseEntity<Payment> updatePayment(@PathVariable int id, @RequestBody Payment payment){
        return new ResponseEntity<Payment>(paymentService.updatePayment(id, payment),HttpStatus.OK);
    }

    @DeleteMapping("utils/payments/{id}")
    public ResponseEntity deletePayment (@PathVariable int id){
        paymentService.deletePayment(id);
        return new ResponseEntity(HttpStatus.OK);

    }
}

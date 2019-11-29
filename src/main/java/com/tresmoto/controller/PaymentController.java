package com.tresmoto.controller;

import com.tresmoto.client.PaymentRequest;
import com.tresmoto.service.payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping(value = "/pay", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public ResponseEntity makePayment(PaymentRequest paymentRequest) {
        paymentService.makePayment(paymentRequest);
        return null;
    }
}

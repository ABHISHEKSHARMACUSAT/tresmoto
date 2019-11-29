package com.tresmoto.service.payment;

import com.tresmoto.client.PaymentRequest;
import org.springframework.http.ResponseEntity;

public interface PaymentService {

    ResponseEntity makePayment(PaymentRequest paymentRequest);
}

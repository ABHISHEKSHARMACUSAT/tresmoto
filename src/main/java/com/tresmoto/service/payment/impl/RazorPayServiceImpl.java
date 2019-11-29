package com.tresmoto.service.payment.impl;

import com.tresmoto.client.PaymentRequest;
import com.tresmoto.repository.entity.PaymentTransactionDetails;
import com.tresmoto.service.payment.paymentGatewayService;
import org.springframework.stereotype.Service;

@Service("razorPayServiceImpl")
public class RazorPayServiceImpl implements paymentGatewayService {

    @Override
   public void makePayment(PaymentRequest paymentRequest, PaymentTransactionDetails paymentTransactionDetails){

    }
}

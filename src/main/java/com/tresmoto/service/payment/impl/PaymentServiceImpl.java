package com.tresmoto.service.payment.impl;

import com.tresmoto.client.PaymentRequest;
import com.tresmoto.constants.PaymentGatewayType;
import com.tresmoto.factory.routing.PaymentGatewayRouterFactory;
import com.tresmoto.factory.service.PaymentGatewayServiceFactory;
import com.tresmoto.repository.entity.PaymentTransactionDetails;
import com.tresmoto.service.payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.tresmoto.service.payment.paymentGatewayService;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentGatewayRouterFactory paymentGatewayRouterFactory;

    @Autowired
    private PaymentGatewayServiceFactory paymentGatewayServiceFactory;


    @Autowired
    private PaymentTransactionServiceImpl paymentTransactionService;

    @Autowired
    private paymentGatewayService paymentGatewayService;

    public ResponseEntity makePayment(PaymentRequest paymentRequest) {
        PaymentGatewayType paymentGatewayType = paymentGatewayRouterFactory.getPaymentGateway(paymentRequest);
        PaymentTransactionDetails paymentTransactionDetails = paymentTransactionService.createPaymentTransactionDetails(paymentRequest, paymentGatewayType);
        paymentGatewayService paymentGatewayService = paymentGatewayServiceFactory.getPaymentGatewayService(paymentGatewayType);
        paymentGatewayService.makePayment(paymentRequest, paymentTransactionDetails);
        return null;
    }
}

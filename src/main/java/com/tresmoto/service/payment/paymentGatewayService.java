package com.tresmoto.service.payment;

import com.tresmoto.client.PaymentRequest;
import com.tresmoto.repository.entity.PaymentTransactionDetails;

public interface paymentGatewayService {

    void makePayment(PaymentRequest paymentRequest, PaymentTransactionDetails paymentTransactionDetails);
}

package com.tresmoto.service.payment;

import com.tresmoto.client.PaymentRequest;
import com.tresmoto.constants.PaymentGatewayType;
import com.tresmoto.repository.entity.PaymentTransactionDetails;

public interface PaymentTransactionService {

   PaymentTransactionDetails createPaymentTransactionDetails(PaymentRequest paymentRequest, PaymentGatewayType paymentGatewayType);
}

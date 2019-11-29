package com.tresmoto.helper;

import com.tresmoto.client.PaymentRequest;

public interface PayTmHelper {

    String getPaymentResponse(PaymentRequest payNowRequest, String transactionId) ;
}

package com.tresmoto.factory.service;

import com.tresmoto.constants.PaymentGatewayType;
import com.tresmoto.service.payment.paymentGatewayService;

public interface PaymentGatewayServiceFactory {

    paymentGatewayService getPaymentGatewayService(PaymentGatewayType paymentGatewayType);
}

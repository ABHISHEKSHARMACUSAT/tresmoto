package com.tresmoto.factory.routing;

import com.tresmoto.client.PaymentRequest;
import com.tresmoto.constants.PaymentGatewayType;

public interface PaymentGatewayRouterFactory {

    PaymentGatewayType getPaymentGateway(PaymentRequest paymentRequest);
}

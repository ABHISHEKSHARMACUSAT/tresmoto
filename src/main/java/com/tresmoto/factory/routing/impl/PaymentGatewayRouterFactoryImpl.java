package com.tresmoto.factory.routing.impl;

import com.tresmoto.client.PaymentRequest;
import com.tresmoto.constants.PaymentGatewayType;
import com.tresmoto.factory.routing.PaymentGatewayRouterFactory;
import com.tresmoto.service.payment.impl.PayTmServiceImpl;
import com.tresmoto.service.payment.impl.RazorPayServiceImpl;
import com.tresmoto.service.payment.paymentGatewayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.tresmoto.constants.PaymentGatewayType.PAYTM;
import static com.tresmoto.constants.PaymentGatewayType.RAZORPAY;

@Component
public class PaymentGatewayRouterFactoryImpl implements PaymentGatewayRouterFactory {

    @Override
    public PaymentGatewayType getPaymentGateway(PaymentRequest paymentRequest) {
        if (paymentRequest.getWallet() != null
                && PAYTM.getCode().equalsIgnoreCase(paymentRequest.getWallet().getCode())) {
            return PAYTM;
        }
        return RAZORPAY;
    }

}

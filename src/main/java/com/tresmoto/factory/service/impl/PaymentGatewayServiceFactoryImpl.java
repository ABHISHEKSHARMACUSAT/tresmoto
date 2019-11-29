package com.tresmoto.factory.service.impl;

import com.tresmoto.constants.PaymentGatewayType;
import com.tresmoto.factory.service.PaymentGatewayServiceFactory;
import com.tresmoto.service.payment.impl.PayTmServiceImpl;
import com.tresmoto.service.payment.impl.RazorPayServiceImpl;
import com.tresmoto.service.payment.paymentGatewayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import static com.tresmoto.constants.PaymentGatewayType.PAYTM;

@Component
public class PaymentGatewayServiceFactoryImpl implements PaymentGatewayServiceFactory {


    @Autowired
    @Qualifier("payTmServiceImpl")
    private PayTmServiceImpl payTmServiceImpl;

    @Autowired
    @Qualifier("razorPayServiceImpl")
    private RazorPayServiceImpl razorPayServiceImpl;

    @Override
    public paymentGatewayService getPaymentGatewayService(PaymentGatewayType paymentGatewayType) {
        if (paymentGatewayType == PAYTM) {
            return payTmServiceImpl;
        }
        return razorPayServiceImpl;
    }
}

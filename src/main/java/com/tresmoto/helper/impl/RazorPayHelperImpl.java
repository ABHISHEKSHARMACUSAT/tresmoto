package com.tresmoto.helper.impl;

import com.tresmoto.constants.LeastCurrencyDenominatorConversionConstants;
import com.tresmoto.constants.RazorpayConstants;
import com.tresmoto.dto.request.razorpay.RazorPayOrderRequest;
import com.tresmoto.helper.RazorPayHelper;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RazorPayHelperImpl implements RazorPayHelper {


    @Override
    public RazorPayOrderRequest createOrderRequest(String payNowRequest) {
        RazorPayOrderRequest razorPayOrderRequest = new RazorPayOrderRequest();
        razorPayOrderRequest.setAmount(getLowestCommonDenominatorAmountFromInputAmount(null));
        razorPayOrderRequest.setCurrency(RazorpayConstants.CURRENCY_TYPE);
//        if (null != payNowRequest.getTenantTransactionId() && payNowRequest.getTenantTransactionId().trim().length() > 40) {
//            orderRequest.setReceipt(payNowRequest.getTenantTransactionId().substring(0, 40));
//        } else {
        razorPayOrderRequest.setReceipt(null);
        // }
        razorPayOrderRequest.setPaymentCapture(RazorpayConstants.CAPTURE_PAYMENT_YES);
//        orderRequest.getNotes().put(PaymentEngineConstants.TENANT_TRANSACTION_ID, paymentTransactionDetails.getTenantTransactionId());
//        orderRequest.getNotes().put(PaymentEngineConstants.PAYMENT_ENGINE_TRANSACTION_ID, paymentTransactionDetails.getPaymentEngineTransactionId());
//        orderRequest.getNotes().put(PaymentEngineConstants.PAYMENT_TRANSACTION_SPLIT_UP_ID, gatewayTransactionSplitUpId);
        return razorPayOrderRequest;
    }


    public BigDecimal getLowestCommonDenominatorAmountFromInputAmount(BigDecimal amount) {
        return amount.multiply(LeastCurrencyDenominatorConversionConstants.INR_CONVERSION_FACTOR).setScale(0, RoundingMode.CEILING);
    }
}

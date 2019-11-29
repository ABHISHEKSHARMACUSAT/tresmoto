package com.tresmoto.provider.impl;

import com.tresmoto.dto.request.razorpay.RazorPayOrderRequest;
import com.tresmoto.provider.RazorPayProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

public class RazorPayProviderImpl implements RazorPayProvider {

    @Value("${rest.url.razorpay.create-order}")
    private String createOrderURL;

    @Value("${rest.url.razorpay.validate-authentication-type}")
    String validateAuthenticationTypeURL;

    @Value("${rest.url.razorpay.make-payment}")
    String makePaymentURL;

    @Value("${rest.url.razorpay.resend-otp}")
    String resendOTPURL;

    @Value("${rest.url.razorpay.submit-otp-s2s}")
    String submitOTPViaS2SCallUrl;

    @Value("${rest.url.razorpay.make-payment-upi-s2s}")
    String makePaymentViaUPIUrl;

    @Value("${rest.url.razorpay.enquire-against-order}")
    String enquireUrl;

    @Value("${rest.url.razorpay.refund-against-payment}")
    String refundAgainstPaymentUrl;

    @Value("${rest.url.razorpay.card-details-for-payment}")
    String cardDetailsForPaymentUrl;

    @Autowired
    private RestTemplate razorPayRestTemplate;

    public String createOrder(RazorPayOrderRequest razorPayOrderRequest) {
//        HttpHeaders httpHeaders = new HttpHeaders();
//        httpHeaders.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
//        razorpayHelper.appendAuthorizationHeader(httpHeaders);
//
//        HttpEntity<String> httpEntity = new HttpEntity<>(mapperUtils.getJsonString(orderRequest), httpHeaders);
//
//        return razorPayRestTemplate.exchange(createOrderURL, HttpMethod.POST, httpEntity, String.class);
        return null;
    }

}

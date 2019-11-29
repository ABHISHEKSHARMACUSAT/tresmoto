package com.tresmoto.provider;


import com.tresmoto.dto.request.razorpay.RazorPayOrderRequest;

public interface RazorPayProvider {

    String createOrder(RazorPayOrderRequest razorPayOrderRequest);


}

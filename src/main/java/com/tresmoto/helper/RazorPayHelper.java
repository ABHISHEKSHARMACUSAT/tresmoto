package com.tresmoto.helper;

import com.tresmoto.dto.request.razorpay.RazorPayOrderRequest;

public interface RazorPayHelper {

    public RazorPayOrderRequest createOrderRequest(String payNowRequest);
}

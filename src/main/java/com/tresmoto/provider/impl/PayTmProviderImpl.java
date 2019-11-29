package com.tresmoto.provider.impl;

import com.tresmoto.provider.PayTmProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

public class PayTmProviderImpl implements PayTmProvider {

    @Value("${rest.url.paytm.transaction-status}")
    private String payTmTransactionStatusUrl;

    @Value("${rest.url.paytm.refund-against-payment}")
    private String payTmRefundRequestUrl;

    @Autowired
    private RestTemplate payTmRestTemplate;
}

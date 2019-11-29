package com.tresmoto.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
public class RestTemplateConfig {

    @Value("${rest.url.razorpay.connection-timeout:10000}")
    private long razorpayConnectionTimeOut;

    @Value("${rest.url.razorpay.read-timeout:10000}")
    private long razorpayReadTimeOut;


    @Value("${rest.url.paytm.connection-timeout:5000}")
    private long payTmConnectionTimeOut;

    @Value("${rest.url.paytm.read-timeout:5000}")
    private long payTmReadTimeOut;


    @Bean
    public RestTemplate payTmRestTemplate(RestTemplateBuilder builder) {
        return builder
                .setConnectTimeout(Duration.ofMillis(payTmConnectionTimeOut))
                .setReadTimeout(Duration.ofMillis(payTmReadTimeOut))
                .build();
    }

    @Bean
    public RestTemplate razorPayRestTemplate(RestTemplateBuilder builder) throws Exception {
        return builder
                .setConnectTimeout(Duration.ofMillis(razorpayConnectionTimeOut))
                .setReadTimeout(Duration.ofMillis(razorpayReadTimeOut))
                .build();
    }


}

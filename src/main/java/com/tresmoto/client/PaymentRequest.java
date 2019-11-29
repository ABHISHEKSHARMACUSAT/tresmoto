package com.tresmoto.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.tresmoto.constants.PaymentMode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentRequest {

    private PaymentMode paymentMode;
    private Amount amount;
    private NetBanking netBanking;
    private Wallet wallet;
    private UPI upi;
    private CARD card;
    private PaymentChannelInformation paymentChannelInformation;
    private Tenant tenant;
    private Customer customer;

}

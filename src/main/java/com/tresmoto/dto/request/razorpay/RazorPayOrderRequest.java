package com.tresmoto.dto.request.razorpay;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;


@Getter
@Setter
@ToString
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class RazorPayOrderRequest {

    @JsonProperty("amount")
    BigDecimal amount;

    @JsonProperty("currency")
    String currency;

    @JsonProperty("receipt")
    String receipt;

    @JsonProperty("payment_capture")
    Integer paymentCapture;

    @JsonProperty("notes")
    Map<String, String> notes = new HashMap<>();
}

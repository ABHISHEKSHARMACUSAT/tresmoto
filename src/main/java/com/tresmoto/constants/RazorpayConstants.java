package com.tresmoto.constants;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
public class RazorpayConstants {
    public static final String CURRENCY = "currency";
    public static final String AMOUNT = "amount";
    public static final String ORDER_ID = "order_id";
    public static final String EMAIL = "email";
    public static final String CONTACT = "contact";
    public static final String PAYMENT_INSTRUMENT = "method";

    public static final String CALLBACK_URL = "callback_url";
    public static final String NOTES = "notes";
    public static final String IP = "ip";
    public static final String REFERER = "referer";
    public static final String USER_AGENT = "user_agent";
    public static final String AUTH_TYPE = "auth_type";

    public static final String CARD_NUMBER = "card[number]";
    public static final String CARD_NAME = "card[name]";
    public static final String CARD_EXPIRY_MONTH = "card[expiry_month]";
    public static final String CARD_EXPIRY_YEAR = "card[expiry_year]";
    public static final String CARD_CVV = "card[cvv]";

    public static final String BANK_CODE = "bank";
    public static final String WALLET_CODE = "wallet";

    public static final String VPA_ID = "vpa";
    public static final String FLOW = "flow";
    public static final String INTENT = "intent";

    public static final String CURRENCY_TYPE = "INR";
    public static final Integer CAPTURE_PAYMENT_YES = 1;
    public static final String X_RAZORPAY_SIGNATURE = "X-Razorpay-Signature" ;


    @ToString
    @Getter
    @AllArgsConstructor
    public enum RazorpayPaymentInstrument {
        CARD("card"), NET_BANKING("netbanking"), WALLET("wallet"), EMI("emi"), UPI("upi");
        String code;

    }

    @ToString
    @Getter
    @AllArgsConstructor
    public enum RazorpayAuthType {
        OTP("otp"),
        THREE_DS("3ds");

        String code;
    }

    @ToString
    @Getter
    @AllArgsConstructor
    public enum Events {

        @JsonProperty(value = "payment.authorized")
        PAYMENT_AUTHORIZED("payment.authorized"),

        // received just before ORDER_PAID
        @JsonProperty(value = "payment.captured")
        PAYMENT_CAPTURED("payment.captured"),

        @JsonProperty(value = "payment.failed")
        PAYMENT_FAILED("payment.failed"),

        @JsonProperty(value = "payment.dispute.created")
        PAYMENT_DISPUTE_CREATED("payment.dispute.created"),

        // success
        @JsonProperty(value = "order.paid")
        ORDER_PAID("order.paid"),

        @JsonProperty(value = "invoice.paid")
        INVOICE_PAID("invoice.paid"),

        @JsonProperty(value = "invoice.expired")
        INVOICE_EXPIRED("invoice.expired"),

        @JsonProperty(value = "subscription.charged")
        SUBSCRIPTION_CHARGED("subscription.charged");

        String code;

    }

    @ToString
    @Getter
    @AllArgsConstructor
    public enum RazorpayStatus {
        CREATED("created"),
        AUTHORIZED("authorized"),
        // success
        CAPTURED("captured"),
        REFUNDED("refunded"),
        FAILURE("failed");

        String code;
    }

    @ToString
    @Getter
    @AllArgsConstructor
    public enum RazorpayEntityType {
        PAYMENT("payment"),
        ORDER("order"),
        INVOICE("invoice"),
        SUBSCRIPTION("subscription"),
        DISPUTE("dispute");

        String code;
    }

    public static final String ORDER_ID_PATH_PARAM = "order-id";
    public static final String PAYMENT_ID_PATH_PARAM = "razorpay-payment-id";
    public static final String OTP = "otp";
    public static final String EVENT = "event";
    public static final String DESCRIPTION = "description";
}

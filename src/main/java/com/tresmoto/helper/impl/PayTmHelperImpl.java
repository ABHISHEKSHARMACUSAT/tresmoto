package com.tresmoto.helper.impl;

import static com.tresmoto.constants.PayTmConstants.*;

import com.paytm.pg.merchant.CheckSumServiceHelper;
import com.tresmoto.client.PaymentRequest;
import com.tresmoto.constants.ChannelType;
import com.tresmoto.helper.PayTmHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import java.math.RoundingMode;
import java.util.TreeMap;

public class PayTmHelperImpl implements PayTmHelper {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    private CheckSumServiceHelper checkSumServiceHelper;

    @PostConstruct
    private void init() {
        this.checkSumServiceHelper = CheckSumServiceHelper.getCheckSumServiceHelper();
    }

    @Value("${rest.url.paytm.callback}")
    private String callbackUrl;

    @Value("${rest.url.paytm.transaction}")
    private String transactionURL;

    @Value("${rest.url.paytm.mid}")
    private String merchantId;

    @Value("${rest.url.paytm.web-site}")
    private String webSite;

    @Value("${rest.url.paytm.app-site}")
    private String appSite;

    @Value("${rest.url.paytm.industry-type}")
    private String industryType;

    @Value("${rest.url.paytm.m-key}")
    private String merchantKey;

    @Value("${rest.url.paytm.template-name}")
    private String templateName;

    @Value("${rest.url.paytm.refund.client-id:C11}")
    private String clientId;

    @Value("${rest.url.paytm.refund.version:v1}")
    private String version;


    @Override
    public String getPaymentResponse(PaymentRequest paymentRequest, String transactionId) {
        log.debug("PayTmHelperImpl.getPaymentResponse for payTm called and gateway transaction id is {} ", transactionId);
        TreeMap<String, String> parameters = new TreeMap<>();
        parameters.put(MID.name(), merchantId);
        parameters.put(ORDER_ID.name(), transactionId);
        if (ChannelType.WEB == paymentRequest.getPaymentChannelInformation().getChannelType()) {
            parameters.put(CHANNEL_ID.name(), ChannelType.WEB.name());
            parameters.put(WEBSITE.name(), webSite);
        } else {
            parameters.put(CHANNEL_ID.name(), WAP.name());
            parameters.put(WEBSITE.name(), appSite);
        }
        parameters.put(CUST_ID.name(), transactionId);
        parameters.put(MOBILE_NO.name(), paymentRequest.getCustomer().getMobile());
        parameters.put(EMAIL.name(), paymentRequest.getCustomer().getEmail());
        parameters.put(TXN_AMOUNT.name(), String.valueOf(
                paymentRequest.getAmount().getNetPayableAmount().setScale(2, RoundingMode.CEILING)));
        parameters.put(INDUSTRY_TYPE_ID.name(), industryType);
        StringBuilder stringBuilder = new StringBuilder(callbackUrl);
        stringBuilder.append(transactionId);
        parameters.put(CALLBACK_URL.name(), stringBuilder.toString());
        try {
            String payTmChecksum = checkSumServiceHelper.genrateCheckSum(merchantKey, parameters);
            parameters.put(CHECKSUMHASH.name(), payTmChecksum);
            parameters.put(TRANSACTION_URL.name(), transactionURL);
            //return templatingService.compileTemplate(templateName, parameters);
            return null;
        } catch (Exception exp) {
            log.error("exception {} occurred while generating payTm checksum value" +
                    " and payment transaction id is {} ", exp, transactionId);
        }
        throw new RuntimeException("EXP");
    }
}

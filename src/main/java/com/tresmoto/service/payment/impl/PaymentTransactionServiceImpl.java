package com.tresmoto.service.payment.impl;

import static com.tresmoto.constants.PaymentConstant.TRES_MOTO;

import com.tresmoto.client.PaymentRequest;
import com.tresmoto.constants.PaymentGatewayType;
import com.tresmoto.constants.TransactionStatus;
import com.tresmoto.repository.PaymentTransactionDetailsRepository;
import com.tresmoto.repository.entity.PaymentTransactionDetails;
import com.tresmoto.service.payment.PaymentTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.util.Date;

@Service
public class PaymentTransactionServiceImpl implements PaymentTransactionService {

    @Autowired
    private PaymentTransactionDetailsRepository paymentTransactionDetailsRepository;

    public PaymentTransactionDetails createPaymentTransactionDetails(PaymentRequest paymentRequest, PaymentGatewayType paymentGatewayType) {
        PaymentTransactionDetails paymentTransactionDetails = getPaymentTransactionDetails(paymentRequest, paymentGatewayType);
        paymentTransactionDetailsRepository.save(paymentTransactionDetails);
        return paymentTransactionDetails;
    }


    private PaymentTransactionDetails getPaymentTransactionDetails(PaymentRequest paymentRequest, PaymentGatewayType paymentGatewayType) {
        PaymentTransactionDetails paymentTransactionDetails = new PaymentTransactionDetails();
        Date transactionDate = new Date();
        paymentTransactionDetails.setAmount(paymentRequest.getAmount().getNetPayableAmount());
        if (null != paymentRequest.getTenant()) {
            paymentTransactionDetails.setTenantCode(paymentRequest.getTenant().getCode());
            paymentTransactionDetails.setTenantTransactionId(paymentRequest.getTenant().getTransactionId());
        }
        paymentTransactionDetails.setCustomerUUID(paymentRequest.getCustomer().getUuid());
        paymentTransactionDetails.setPaymentChannelCode(paymentRequest.getPaymentChannelInformation().getChannelType());
        paymentTransactionDetails.setAppType(paymentRequest.getPaymentChannelInformation().getAppType());
        paymentTransactionDetails.setTransactionStatus(TransactionStatus.PENDING);
        paymentTransactionDetails.setPaymentMode(paymentRequest.getPaymentMode());
        paymentTransactionDetails.setPaymentGatewayCode(paymentGatewayType);
        paymentTransactionDetails.setCreatedOn(transactionDate);
        paymentTransactionDetails.setCreatedBy(TRES_MOTO);
        return paymentTransactionDetails;
    }
}

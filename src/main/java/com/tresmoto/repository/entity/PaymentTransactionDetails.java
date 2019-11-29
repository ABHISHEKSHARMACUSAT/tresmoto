package com.tresmoto.repository.entity;

import com.tresmoto.constants.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name = "PAYMENT_TRANSACTION_DETAILS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PaymentTransactionDetails extends AbstractAttributes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "TENANT_CODE", nullable = false)
    private String tenantCode;

    @Column(name = "CUSTOMER_UUID")
    private String customerUUID;

    @Column(name = "GATEWAY_CODE")
    @Enumerated(EnumType.STRING)
    private PaymentGatewayType paymentGatewayCode;

    @Column(name = "PAYMENT_MODE")
    @Enumerated(EnumType.STRING)
    private PaymentMode paymentMode;

    @Column(name = "BANK_NAME")
    private String bankName;

    @Column(name = "TENANT_TX_ID", nullable = true)
    private String tenantTransactionId;

    @Column(name = "PAYMENT_TRANSACTION_ID", nullable = true)
    private String paymentTransactionId;

    @Column(name = "GATEWAY_TRANSACTION_ID", nullable = true)
    private String gatewayTransactionId;

    @Column(name = "PAYMENT_CHANNEL")
    @Enumerated(EnumType.STRING)
    private ChannelType paymentChannelCode;

    @Column(name = "APP_TYPE")
    @Enumerated(EnumType.STRING)
    private AppType appType;

    @Column(name = "GATEWAY_CANDIDATE_TX_ID_1")
    private String gatewayCandidateTransactionId1;

    @Column(name = "GATEWAY_CANDIDATE_TX_ID_2")
    private String gatewayCandidateTransactionId2;

    @Column(name = "STATUS", nullable = false)
    @Enumerated(EnumType.STRING)
    private TransactionStatus transactionStatus;

    @Column(name = "ERROR_CODE")
    private String errorCode;

    @Lob
    @Column(name = "ERROR_DESCRIPTION")
    private String errorDescription;

    @Column(name = "AMOUNT", nullable = false)
    private BigDecimal amount;

    @Column(name = "CALLBACK_URL")
    private String callBackUrl;

    @Column(name = "INITIATED_BY", nullable = false)
    @Enumerated(EnumType.STRING)
    private TransactionInitiator transactionInitiator;

}

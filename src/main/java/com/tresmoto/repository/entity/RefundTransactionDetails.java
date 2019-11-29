package com.tresmoto.repository.entity;

import com.tresmoto.constants.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name = "REFUND_TRANSACTION_DETAILS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RefundTransactionDetails extends AbstractAttributes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "GATEWAY_CODE")
    @Enumerated(EnumType.STRING)
    private PaymentGatewayType paymentGatewayCode;

    @Column(name = "PAYMENT_TRANSACTION_ID", nullable = true)
    private String paymentTransactionId;

    @Column(name = "TRANSACTION_ID", nullable = true)
    private String transactionId;

    @Column(name = "GATEWAY_TRANSACTION_ID", nullable = true)
    private String gatewayTransactionId;

    @Column(name = "STATUS", nullable = false)
    @Enumerated(EnumType.STRING)
    private TransactionStatus transactionStatus;

    @Column(name = "GATEWAY_CANDIDATE_TX_ID_1")
    private String gatewayCandidateTransactionId1;

    @Column(name = "GATEWAY_CANDIDATE_TX_ID_2")
    private String gatewayCandidateTransactionId2;

    @Column(name = "AMOUNT", nullable = false)
    private BigDecimal amount;

    @Column(name = "INITIATED_BY", nullable = false)
    @Enumerated(EnumType.STRING)
    private TransactionInitiator transactionInitiator;

    @Column(name = "PURCHASE_TRANSACTION_DATE")
    private Long purchaseTransactionDate;
}

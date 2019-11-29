package com.tresmoto.repository.entity;


import com.tresmoto.constants.PaymentMode;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
@Table(name = "PAYMENT_MODE_CONFIG")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PaymentModeConfig extends AbstractAttributes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private BigInteger id;

    @Column(name = "TENANT_CODE", nullable = false)
    private String tenantCode;

    @Column(name = "PAYMENT_MODE", nullable = false)
    @Enumerated(EnumType.STRING)
    private PaymentMode paymentMode;

    @Column(name = "CHANNEL_TYPE", nullable = false)
    private String channelType;

    @Column(name = "AMOUNT_CAP")
    private BigDecimal amountCap;

    @Column(name = "DISPLAY_PRIORITY", nullable = false)
    private BigInteger priority;
}

package com.tresmoto.repository.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "PAYMENT_ROUTING_CONFIG")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PaymentRoutingConfig extends AbstractAttributes {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "ROUTING_PERCENTAGE", nullable = false)
    private Double routingPercentage;

    @Column(name = "PAYMENT_MODE", nullable = false)
    private String paymentMode;

    @Column(name = "PAYMENT_GATEWAY_CODE")
    private String paymentGatewayCode;

    @Column(name = "TENANT_CODE", nullable = false)
    private String tenantCode;

    @Column(name = "CHANNEL_TYPE", nullable = false)
    private String channelType;

    @Column(name = "BANK_NAME")
    private String bankName;

    @Column(name = "DISPLAY_PRIORITY", nullable = false)
    private BigInteger priority;

}

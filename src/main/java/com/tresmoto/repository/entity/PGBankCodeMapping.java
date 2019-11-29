package com.tresmoto.repository.entity;

import com.tresmoto.constants.PaymentGatewayType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "PAYMENT_GATEWAY_BANK_CODE_MAPPING")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PGBankCodeMapping extends AbstractAttributes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "PAYMENT_GATEWAY_CODE", nullable = false)
    @Enumerated(EnumType.STRING)
    private PaymentGatewayType paymentGatewayCode;

    @Column(name = "PAYMENT_BANK_CODE", nullable = false)
    private String paymentBankCode;

    @Column(name = "GATEWAY_BANK_CODE", nullable = false)
    private String gatewayBankCode;

    @Column(name = "PAYMENT_MODE", nullable = false)
    private String paymentMode;
}

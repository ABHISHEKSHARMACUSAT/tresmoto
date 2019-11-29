package com.tresmoto.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TransactionType {

    PURCHASE_TRANSACTION("PURCHASE_TRANSACTION"),
    REFUND_TRANSACTION("REFUND_TRANSACTION");

    String code;
}

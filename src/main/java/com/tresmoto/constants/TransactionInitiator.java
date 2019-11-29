package com.tresmoto.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TransactionInitiator {

    TENANT_INITIATED("TENANT_INITIATED"),
    SELF_INITIATED("SELF_INITIATED");
    String code;
}

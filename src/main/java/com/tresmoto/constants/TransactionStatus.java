package com.tresmoto.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum  TransactionStatus {

    SUCCESS("SUCCESS"),
    PENDING("PENDING"),
    FAILED("FAILED"),
    ABORTED("ABORTED"),
    INVALID("INVALID"),
    ROLLBACK("ROLLBACK");

    String code;
}

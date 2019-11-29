package com.tresmoto.constants;

import java.io.Serializable;

public enum PaymentMode implements Serializable {
    SAVED_CARD, SAVED_NETBANKING, SAVED_UPI, SAVED_WALLET, INTERNAL_WALLET, CARD, NET_BANKING, UPI, WALLET, COD
}

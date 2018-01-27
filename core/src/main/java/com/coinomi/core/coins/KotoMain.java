package com.coinomi.core.coins;

import com.coinomi.core.coins.families.ZFamily;

public class KotoMain extends ZFamily {
    private KotoMain() {
        id = "koto.main";

        addressHeader = 61;
        p2shHeader = 6203;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;

        name = "Koto";
        symbol = "KOTO";
        uriScheme = "koto";
        bip44Index = 133;
        unitExponent = 8;
        feeValue = value(100000);
        minNonDust = value(1000); // 0.00001 KOTO mininput
        softDustLimit = value(100000); // 0.001 KOTO
        softDustPolicy = com.coinomi.core.coins.SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
    }

    private static KotoMain instance = new KotoMain();
    public static synchronized KotoMain get() {
        return instance;
    }
}

package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {
    public static double roundToHundredth(BigDecimal number) {
        return number.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static BigDecimal interAndRoundToTenth(BigDecimal number){
        BigDecimal inverted = number.negate();
        return inverted.setScale(1, RoundingMode.HALF_UP);
    }

}

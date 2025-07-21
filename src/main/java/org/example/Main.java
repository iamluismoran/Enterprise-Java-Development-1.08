package org.example;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // BigDecimalOperations

        BigDecimal num1 = new BigDecimal("14.4861");
        BigDecimal num2 = new BigDecimal("1.3564");
        BigDecimal num3= new BigDecimal("-45.67");

        System.out.println("Redondeado a la céntesima: " + BigDecimalOperations.roundToHundredth(num1));
        System.out.println("Invertido y redondeado(1.3564): " + BigDecimalOperations.interAndRoundToTenth(num2));
        System.out.println("Invertido y redondeado(-45.67): " + BigDecimalOperations.interAndRoundToTenth(num3));
    }
}
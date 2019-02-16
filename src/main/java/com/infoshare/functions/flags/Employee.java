package com.infoshare.functions.flags;

import java.math.BigDecimal;

public class Employee {

    private BigDecimal salary;

    public BigDecimal calculatePay(boolean bonus) {
        BigDecimal toPay = BigDecimal.ZERO;
        if (bonus) {
            toPay = this.salary.multiply(BigDecimal.valueOf(1.2));
        } else {
            toPay = this.salary;
        }
        return toPay;
    }

}

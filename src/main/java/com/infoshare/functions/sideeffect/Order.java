package com.infoshare.functions.sideeffect;

import java.math.BigDecimal;

import static com.infoshare.functions.sideeffect.Status.PAID;

public class Order {
    private Customer customer;
    private Status status;
    private BigDecimal value;
    private EmailService emailService;

    public boolean pay() {
        if (this.customer.charge(this.value)) {
            this.status = PAID;
            this.emailService.sendEmail("Congratulatons!");
            return true;
        }
        return false;
    }
}

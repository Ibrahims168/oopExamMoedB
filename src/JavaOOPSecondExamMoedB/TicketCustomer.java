package JavaOOPSecondExamMoedB;

import java.util.ArrayList;

public enum TicketCustomer {
    REGULAR(0),
    VIP(50);

    private final int discountAmount;

    TicketCustomer(int discountAmount) {
        this.discountAmount = discountAmount;
    }

    public int getDiscountAmount() {
        return discountAmount;
    }
}




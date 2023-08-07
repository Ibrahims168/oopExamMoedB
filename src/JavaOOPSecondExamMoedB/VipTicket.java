package JavaOOPSecondExamMoedB;

import java.time.LocalDate;
import java.util.ArrayList;

public class VipTicket extends Ticket{

    public VipTicket(Integer id, String showName, LocalDate showDate, double rowNumber, double sitNumber, TicketCustomer ticketCustomer, Integer ticketPrice) {
        super(id, showName, showDate, rowNumber, sitNumber, ticketCustomer, ticketPrice);
        calculateVipTicketPrice();
    }


}

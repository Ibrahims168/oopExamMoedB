package JavaOOPSecondExamMoedB;

import java.time.LocalDate;

public class RegularTicket extends Ticket{
    private Integer totalPrice;
    public RegularTicket(Integer id, String showName, LocalDate showDate, double rowNumber, double sitNumber, TicketCustomer ticketCustomer, Integer ticketPrice) {
        super(id, showName, showDate, rowNumber, sitNumber, ticketCustomer, ticketPrice);
        this.totalPrice = this.getTicketPrice();
    }


}

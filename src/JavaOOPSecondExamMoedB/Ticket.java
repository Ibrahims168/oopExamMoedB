package JavaOOPSecondExamMoedB;

import java.time.LocalDate;

public class Ticket {
    private Integer id;
    private String showName;
    private LocalDate showDate;
    private double rowNumber;
    private double sitNumber;
    private TicketCustomer ticketCustomer;
    private Integer ticketPrice;

    public Ticket(Integer id, String showName, LocalDate showDate, double rowNumber, double sitNumber, TicketCustomer ticketCustomer, Integer ticketPrice) {
        this.id = id;
        this.showName = showName;
        this.showDate = showDate;
        this.rowNumber = rowNumber;
        this.sitNumber = sitNumber;
        this.ticketCustomer = ticketCustomer;
        this.ticketPrice = ticketPrice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShowName() {
        System.out.println("Show-Name: " + showName);
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public LocalDate getShowDate() {
        return showDate;
    }

    public void setShowDate(LocalDate showDate) {
        this.showDate = showDate;
    }

    public double getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(double rowNumber) {
        this.rowNumber = rowNumber;
    }

    public double getSitNumber() {
        return sitNumber;
    }

    public void setSitNumber(double sitNumber) {
        this.sitNumber = sitNumber;
    }

    public TicketCustomer getTicketCustomer() {
        return ticketCustomer;
    }

    public void setTicketCustomer(TicketCustomer ticketCustomer) {
        this.ticketCustomer = ticketCustomer;
    }

    public Integer getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(Integer ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public boolean isVipTicket() {
        return true;
    }

    public void calculateVipTicketPrice() {
        if (ticketCustomer == TicketCustomer.VIP) {
            ticketPrice -= ticketCustomer.getDiscountAmount();
        } else {
            throw new IllegalArgumentException("VIP customer required for VIP ticket.");
        }
    }

    public Show setShow(Show show) {
        return show;
    }

    public void applyDiscount() {
        if (ticketCustomer == TicketCustomer.VIP) {
            ticketPrice -= ticketCustomer.getDiscountAmount();
        }
    }
}

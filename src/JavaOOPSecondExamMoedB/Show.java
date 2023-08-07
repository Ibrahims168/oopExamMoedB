package JavaOOPSecondExamMoedB;

import java.time.LocalDate;
import java.util.ArrayList;

public class Show {
    private Integer id;
    private String showName;
    private LocalDate showDate;
    static ArrayList<Ticket> showTickets;

    public Show(Integer id, String showName, LocalDate showDate) {
        this.id = id;
        this.showName = showName;
        this.showDate = showDate;
        this.showTickets = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShowName() {
        System.out.println("Show Name: " + showName);
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public LocalDate getShowDate() {
        System.out.println("Show Date: " + showDate);
        return showDate;
    }

    public void setShowDate(LocalDate showDate) {
        this.showDate = showDate;
    }

    public ArrayList<Ticket> getTickets() {
        return showTickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.showTickets = tickets;
    }

    public void addTicket(Ticket ticket) {
        showTickets.add(ticket);
    }

    public void removeTicket(Ticket ticket) {
        showTickets.remove(ticket);
    }

    public int calculateShowRevenue() {
        int totalRevenue = 0;
        for (Ticket ticket : showTickets) {
            totalRevenue += ticket.getTicketPrice();
        }
        return totalRevenue;
    }

    public int calculateTotalDiscount() {
        int totalDiscount = 0;
        for (Ticket ticket : showTickets) {
            if (ticket.getTicketCustomer() == TicketCustomer.VIP) {
                totalDiscount += ticket.getTicketCustomer().getDiscountAmount();
            }
        }
        return totalDiscount;
    }
}


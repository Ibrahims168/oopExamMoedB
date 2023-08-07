package JavaOOPSecondExamMoedB;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Ticket firstRegularTicket = new Ticket(1, "Eyal Golan", LocalDate.of(2023, 8, 10), 5, 15, TicketCustomer.REGULAR, 100);
        Ticket firstVipTicket = new Ticket(2, "Eyal Golan", LocalDate.of(2023, 8, 10), 7, 18, TicketCustomer.VIP, 200);
        Ticket secondVipTicket = new Ticket(3, "Eyal Golan", LocalDate.of(2023, 8, 10), 7, 18, TicketCustomer.VIP, 200);

        firstRegularTicket.getShowName();

        System.out.println("Regular Ticket Price: " + firstRegularTicket.getTicketPrice());
        System.out.println("VIP Ticket Price : " + firstVipTicket.getTicketPrice());

        firstRegularTicket.applyDiscount();
        firstVipTicket.applyDiscount();
        secondVipTicket.applyDiscount();

        System.out.println("**** VIP CUSTOMER ****");
        System.out.println("VIP Ticket Price AFTER Discount: " + firstVipTicket.getTicketPrice());


        Ticket invalidVipTicket = new Ticket(1, "Concert", LocalDate.of(2023, 8, 10), 5, 15, TicketCustomer.REGULAR, 150);
        try {
            invalidVipTicket.calculateVipTicketPrice();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }


        Show show = new Show(1, "Eyal Golan", LocalDate.of(2023, 8, 10));
        show.getShowDate();

        show.addTicket(firstRegularTicket);
        show.addTicket(firstVipTicket);
        show.addTicket(secondVipTicket);

        show.removeTicket((secondVipTicket));

        ArrayList<Ticket> soldTickets = show.getTickets();
        int totalRevenue = show.calculateShowRevenue();
        int totalDiscount = show.calculateTotalDiscount();

        System.out.println("SOLD tickets: " + soldTickets.size());
        System.out.println("Show Revenue: $" + totalRevenue);
        System.out.println("Total Discount: $" + totalDiscount);


        Customer RegularCustomer = new Customer(1, "ibrahim", "sharif", "ibrahim@example.com", "123 Main St", TicketCustomer.REGULAR, null);
        Customer VipCustomer = new Customer(2, "adam", "omer", "adam@example.com", "456 Elm St", TicketCustomer.VIP, null);

        FoodVoucher foodVoucher = new FoodCoupon();
        VipCustomer.takeFoodVoucher(foodVoucher);

        RegularCustomer.eatFood();
        VipCustomer.eatFood();

        }
    }



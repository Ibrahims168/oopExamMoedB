package JavaOOPSecondExamMoedB;

public class Customer {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String deliveryAddress;
    private TicketCustomer customerType;
    private Integer customerDiscount;
    private FoodVoucher foodVoucher;

    public Customer(Integer id, String firstName, String lastName, String email, String deliveryAddress, TicketCustomer customerType, Integer customerDiscount) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.deliveryAddress = deliveryAddress;
        this.customerType = customerType;
        this.customerDiscount = customerDiscount;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public TicketCustomer getCustomerType() {
        return customerType;
    }

    public Integer getCustomerDiscount() {
        return customerDiscount;
    }

    public void takeFoodVoucher(FoodVoucher foodVoucher) {
        this.foodVoucher = foodVoucher;
    }

    public void eatFood() {
        if (foodVoucher != null) {
            foodVoucher.eat();
        } else {
            System.out.println("No food voucher available");
        }
    }
}

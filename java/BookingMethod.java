// Abstract class
public abstract class BookingMethod {

    // Abstract method
    public abstract void pay(int amount);
}

class Cash extends BookingMethod {

    @Override
    public void pay(int amount) {
        System.out.println("\nPayment Method: CASH");
        System.out.println("Amount Paid: ₹" + amount);
        System.out.println("Payment Successful!");
    }
}


class Card extends BookingMethod {

    @Override
    public void pay(int amount) {
        System.out.println("\nPayment Method: CARD");
        System.out.println("Amount Paid: ₹" + amount);
        System.out.println("Payment Successful!");
    }
}


// UPI Payment
class UPI extends BookingMethod {

    @Override
    public void pay(int amount) {
        System.out.println("\nPayment Method: UPI");
        System.out.println("Amount Paid: ₹" + amount);
        System.out.println("Payment Successful!");
    }
}


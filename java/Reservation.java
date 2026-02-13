class Reservation {

    private final String customerName;
    private final String contactNumber;
    private final String email;
    private final int customerAge;
    private final String checkInDate;
    private final String checkOutDate;
    private final int numberOfGuests;
    private final int numberOfRooms;
    private final String roomType;
    private final int stayDuration;
    private final String paymentMethod;

    public Reservation(String customerName, String contactNumber, String email, int customerAge,
                       String checkInDate, String checkOutDate, int numberOfGuests,
                       int numberOfRooms, String roomType, int stayDuration, String paymentMethod) {

        this.customerName = customerName;
        this.contactNumber = contactNumber;
        this.email = email;
        this.customerAge = customerAge;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.numberOfGuests = numberOfGuests;
        this.numberOfRooms = numberOfRooms;
        this.roomType = roomType;
        this.stayDuration = stayDuration;
        this.paymentMethod = paymentMethod;
    }

    public void displayDetails() {
        System.out.println("\nReservation Details");
        System.out.println("------------------------------");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Email: " + email);
        System.out.println("Customer Age: " + customerAge);
        System.out.println("Check-in Date: " + checkInDate);
        System.out.println("Check-out Date: " + checkOutDate);
        System.out.println("Guests: " + numberOfGuests);
        System.out.println("Rooms: " + numberOfRooms);
        System.out.println("Room Type: " + roomType);
        System.out.println("Stay Duration: " + stayDuration + " days");
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("------------------------------");
    }
}

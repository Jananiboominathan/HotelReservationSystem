import java.util.Scanner;

public class HotelReservationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Hotel Details
        Hotel hotel = new Hotel();
        hotel.hotelDetails();

        // Customer Inputs
        System.out.print("Enter customer name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter contact number: ");
        String contactNumber = sc.nextLine();

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        System.out.print("Enter customer age: ");
        int customerAge = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter check-in date (YYYY-MM-DD): ");
        String checkInDate = sc.nextLine();

        System.out.print("Enter check-out date (YYYY-MM-DD): ");
        String checkOutDate = sc.nextLine();

        System.out.print("Enter number of guests: ");
        int numberOfGuests = sc.nextInt();

        System.out.print("Enter number of rooms: ");
        int numberOfRooms = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter room type (single/suite): ");
        String roomType = sc.nextLine();

        System.out.print("Enter stay duration (in days): ");
        int stayDuration = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter payment method (cash/card/upi): ");
        String paymentMethod = sc.nextLine();

        // Create Reservation
        Reservation reservation = new Reservation(
                customerName, contactNumber, email, customerAge,
                checkInDate, checkOutDate, numberOfGuests,
                numberOfRooms, roomType, stayDuration, paymentMethod
        );

        reservation.displayDetails();

        // Room Objects
        Room singleRoom = new Room(10, 1000, "single");
        Room suiteRoom = new Room(5, 1500, "suite");

        Room selectedRoom;

        if (roomType.equalsIgnoreCase("single")) {
            selectedRoom = singleRoom;
        } else {
            selectedRoom = suiteRoom;
        }

        selectedRoom.bookRoom(numberOfRooms);
        int totalAmount = selectedRoom.calculatePrice(numberOfRooms);

        // Payment
        BookingMethod booking;

        switch (paymentMethod.toLowerCase()) {
            case "cash":
                booking = new Cash();
                break;
            case "card":
                booking = new Card();
                break;
            case "upi":
                booking = new UPI();
                break;
            default:
                System.out.println("Invalid payment method.");
                sc.close();
                return;
        }

        booking.pay(totalAmount);

        sc.close();
    }
}

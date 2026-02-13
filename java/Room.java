public class Room {

    private int availableRooms;
    private final int price;
    private final String roomType;

    public Room(int availableRooms, int price, String roomType) {
        this.availableRooms = availableRooms;
        this.price = price;
        this.roomType = roomType;
    }

    public void bookRoom(int numberOfRooms) {
        if (numberOfRooms > availableRooms) {
            System.out.println("Sorry, not enough " + roomType + " rooms available.");
        } else {
            availableRooms -= numberOfRooms;
            System.out.println(numberOfRooms + " " + roomType +
                    " room(s) booked. Available rooms: " + availableRooms);
        }
    }

    public int calculatePrice(int numberOfRooms) {
        return numberOfRooms * price;
    }
}

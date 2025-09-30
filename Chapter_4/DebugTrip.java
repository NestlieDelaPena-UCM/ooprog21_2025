public class DebugTrip {
    private String destination;
    private String departure;
    private String mode;

    private static final String DEFAULT_CITY = "Atlanta";
    private static final String DEFAULT_MODE = "car";

    public DebugTrip(String destination) {
        this(destination, DEFAULT_CITY, DEFAULT_MODE);
    }

    public DebugTrip(String destination, String departure) {
      this(destination, departure, DEFAULT_MODE);  // FIXED
    }

    public DebugTrip(String destination, String departure, String mode) {
        this.destination = destination;
        this.departure = departure;
        this.mode = mode;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureCity() {
        return departure;
    }

    public String getMode() {
        return mode;
    }

    public void displayInfo() {
        System.out.println("Trip Destination: " + destination);
        System.out.println("Departure City: " + departure);
        System.out.println("Mode of Travel: " + mode);
    }

    public static void main(String[] args) {
        DebugTrip trip1 = new DebugTrip("New York");
        DebugTrip trip2 = new DebugTrip("Los Angeles", "Chicago");
        DebugTrip trip3 = new DebugTrip("Paris", "London", "plane");

        trip1.displayInfo();
        System.out.println();
        trip2.displayInfo();
        System.out.println();
        trip3.displayInfo();
    }
}

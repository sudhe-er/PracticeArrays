import java.util.Arrays;


class TrainTicket1 {
    private int ticketNo;
    private int trainNo;
    private String travelDate;
    private String source;
    private String destination;
    private Passenger1[] passengers;

    public TrainTicket1(int ticketNo, int trainNo, String travelDate, String source, String destination, Passenger1[] passengers) {
        this.ticketNo = ticketNo;
        this.trainNo = trainNo;
        this.travelDate = travelDate;
        this.source = source;
        this.destination = destination;
        this.passengers = passengers;
    }

    // Display ticket details
    public void displayTicketDetails() {
        System.out.println("Ticket Number: " + ticketNo);
        System.out.println("Train Number: " + trainNo);
        System.out.println("Travel Date: " + travelDate);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Passengers:");
        for (Passenger1 passenger : passengers) {
            System.out.println("  Name: " + passenger.getName() +
                    ", Age: " + passenger.getAge() +
                    ", Gender: " + passenger.getGender());
        }
    }

    // Calculate final fare based on base fare and passenger discounts
    public float calculateFinalFare(double baseFare) {
        float totalFare = 0;
        for (Passenger1 passenger : passengers) {
            if (passenger.getAge() < 5) {
                totalFare += 0; // 100% discount for passengers below 5 years
            } else if (passenger.getAge() >= 5 && passenger.getAge() <= 12) {
                totalFare += 0.5 * baseFare; // 50% discount for passengers aged 5-12
            } else {
                // 25% discount for male passengers aged 65 or above, or female passengers aged 58 or above
                if ((passenger.getGender() == 'M' && passenger.getAge() >= 65) ||
                        (passenger.getGender() == 'F' && passenger.getAge() >= 58)) {
                    totalFare += 0.75 * baseFare;
                } else {
                    totalFare += baseFare;
                }
            }
        }
        return totalFare;
    }
}


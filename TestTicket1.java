import java.util.Scanner;
public class TestTicket1 {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter total number of Members to travel : ");
	int n = s.nextInt();
        Passenger1[] passengers = new Passenger1[n];
	for(int i = 0; i < n; i++) {
		String st = s.next();
		int ag =  s.nextInt();
		char g = s.next().charAt(0);
		passengers[i] = new Passenger1( st, ag, g);
	}

        TrainTicket1 ticket = new TrainTicket1(12345, 123, "2024-02-15", "CityA", "CityB", passengers);

        System.out.println("Ticket Details:");
        ticket.displayTicketDetails();

        double baseFare = 100.0; // Example base fare
        float finalFare = ticket.calculateFinalFare(baseFare);
        System.out.println("Total Fare: $" + finalFare);
    }
}

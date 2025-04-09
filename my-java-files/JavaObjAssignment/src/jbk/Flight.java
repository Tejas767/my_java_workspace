package jbk;

public class Flight {
	 String flightNumber;
	    String airline;
	    String departureCity;
	    String destinationCity;
	    String departureTime;
	    int ticketPrice;

	public static void main(String[] args) {
       Flight f1 = new Flight();
        
        System.out.println(f1.flightNumber = "AI101");
        System.out.println(f1.airline = "Air India");
        System.out.println(f1.departureCity = "Mumbai");
        System.out.println(f1.destinationCity = "Delhi");
        System.out.println(f1.departureTime = "10:30 AM");
        System.out.println(f1.ticketPrice = 5000);
        
        System.out.println("--------------------------------------------");
        
        Flight f2 = new Flight();
        
        System.out.println(f2.flightNumber = "EK505");
        System.out.println(f2.airline = "Emirates");
        System.out.println(f2.departureCity = "Pune");
        System.out.println(f2.destinationCity = "Dubai");
        System.out.println(f2.departureTime = "3:00 PM");
        System.out.println(f2.ticketPrice = 15000);

	}

}

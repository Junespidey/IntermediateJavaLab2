import java.text.*;
/**
 * Class representing customer object
 * @author Namita Singla 
 * Modified by Ting Zhang
 * CSC 2206 Lab 2
 */
public class Customer {

 private final static int MAX_SIZE = 100;

 private Rental[] rentals; // All rentals for this customer
 private int numRentals;   // Number of rentals for this customer
 private String name;      // Customer name

 /**
  * Constructor
  * @param name name of customer
  */
 public Customer(String name) {
	 this.name = name;
	 rentals = new Rental[MAX_SIZE];
 }

 /**
  * Add rental for this customer
  * 
  * @param arg Rental
  */
 public void addRental(Rental rent) {
	 if (numRentals >= MAX_SIZE) {
		 System.err.println("Too many rentals.");
		 return;
	 }
	 rentals[numRentals] = rent;
	 numRentals++;
 }

 /**
  * Get customer name
  * @return name of the customer
  */
 public String getName() {
	 return name;
 }

 /**
  * Return statement for this customer
  * @return rental statement
  */
 public String statement() {
	 NumberFormat fmt = DecimalFormat.getCurrencyInstance();
	 String result = "Rental record for " + getName() + "\n";
	 result += "****************************************************************\n";
	 result += "Type\tMovie Name\tDays Rented\tCharge\n";
	 result += "----------------------------------------------------------------\n";
	 for (int i = 0; i < numRentals; i++) {
	   result += rentals[i].getMovie().getType() + "\t" + rentals[i].getMovie().getTitle() + "\t"
			   + rentals[i].getDaysRented() + "\t" + fmt.format(rentals[i].getCharge()) + "\n";
	 }
	 result += "----------------------------------------------------------------\n";
	 result += "Amount owed is " + fmt.format(getTotalCharge()) + "\n";
	 result += "You earned " + getTotalFrequentRenterPoints()
	    + " frequent renter points";
	 return result;
 }

 /**
  * Get total charge for all rentals made by the customer 
  * @return charge
  */
 public double getTotalCharge() {
	 double result = 0;
	 for (int i = 0; i < numRentals; i++)
	   result += rentals[i].getCharge();
	 return result;
 }

 /**
  * Get frequent renter points earned by this customer on all rentals
  * @return bonus points earned
  */
 public int getTotalFrequentRenterPoints() {
	 int result = 0;
	 for (int i = 0; i < numRentals; i++)
	   result += rentals[i].getFrequentRenterPoints();
	 return result;
 }

 public static void main(String[] args) {
	 Customer c = new Customer("Kent Beck");
	 Movie r1 = new Movie("Usual Suspects", Movie.REGULAR);
	 Movie r2 = new Movie("Silence of the Lambs", Movie.REGULAR);
	 //Instantiate two Movie object of the type CHILDREN

	 //Instantiate two Movie object of the type NEW_RELEASE

	 c.addRental(new Rental(r1, 3));
	 c.addRental(new Rental(r2, 2));
	 
	 //Add the above four new created movies to the rental list

	 System.out.println(c.statement());
 }
}
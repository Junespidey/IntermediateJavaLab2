/**
 * Regular price class, representing price for regular movies
 * @author Ting Zhang
 * CSC 2206 Lab 2
 */

public class RegularPrice extends Price {

 /**
  * Get price code
  */
 public int getPriceCode() {
	 return Movie.REGULAR;
 }

 /**
  * Calculate price for regular movies
  * @param daysRented number of days
  */
 public double getCharge(int daysRented) {
	 double result = 2;
	 if (daysRented > 2)
		  result += (daysRented - 2) * 1.5;
	 return result;
 }
}
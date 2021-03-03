/**
 * Representing Price object
 * 
 * @author Namita Singla
 * Modified by Ting Zhang
 * CSC 2206 Lab 2
 */

public class Price {

	public int getPriceCode() {
		return Movie.REGULAR;
	}

	public double getCharge(int daysRented) {
		return daysRented * 2.0;
	}

	/**
	 * Get frequent renter points
	 * @param daysRented  number of days
	 * @return frequent points earned
	 */
	public int getFrequentRenterPoints(int daysRented) {
		return 1;
	}
}
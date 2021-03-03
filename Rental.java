/**
 * Representing Rental object
 * @author Namita Singla
 * Modified by Ting Zhang
 * CSC 2206 Lab 2
 */

public class Rental {

	private Movie movie; // Movie rented
	private int daysRented; // number of days for this rental

	/**
	 * Constructor
	 * 
	 * @param movie Movie rented
	 * @param daysRented number of days for this rental
	 */
	public Rental(Movie movie, int daysRented) {
		this.movie = movie;
		this.daysRented = daysRented;
	}

	/**
	 * Get days rented
	 * 
	 * @return number of days for this rental
	 */
	public int getDaysRented() {
		return daysRented;
	}

	/**
	 * Get movie rented
	 * @return movie rented in this rental
	 */
	public Movie getMovie() {
		return movie;
	}

	/**
	 * Get charge for this rental
	 * @return charge for the movie rented
	 */
	public double getCharge() {
		return movie.getCharge(daysRented);
	}

	/**
	 * Get frequent rental points for this rental
	 * 
	 * @return frequent renter points
	 */
	public int getFrequentRenterPoints() {
		return movie.getFrequentRenterPoints(daysRented);
	}
}
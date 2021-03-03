/**
 * Representing movie object
 * @author Namita Singla
 * Modified by Ting Zhang
 * CSC 2206 Lab 2 
 */
public class Movie {

	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	public static final int CHILDREN = 2;

	private String title;
	private Price price;	
	private String type;

	/**
	 * Constructor
	 * 
	 * @param title Title of this movie
	 * @param priceCode Price code of this movie
	 */
	public Movie(String title, int priceCode) {
		this.title = title;
		setPriceCode(priceCode);
		switch(priceCode) {
		case Movie.REGULAR:
			type = "Regular";
			break;
		case Movie.CHILDREN:
			type = "Children";
			break;
		case Movie.NEW_RELEASE:
			type = "New Release";
			break;
		}
	}

	/**
	 * Get price code
	 * 
	 * @return price code
	 */
	public int getPriceCode() {
		return price.getPriceCode();
	}

	/**
	 * Set price code
	 * 
	 * @param priceCode Price code to set for this movie
	 */
	public void setPriceCode(int priceCode) {
		switch (priceCode) {
		case Movie.REGULAR:
			price = new RegularPrice();
			break;
		// ADD YOUR CODE HERE
		}
	}
	
	public String getType() {
		
		return type;
	}
	
	public void setType(int priceCode) {
		switch(priceCode) {
		case Movie.REGULAR:
			type = "Regular";
			break;
		case Movie.CHILDREN:
			type = "Children";
			break;
		case Movie.NEW_RELEASE:
			type = "New Release";
			break;
		}
	}

	public String getTitle() {
		return title;
	}

	/**
	 * Get charge for this movie
	 * 
	 * @param daysRented number of days the movie is rented
	 * @return charge for this movie
	 */
	public double getCharge(int daysRented) {
		return price.getCharge(daysRented);
	}

	/**
	 * Get frequent renter points earned by renting this movie
	 * 
	 * @param daysRented number of days the movie is rented
	 * @return frequent renter points
	 */
	public int getFrequentRenterPoints(int daysRented) {
		return price.getFrequentRenterPoints(daysRented);
	}
}
public class Rental {

   private Movie _movie;
   private int _daysRented;

   public Rental(Movie movie, int daysRented) {
      _movie = movie;
      _daysRented = daysRented;
   }

  public double getCharge() {
    return _movie.getCharge(_daysRented);
  }

  public int getFrequentRenterPoints() {
    // add bonus for a two day new release rental
    return _movie.getFrequentRenterPoints(_daysRented);
  }
  
   public int getDaysRented() {
      return _daysRented;
   }

   public Movie getMovie() {
      return _movie;
   }
}
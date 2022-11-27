public abstract class Price {
  public abstract int getPriceCode();
  public int getFrequentRenterPoints(int daysRented) {
    // add bonus for a two day new release rental
    if ((this.getPriceCode() == Movie.NEW_RELEASE) &&
            daysRented > 1) return 2;
    return 1;
  }
  public abstract double getCharge(int daysRented);
}
public interface Book {
    String getISBN();
    String getTitle();
    String getAuthor();
    int getYear();
    double getPrice();
    boolean isOutdated(int currentYear, int maxAge);
    boolean isForSale();
    void handlePurchase(String email, String address, int quantity);
}

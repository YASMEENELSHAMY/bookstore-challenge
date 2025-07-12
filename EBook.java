public class EBook implements Book {
    private String isbn, title, author, fileType;
    private int year;
    private double price;

    public EBook(String isbn, String title, String author, int year, double price, String fileType) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
        this.fileType = fileType;
    }

    @Override
    public String getISBN() {
        return isbn;
    }
    @Override
    public String getTitle() {
        return title;
    }
    @Override
    public String getAuthor() {
        return author;
    }
    @Override
    public int getYear() {
        return year;
    }
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isOutdated(int currentYear, int maxAge) {
        return currentYear - year > maxAge;
    }

    @Override
    public boolean isForSale() {
        return true;
    }

    @Override
    public void handlePurchase(String email, String address, int quantity) {
        double total = price * quantity;
        System.out.println("Book store: Paid amount = " + total);
        System.out.println("Book store: EBook will be sent to " + email);
    }
}

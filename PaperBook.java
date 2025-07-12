public class PaperBook implements Book {
    private String isbn, title, author;
    private int year, stock;
    private double price;

    public PaperBook(String isbn, String title, String author, int year, double price, int stock) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
        this.stock = stock;
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
        if (quantity > stock) {
            throw new IllegalStateException("Book store: Not enough stock for ISBN " + isbn);
        }
        stock -= quantity;
        double total = price * quantity;
        System.out.println("Book store: Paid amount = " + total);
        System.out.println("Book store: Paper book will be shipped to " + address);

    }
}

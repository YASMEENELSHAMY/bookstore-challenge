public class ShowcaseBook implements Book {
    private String isbn, title, author;
    private int year;

    public ShowcaseBook(String isbn, String title, String author, int year) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.year = year;
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
        return 0;
    }

    @Override
    public boolean isOutdated(int currentYear, int maxAge) {
        return currentYear - year > maxAge;
    }

    @Override
    public boolean isForSale() {
        return false;
    }

    @Override
    public void handlePurchase(String email, String address, int quantity) {
        throw new UnsupportedOperationException("Book store: This book is not for sale.");
    }
}

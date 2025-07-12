import java.util.*;

public class InventoryManager {
    private Map<String, Book> inventory = new HashMap<>();

    public void addBook(Book book) {
        inventory.put(book.getISBN(), book);
        System.out.println("Book store: Added book " + book.getTitle());
    }

    public void removeOutdatedBooks(int currentYear, int maxAge) {
        Iterator<Map.Entry<String, Book>> it = inventory.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Book> entry = it.next();
            if (entry.getValue().isOutdated(currentYear, maxAge)) {
                System.out.println("Book store: Removed outdated book " + entry.getValue().getTitle());
                it.remove();
            }
        }
    }

    public void buyBook(String isbn, int quantity, String email, String address) {
        Book book = inventory.get(isbn);
        if (book == null) {
            throw new IllegalArgumentException("Book store: Book not found with ISBN " + isbn);
        }
        if (!book.isForSale()) {
            throw new IllegalStateException("Book store: Book is not for sale");
        }
        book.handlePurchase(email, address, quantity);
    }
}

public class BookstoreFullTest {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        Book paperBook = new PaperBook("ISBN001", "Java Basics", "Yasmeen Yehia", 2015, 150, 10);
        Book eBook = new EBook("ISBN002", "Learn Spring Boot", "Ahmed Yehia", 2020, 100, "PDF");
        Book showcase = new ShowcaseBook("ISBN003", "Old Manuscript", "Habiba Ayman", 2000);

        manager.addBook(paperBook);
        manager.addBook(eBook);
        manager.addBook(showcase);

        System.out.println("Book store: Removing outdated books...");
        manager.removeOutdatedBooks(2025, 10);

        System.out.println("Book store: Buying a paper book...");
        manager.buyBook("ISBN001", 2, "user@mail.com", "123 Cairo Street");

        System.out.println("Book store: Buying an ebook...");
        manager.buyBook("ISBN002", 1, "example@mail.com", "");

        System.out.println("Book store: Trying to buy showcase book...");
        try {
            manager.buyBook("ISBN003", 1, "x@mail.com", "");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

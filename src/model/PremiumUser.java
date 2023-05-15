package model;

import java.util.ArrayList;
import java.util.List;

// PremiumUser class
public class PremiumUser extends User {
    private List<Book> purchasedBooks;
    private List<Magazine> subscribedMagazines;

    public PremiumUser(String name, String identification, String registrationDate) {
        super(name, identification, registrationDate);
        this.purchasedBooks = new ArrayList<>();
        this.subscribedMagazines = new ArrayList<>();
    }

    public List<Book> getPurchasedBooks() {
        return purchasedBooks;
    }

    public List<Magazine> getSubscribedMagazines() {
        return subscribedMagazines;
    }

    @Override
    public void buyBook(Book book) {
        purchasedBooks.add(book);
        System.out.println("Book purchased successfully.");
    }

    @Override
    public void subscribeToMagazine(Magazine magazine) {
        subscribedMagazines.add(magazine);
        System.out.println("Magazine subscribed successfully.");
    }

    @Override
    public void simulateReadingSession() {
        System.out.println("Premium User: Simulating reading session...");
        // Simulate reading session logic for premium user
    }
}

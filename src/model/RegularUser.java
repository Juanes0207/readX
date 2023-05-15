package model;

import java.util.ArrayList;
import java.util.List;

// RegularUser class
public class RegularUser extends User {
    private List<Book> purchasedBooks;
    private List<Magazine> subscribedMagazines;

    public RegularUser(String name, String identification, String registrationDate) {
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
        if (purchasedBooks.size() < 5) {
            purchasedBooks.add(book);
            System.out.println("Book purchased successfully.");
        } else {
            System.out.println("You have reached the maximum number of books that can be purchased.");
        }
    }

    @Override
    public void subscribeToMagazine(Magazine magazine) {
        if (subscribedMagazines.size() < 2) {
            subscribedMagazines.add(magazine);
            System.out.println("Magazine subscribed successfully.");
        } else {
            System.out.println("You have reached the maximum number of magazines that can be subscribed.");
        }
    }

    @Override
    public void simulateReadingSession() {
        System.out.println("Regular User: Simulating reading session...");
        // Simulate reading session logic for regular user
    }
}

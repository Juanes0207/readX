package model;

import java.util.ArrayList;
import java.util.List;


public class Controller {
    private List<User> users;
    private List<Book> books;
    private List<Magazine> magazines;

    public Controller() {
        this.users = new ArrayList<>();
        this.books = new ArrayList<>();
        this.magazines = new ArrayList<>();
    }

    public void registerRegularUser(String name, String identification, String registrationDate) {
        RegularUser regularUser = new RegularUser(name, identification, registrationDate);
        users.add(regularUser);
        System.out.println("Regular user registered successfully.");
    }

    public void registerPremiumUser(String name, String identification, String registrationDate) {
        PremiumUser premiumUser = new PremiumUser(name, identification, registrationDate);
        users.add(premiumUser);
        System.out.println("Premium user registered successfully.");
    }

    public void registerBook(String id, String name, int pageCount, String review, String publicationDate,
            String genre, String coverUrl, double price, int copiesSold, int pagesRead) {
        Book book = new Book(id, name, pageCount, review, publicationDate, genre, coverUrl, price, copiesSold,
                pagesRead);
        books.add(book);
        System.out.println("Book registered successfully.");
    }

    public void registerMagazine(String id, String name, int pageCount, String publicationDate, String category,
            String coverUrl, double subscriptionPrice, String emissionPeriodicity, int activeSubscriptions,
            int pagesRead) {
        Magazine magazine = new Magazine(id, name, pageCount, publicationDate, category, coverUrl, subscriptionPrice,
                emissionPeriodicity, activeSubscriptions, pagesRead);
        magazines.add(magazine);
        System.out.println("Magazine registered successfully.");
    }

    public void updateBook(String id, String newName) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                book.setName(newName);
                System.out.println("Book updated successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void updateMagazine(String id, String newName) {
        for (Magazine magazine : magazines) {
            if (magazine.getId().equals(id)) {
                magazine.setName(newName);
                System.out.println("Magazine updated successfully.");
                return;
            }
        }
        System.out.println("Magazine not found.");
    }

    public void deleteBook(String id) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                books.remove(book);
                System.out.println("Book deleted successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void deleteMagazine(String id) {
        for (Magazine magazine : magazines) {
            if (magazine.getId().equals(id)) {
                magazines.remove(magazine);
                System.out.println("Magazine deleted successfully.");
                return;
            }
        }
        System.out.println("Magazine not found.");
    }

    public void generateObjects() {
        // Generate regular users
        registerRegularUser("John Doe", "REG001", "2023-01-01");
        registerRegularUser("Jane Smith", "REG002", "2023-02-01");
    
        // Generate premium users
        registerPremiumUser("Michael Johnson", "PREM001", "2023-03-01");
        registerPremiumUser("Emily Davis", "PREM002", "2023-04-01");
    
        // Generate books
        registerBook("B001", "Book 1", 200, "Great book", "2023-01-01", "Science Fiction", "cover1.jpg", 19.99, 100, 5000);
        registerBook("B002", "Book 2", 300, "Awesome book", "2023-02-01", "Fantasy", "cover2.jpg", 24.99, 150, 6000);
    
        // Generate magazines
        registerMagazine("M001", "Magazine 1", 50, "2023-01-01", "Varieties", "cover3.jpg", 9.99, "Monthly", 500, 2000);
        registerMagazine("M002", "Magazine 2", 60, "2023-02-01", "Design", "cover4.jpg", 14.99, "Quarterly", 700, 2500);
    }

    public void buyBook(String userId, String bookId) {
        for (User user : users) {
            if (user.getIdentification().equals(userId)) {
                for (Book book : books) {
                    if (book.getId().equals(bookId)) {
                        user.buyBook(book);
                        return;
                    }
                }
                System.out.println("Book not found.");
                return;
            }
        }
        System.out.println("User not found.");
    }

    public void subscribeToMagazine(String userIdentification, String magazineId) {
        for (User user : users) {
            if (user.getIdentification().equals(userIdentification)) {
                for (Magazine magazine : magazines) {
                    if (magazine.getId().equals(magazineId)) {
                        user.subscribeToMagazine(magazine);
                        return;
                    }
                }
                System.out.println("Magazine not found.");
                return;
            }
        }
        System.out.println("User not found.");
    }

    public Product getProductById(String productId) {
        for (Book book : books) {
            if (book.getId().equals(productId)) {
                return book;
            }
        }
        for (Magazine magazine : magazines) {
            if (magazine.getId().equals(productId)) {
                return magazine;
            }
        }
        return null;
        
    }

    public User getUserById(String userId) {
        for (User user : users) {
            if (user.getIdentification().equals(userId)) {
                return user;
            }
        }
        return null;
    }


}



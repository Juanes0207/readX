package ui;

import java.util.Scanner;

import model.Book;
import model.Controller;
import model.Magazine;
import model.Product;
import model.RegularUser;
import model.User;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Controller controller = new Controller();


    public static void main(String[] args) {

        // Menú principal
        int choice;
        do {
            System.out.println("Main Menu");
            System.out.println("1. Register Users (Regular and Premium)");
            System.out.println("2. Manage Bibliographic Products");
            System.out.println("3. Automatically Generate Objects");
            System.out.println("4. Buy a Book");
            System.out.println("5. Subscribe to a Magazine");
            System.out.println("6. Simulate Reading Session");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character from input

            switch (choice) {
                case 1:
                    // Register Users (Regular and Premium)
                    registerUsers();
                    break;
                case 2:
                    // Manage Bibliographic Products
                    manageBibliographicProducts();
                    break;
                case 3:
                    // Automatically Generate Objects
                    generateObjects();
                    break;
                case 4:
                    // Buy a Book
                    buyBook();
                    break;
                case 5:
                    // Subscribe to a Magazine
                    subscribeToMagazine();
                    break;
                case 6:
                    // Simulate Reading Session (Regular User)
                    simulateReadingSession();
                    break;
                case 8:
                    // Exit the program
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        } while (choice != 8);

        scanner.close();
    }

    private static void registerUsers(){
    
        System.out.println("User Registration");
        System.out.print("Enter user type (Regular or Premium): ");
        String userType = scanner.nextLine();
        System.out.print("Enter user name: ");
        String name = scanner.nextLine();
        System.out.print("Enter user identification: ");
        String identification = scanner.nextLine();
        System.out.print("Enter registration date (yyyy-MM-dd): ");
        String registrationDate = scanner.nextLine();
    
        if (userType.equalsIgnoreCase("Regular")) {
            controller.registerRegularUser(name, identification, registrationDate);
        } else if (userType.equalsIgnoreCase("Premium")) {
            controller.registerPremiumUser(name, identification, registrationDate);
        } else {
            System.out.println("Invalid user type. User registration aborted.");
            return;
        }
    
        System.out.println("User registered successfully.");
    }
    

    private static void manageBibliographicProducts() {
    
        int choice;
        do {
            System.out.println("Bibliographic Products Menu");
            System.out.println("1. Register Book");
            System.out.println("2. Register Magazine");
            System.out.println("3. Update Book");
            System.out.println("4. Update Magazine");
            System.out.println("5. Delete Book");
            System.out.println("6. Delete Magazine");
            System.out.println("7. Go back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character from input
    
            switch (choice) {
                case 1:
                    // Register Book
                    registerBook();
                    break;
                case 2:
                    // Register Magazine
                    registerMagazine();
                    break;
                case 3:
                    // Update Book
                    updateBook();
                    break;
                case 4:
                    // Update Magazine
                    updateMagazine();
                    break;
                case 5:
                    // Delete Book
                    deleteBook();
                    break;
                case 6:
                    // Delete Magazine
                    deleteMagazine();
                    break;
                case 7:
                    // Go back to Main Menu
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
    
            System.out.println();
        } while (choice != 7);
    
        scanner.close();
    }
    
    private static void registerBook() {
        System.out.println("Registering a new book:");
        System.out.print("Enter book ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter book name: ");
        String name = scanner.nextLine();
        System.out.print("Enter page count: ");
        int pageCount = scanner.nextInt();
        scanner.nextLine(); // Clear the newline character from input
        System.out.print("Enter short review: ");
        String shortReview = scanner.nextLine();
        System.out.print("Enter publication date (YYYY-MM-DD): ");
        String publicationDate = scanner.nextLine();
        System.out.print("Enter genre: ");
        String genre = scanner.nextLine();
        System.out.print("Enter cover URL: ");
        String coverUrl = scanner.nextLine();
        System.out.print("Enter selling price: ");
        double sellingPrice = scanner.nextDouble();
        System.out.print("Enter copies sold: ");
        int copiesSold = scanner.nextInt();
        System.out.print("Enter pages read: ");
        int pagesRead = scanner.nextInt();
    
        controller.registerBook(id, name, pageCount, shortReview, publicationDate, genre, coverUrl, sellingPrice, copiesSold, pagesRead);
    }

    private static void registerMagazine() {
        System.out.println("Registering a new magazine:");
        System.out.print("Enter magazine ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter magazine name: ");
        String name = scanner.nextLine();
        System.out.print("Enter page count: ");
        int pageCount = scanner.nextInt();
        scanner.nextLine(); // Clear the newline character from input
        System.out.print("Enter publication date (YYYY-MM-DD): ");
        String publicationDate = scanner.nextLine();
        System.out.print("Enter category: ");
        String category = scanner.nextLine();
        System.out.print("Enter cover URL: ");
        String coverUrl = scanner.nextLine();
        System.out.print("Enter subscription price: ");
        double subscriptionPrice = scanner.nextDouble();
        scanner.nextLine(); // Clear the newline character from input
        System.out.print("Enter emission periodicity: ");
        String emissionPeriodicity = scanner.nextLine();
        System.out.print("Enter active subscriptions: ");
        int activeSubscriptions = scanner.nextInt();
        System.out.print("Enter pages read: ");
        int pagesRead = scanner.nextInt();
    
        controller.registerMagazine(id, name, pageCount, publicationDate, category, coverUrl, subscriptionPrice, emissionPeriodicity, activeSubscriptions, pagesRead);
    }

    private static void updateBook() {
        System.out.println("Updating a book:");
        System.out.print("Enter the ID of the book to update: ");
        String id = scanner.nextLine();
        System.out.print("Enter the new name for the book: ");
        String newName = scanner.nextLine();
    
        controller.updateBook(id, newName);
    }
    
    private static void updateMagazine() {
        System.out.println("Updating a magazine:");
        System.out.print("Enter the ID of the magazine to update: ");
        String id = scanner.nextLine();
        System.out.print("Enter the new name for the magazine: ");
        String newName = scanner.nextLine();
    
        controller.updateMagazine(id, newName);
    }
    
    private static void deleteBook() {
        System.out.println("Deleting a book:");
        System.out.print("Enter the ID of the book to delete: ");
        String id = scanner.nextLine();
    
        controller.deleteBook(id);
    }
    
    private static void deleteMagazine() {
        System.out.println("Deleting a magazine:");
        System.out.print("Enter the ID of the magazine to delete: ");
        String id = scanner.nextLine();
    
        controller.deleteMagazine(id);
    }
    


    

    
    private static void generateObjects() {
        controller.generateObjects();
    }

    private static void buyBook() {    
        System.out.println("Buy a Book");
        System.out.print("Enter user identification: ");
        String userIdentification = scanner.nextLine();
    
        System.out.print("Enter book ID: ");
        String bookId = scanner.nextLine();
    
        controller.buyBook(userIdentification, bookId);
    
        System.out.println();
    }
    
    private static void subscribeToMagazine() {
        System.out.println("Subscribe to a Magazine");
        System.out.print("Enter user identification: ");
        String userIdentification = scanner.nextLine();
    
        System.out.print("Enter magazine ID: ");
        String magazineId = scanner.nextLine();
    
        controller.subscribeToMagazine(userIdentification, magazineId);
    
        System.out.println();
        
    }


    private static void simulateReadingSession() {

        System.out.println("Simulate Reading Session");
        System.out.print("Enter user ID: ");
        String userId = scanner.nextLine();
    
        User user = controller.getUserById(userId);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }
    
        System.out.print("Enter product ID: ");
        String productId = scanner.nextLine();
    
        Product product = controller.getProductById(productId);
        if (product == null) {
            System.out.println("Product not found.");
            return;
        }
    
        System.out.println("Starting reading session for " + product.getName());
    
        int currentPage = 1;
        int pagesRead = 0;
    
        if (user instanceof RegularUser) {
            if (product instanceof Book && product.getPagesRead() % 20 == 0) {
                System.out.println("Advertisement: Check out our special offers!");
            } else if (product instanceof Magazine && product.getPagesRead() % 5 == 0) {
                System.out.println("Advertisement: Subscribe to our premium content!");
            }
        }
    
        while (true) {
            System.out.println("Page: " + currentPage);
            System.out.println("1. Read previous page");
            System.out.println("2. Read next page");
            System.out.println("3. Return to Library");
    
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character from input
    
            switch (choice) {
                case 1:
                    if (currentPage > 1) {
                        currentPage--;
                        pagesRead++;
                        System.out.println("Reading previous page...");
                        System.out.println("Page read!");
                    } else {
                        System.out.println("You are already on the first page.");
                    }
                    break;
                case 2:
                    if (currentPage < product.getPageCount()) {
                        currentPage++;
                        pagesRead++;
                        System.out.println("Reading next page...");
                        System.out.println("Page read!");
    
                        if (user instanceof RegularUser) {
                            if (product instanceof Book && pagesRead % 20 == 0) {
                                System.out.println("Advertisement: Check out our special offers!");
                            } else if (product instanceof Magazine && pagesRead % 5 == 0) {
                                System.out.println("Advertisement: Subscribe to our premium content!");
                            }
                        }
                    } else {
                        System.out.println("You have reached the last page.");
                    }
                    break;
                case 3:
                    System.out.println("Returning to Library...");
                    System.out.println("Reading session ended.");
                    product.setPagesRead(product.getPagesRead() + pagesRead);
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            System.out.println("Page: " + currentPage + " of " + product.getPageCount());
            System.out.println("Product: " + product.getName());
        }
    }
    
    

}

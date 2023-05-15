package model;

// Book class
public class Book extends Product {
    private String shortReview;
    private String genre;
    private double sellingPrice;
    private int copiesSold;
    private int pagesRead;

    public Book(String id, String name, int pageCount, String shortReview, String publicationDate, String genre,
                String coverUrl, double sellingPrice, int copiesSold, int pagesRead) {
        super(id, name, pageCount, publicationDate, coverUrl);
        this.shortReview = shortReview;
        this.genre = genre;
        this.sellingPrice = sellingPrice;
        this.copiesSold = copiesSold;
        this.pagesRead = pagesRead;
    }

    // Getters and setters

    public String getShortReview() {
        return shortReview;
    }

    public void setShortReview(String shortReview) {
        this.shortReview = shortReview;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getCopiesSold() {
        return copiesSold;
    }

    public void setCopiesSold(int copiesSold) {
        this.copiesSold = copiesSold;
    }

    public int getPagesRead() {
        return pagesRead;
    }

    public void setPagesRead(int pagesRead) {
        this.pagesRead = pagesRead;
    }
}

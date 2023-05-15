package model;

// Product class
public class Product {
    private String id;
    private String name;
    private int pageCount;
    private String publicationDate;
    private String coverUrl;
    private int pagesRead;

    public Product(String id, String name, int pageCount, String publicationDate, String coverUrl) {
        this.id = id;
        this.name = name;
        this.pageCount = pageCount;
        this.publicationDate = publicationDate;
        this.coverUrl = coverUrl;
        this.pagesRead = 0; // Default value for pages read
    }

    // Getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public int getPagesRead() {
        return pagesRead;
    }

    public void setPagesRead(int pagesRead) {
        this.pagesRead = pagesRead;
    }
}

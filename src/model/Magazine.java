package model;

// Magazine class
public class Magazine extends Product {
    private String category;
    private double subscriptionPrice;
    private String emissionPeriodicity;
    private int activeSubscriptions;
    private int pagesRead;

    public Magazine(String id, String name, int pageCount, String publicationDate, String category, String coverUrl,
                    double subscriptionPrice, String emissionPeriodicity, int activeSubscriptions, int pagesRead) {
        super(id, name, pageCount, publicationDate, coverUrl);
        this.category = category;
        this.subscriptionPrice = subscriptionPrice;
        this.emissionPeriodicity = emissionPeriodicity;
        this.activeSubscriptions = activeSubscriptions;
        this.pagesRead = pagesRead;
    }

    // Getters and setters

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getSubscriptionPrice() {
        return subscriptionPrice;
    }

    public void setSubscriptionPrice(double subscriptionPrice) {
        this.subscriptionPrice = subscriptionPrice;
    }

    public String getEmissionPeriodicity() {
        return emissionPeriodicity;
    }

    public void setEmissionPeriodicity(String emissionPeriodicity) {
        this.emissionPeriodicity = emissionPeriodicity;
    }

    public int getActiveSubscriptions() {
        return activeSubscriptions;
    }

    public void setActiveSubscriptions(int activeSubscriptions) {
        this.activeSubscriptions = activeSubscriptions;
    }

    public int getPagesRead() {
        return pagesRead;
    }

    public void setPagesRead(int pagesRead) {
        this.pagesRead = pagesRead;
    }
}

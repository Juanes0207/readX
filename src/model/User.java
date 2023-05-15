package model;

// User class
public abstract class User {
    private String name;
    private String identification;
    private String registrationDate;

    public User(String name, String identification, String registrationDate) {
        this.name = name;
        this.identification = identification;
        this.registrationDate = registrationDate;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    // Abstract methods

    public abstract void buyBook(Book book);

    public abstract void subscribeToMagazine(Magazine magazine);

    public abstract void simulateReadingSession();
}

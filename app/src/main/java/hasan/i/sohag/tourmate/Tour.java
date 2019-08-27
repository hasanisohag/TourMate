package hasan.i.sohag.tourmate;

public class Tour {

    private String name;
    private String description;
    private double expence;


    public Tour() {
    }

    public Tour(String name, String description, double expence) {
        this.name = name;
        this.description = description;
        this.expence = expence;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getExpence() {
        return expence;
    }
}

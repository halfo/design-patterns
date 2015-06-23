package io.github.halfo;

public class Gadget {
    private String name;
    private double weight;
    private double displaySize;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }

    public double getDisplaySize() { return displaySize; }
    public void setDisplaySize(double displaySize) { this.displaySize = displaySize; }

    public void showInfo() {
        System.out.println("This is a " + getName());
        System.out.println("It's weight is " + getWeight() + " gm " +
                           "and display size is " + getDisplaySize() + " cm");
    }
}

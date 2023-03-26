package ro.sda.advaced._3_composition;

/* * Create a class named Dimensions with the following instance variables: width, height, depth
        * The class should contain getters for all the fields.

 */

public class Dimensions {

    private double width;
    private double length;

    private double depth;

    public Dimensions(double width, double length, double depth) {
        this.width = width;
        this.length = length;
        this.depth = depth;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getDepth() {
        return depth;
    }
}

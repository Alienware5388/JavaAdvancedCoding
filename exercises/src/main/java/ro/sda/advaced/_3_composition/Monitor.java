package ro.sda.advaced._3_composition;

import ro.sda.advaced._1_inheritance.Rectangle;

public class Monitor {

    private String model;

    private String manufacturer;

    private String size;

    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, String size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + ", " + y + " in color " + color);
    }

}

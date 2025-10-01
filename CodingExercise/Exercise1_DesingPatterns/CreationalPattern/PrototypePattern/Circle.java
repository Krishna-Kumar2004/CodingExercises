package PrototypePattern;

public class Circle extends Shape {
    private int radius;
    public Circle(int radius) {
        super("Circle");
        this.radius = radius;
    }
    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius: " + radius);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

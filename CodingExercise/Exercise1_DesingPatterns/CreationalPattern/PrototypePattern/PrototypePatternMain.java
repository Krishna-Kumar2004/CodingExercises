package PrototypePattern;


public class PrototypePatternMain {
    public static void main(String[] args) {
        // Original Circle
        Circle circle1 = new Circle(5);
        circle1.draw();

        // Clone Circle
        Circle circle2 = (Circle) circle1.cloneShape();
        circle2.setRadius(10);
        circle2.draw();

        // Original Rectangle
        Rectangle rect1 = new Rectangle(4, 6);
        rect1.draw();

        // Clone Rectangle
        Rectangle rect2 = (Rectangle) rect1.cloneShape();
        rect2.setWidth(8);
        rect2.setHeight(12);
        rect2.draw();

        // Original objects remain unchanged
        System.out.println("Original Circle after cloning:");
        circle1.draw();
        System.out.println("Original Rectangle after cloning:");
        rect1.draw();
    }
}


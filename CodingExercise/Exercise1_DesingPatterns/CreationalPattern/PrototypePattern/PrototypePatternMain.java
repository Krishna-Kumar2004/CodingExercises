package PrototypePattern;

public class PrototypePatternMain {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5); // Original Circle
        circle1.draw();

        Circle circle2 = (Circle) circle1.cloneShape(); // Clone Circle
        circle2.setRadius(10);
        circle2.draw();

        Rectangle rect1 = new Rectangle(4, 6); // Original Rectangle
        rect1.draw();

        Rectangle rect2 = (Rectangle) rect1.cloneShape(); // Clone Rectangle
        rect2.setWidth(8);
        rect2.setHeight(12);
        rect2.draw();

        System.out.println("Original Circle after cloning:");//  remain unchanged
        circle1.draw();
        
        System.out.println("Original Rectangle after cloning:");
        rect1.draw();
    }
}


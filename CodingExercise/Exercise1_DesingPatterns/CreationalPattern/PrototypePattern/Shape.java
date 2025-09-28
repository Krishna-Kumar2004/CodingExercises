package PrototypePattern;

// Abstract prototype class
public abstract class Shape implements Cloneable {
    protected String type;

    public Shape(String type) {
        this.type = type;
    }

    // Display shape info
    public abstract void draw();

    // Implement cloning
    public Shape cloneShape() {
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}


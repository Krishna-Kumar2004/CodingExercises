package PrototypePattern;

// Abstract  class
public abstract class Shape implements Cloneable {
    protected String type;

    public Shape(String type) {
        this.type = type;
    }

    //  shape info
    public abstract void draw();

    //  cloning
    public Shape cloneShape() {
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}


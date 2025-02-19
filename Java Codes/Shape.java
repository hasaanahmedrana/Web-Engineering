import javax.swing.JOptionPane;

// Base class Shape
class Shape {
    protected double area, volume;

    // Constructors
    public Shape() {}
    public Shape(double area, double volume) {
        this.area = area;
        this.volume = volume;
    }
    public void getInput() { } // To be overridden
    public String toString() { return "Area: " + area + ", Volume: " + volume; }
}

// Square subclass
class Square extends Shape {
    private double width, length, height;

    public Square() { }

    public void getInput() {
        width = Double.parseDouble(JOptionPane.showInputDialog("Enter Width:"));
        length = Double.parseDouble(JOptionPane.showInputDialog("Enter Length:"));
        height = Double.parseDouble(JOptionPane.showInputDialog("Enter Height:"));

        area = length * width;
        volume = length * width * height;
    }

    public String toString() {
        return "Square - " + super.toString();
    }
}

// Sphere subclass
class Sphere extends Shape {
    private double radius;
    private final double PI = 3.14;

    public Sphere() { }

    public void getInput() {
        radius = Double.parseDouble(JOptionPane.showInputDialog("Enter Radius:"));

        area = 4 * PI * radius * radius;
        volume = (4.0 / 3.0) * PI * radius * radius * radius;
    }

    public String toString() {
        return "Sphere - " + super.toString();
    }
}

// Driver clas
class ShapeDriver {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Square();
        shapes[1] = new Sphere();
        shapes[2] = new Square();

        // Taking input
        for (Shape shape : shapes) {
            shape.getInput();
        }

        // Displaying results
        System.out.println("\nShape Details:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
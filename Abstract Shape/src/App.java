abstract class Shape {
    String name;

    abstract void draw();

    abstract void area();

    abstract void perimeter();
}

class Rectangle extends Shape {
    int length, width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    void draw() {
        System.out.println("This is Rectangle.");
    }

    void area() {
        int recArea = length * width;
        System.out.println("Area of this rectangle: " + recArea);
    }

    public void perimeter() {
        int perArea = 2 * (length + width);
        System.out.println("Perimeter of this rectangle: " + perArea);
    }

}

class Circle extends Shape {
    int rad;

    public Circle(int rad) {
        this.rad = rad;
    }

    void draw() {
        System.out.println("This is Circle.");
    }

    void area() {
        double cirArea = 3.1416 * rad * rad;
        System.out.println("Area of this Circle: " + cirArea);
    }

    void perimeter() {
        double cirArea = 2 * 3.1416 * rad;
        System.out.println("Perimeter of this Circle: " + cirArea);
    }

}

public class App {
    public static void main(String[] args) {
        Rectangle ob1 = new Rectangle(2, 4);
        ob1.draw();
        ob1.area();
        ob1.perimeter();
        Circle cir1 = new Circle(3);
        cir1.draw();
        cir1.area();
        cir1.perimeter();
    }
}

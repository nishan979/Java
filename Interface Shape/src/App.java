interface Shape {
    String name = "Shape";

    abstract void draw();

    abstract void area();

    abstract void perimeter();

}

class Rectangle implements Shape {
    int length, width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void draw() {
        System.out.println("I am Rectangle.");
    }

    public void area() {
        int recArea = length * width;
        System.out.println("The area of Rectangle: " + recArea);
    }

    public void perimeter() {
        int recPer = 2 * (length + width);
        System.out.println("The perimeter of Rectangle: " + recPer);
    }
}

class Circle implements Shape {
    int rad;

    public Circle(int rad) {
        this.rad = rad;
    }

    public void draw() {
        System.out.println("I am Circle.");
    }

    public void area() {
        double cirArea = 3.1416 * rad * rad;
        System.out.println("The area of Circle: " + cirArea);

    }

    public void perimeter() {
        double cirPer = 2 * 3.1416 * rad;
        System.out.println("The perimeter of Circle: " + cirPer);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Rectangle ob1 = new Rectangle(2, 4);
        ob1.draw();
        ob1.area();
        ob1.perimeter();
        Circle ob2 = new Circle(3);
        ob2.draw();
        ob2.area();
        ob2.perimeter();

    }
}

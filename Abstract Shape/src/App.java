abstract class Shape {
    String name;

    abstract void draw();

   // abstract void area(int length, int width);
   // abstract void area(int rad);
    abstract void area();

    

   // abstract void perimeter(int length, int width);
    //abstract void perimeter(int rad);
    abstract void perimeter();
}

class Rectangle extends Shape {
    
    public void draw() {
        System.out.println("This is Rectangle.");
    }

    public void area(int length, int width) {
        int recArea = length * width;
        System.out.println("Area of this rectangle: " + recArea);
    }

    public void perimeter(int length, int width) {
        int perArea = 2 * (length + width);
        System.out.println("Perimeter of this rectangle: " + perArea);
    }

}

// class Circle extends Shape {
//     // int length, width;
//     void draw() {
//         System.out.println("This is Circle.");
//     }

//     void area(int rad) {
//         double cirArea = 3.1416 * rad * rad;
//         System.out.println("Area of this Circle: " + cirArea);
//     }

//     void perimeter(int rad) {
//         double cirArea = 2 * 3.1416 * rad;
//         System.out.println("Perimeter of this Circle: " + cirArea);
//     }

// }

public class App {
    public static void main(String[] args) {
        Rectangle ob1 = new Rectangle();
        ob1.draw();
        ob1.area(2, 4);
        ob1.perimeter(2, 4);
        Circle cir1 = new Circle();
        cir1.draw();
        cir1.area(3);
        cir1.perimeter(3);
    }
}

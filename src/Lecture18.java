import java.awt.Color;

public class Lecture18 {

  public static void main(String[] args) {
    System.out.println();
    System.out.println("Hello, world!");
    // SELF-CHECK PROBLEMS:
    // Note: you will need to put some of your answers inside a comments

    // Put your answer for #22 here:
    // An Interface is a contract stating that a class must implement methods from the interface it's implementing.
    // Extending a class allows a subclass to inherit the attributes and methods of a superclass.
    // Interfaces cant have state information while extended classes are allowed to.
    // A class can implement multiple interfaces but inheritance can only extend one class.

    // Put your answer for #23 here:
    // class c must implement both of the methods.
    // the methods must have the same visibility as the methods in the interface.
    // the signature of the methods must match.

    // Put your answer for #25 here:
    Point p1 = new Point(0, 0, Color.GREEN);
    System.out.println(p1.getColor());

    // Put your answer for #26 here:


    // EXERCISES:

    // Put your answer for #15 in this repo:

    // Put your answer for #16 in this repo:

    // Put your answer for #18 in this repo:
  }
}

interface Shape {
  public int getSideCount();
}

// RECTANGLE CLASS
class Rectangle {
  private double length, width;

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  public double getArea() {
    return length * width;
  }

  public double getPerimeter() {
    return (2 * length) + (2 * width);
  }

  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Rectangle rectangle = (Rectangle) obj;
    return Double.compare(rectangle.length, length) == 0 && Double.compare(rectangle.width, width) == 0;
  }
}
// RECTANGLE CLASS

// CIRCLE CLASS
class Circle {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getPerimeter() {
    double pi = 3.14159;
    return 2 * pi * radius;
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (this == null || getClass() != obj.getClass()) {
      return false;
    }
    Circle circle = (Circle) obj;
    return Double.compare(circle.radius, radius) == 0;
  }

}
// CIRCLE CLASS

// TRIANGLE CLASS
class Triangle implements Shape {
  private double base, height;

  public Triangle(double base, double height) {
    this.base = base;
    this.height = height;
  }

  public int getSideCount() {
    return 0;
  }

  public double getArea() {
    return .5 * this.base * this.height;
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Triangle triangle = new Triangle(3, 5);
    return Double.compare(triangle.base, base) == 0 && Double.compare(triangle.height, height) == 0;
  }
}
// TRIANGLE CLASS
import java.awt.Color;
import static java.lang.Math.sqrt;
import java.util.*;

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
    Rectangle r = new Rectangle(1, 2);
    Circle c = new Circle(3);
    Triangle t = new Triangle(4,5);

    System.out.println(r.getSideCount());
    System.out.println(c.getSideCount());
    System.out.println(t.getSideCount());

    // EXERCISES:

    // Put your answer for #15 in this repo:
    Octagon o = new Octagon(8);
    System.out.println(o.getSideCount());
    System.out.println(o.getArea());
    System.out.println(o.getPerimeter());

    // Put your answer for #16 in this repo:
    Hexagon h = new Hexagon(8);
    System.out.println(h.getSideCount());
    System.out.println(h.getArea());
    System.out.println(h.getPerimeter());


    // Put your answer for #18 in this repo:
    int x = 0;
    SequentialIncrementer si = new SequentialIncrementer();
    RandomIncrementer ri = new RandomIncrementer();

    si.increment();
    si.increment();
    System.out.println(si.getValue());

    ri.increment();
    System.out.println(ri.getValue());
  }
}
// Shape interface
interface Shape {
  public int getSideCount();
}

// RECTANGLE CLASS
class Rectangle implements Shape {
  private double length, width;
  private final int SIDES = 4;

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  public int getSideCount() {
    return SIDES;
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
class Circle implements Shape {
  private double radius;
  private final int SIDES = 0;

  public Circle(double radius) {
    this.radius = radius;
  }
  public int getSideCount() {
    return SIDES;
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
  private final int SIDES = 3;

  public Triangle(double base, double height) {
    this.base = base;
    this.height = height;
  }

  public int getSideCount() {
    return SIDES;
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

// OCTAGON CLASS
class Octagon implements Shape {
  private double sideLength;
  private final int SIDES = 8;

  public Octagon(double sideLength) {
    this.sideLength = sideLength;
  }

  public int getSideCount() {
    return SIDES;
  }

  public double getArea() {
    return 2 * (1 + sqrt(2)) * (sideLength * sideLength);
  }
  public double getPerimeter() {
    return sideLength * 8;
  }

}
// OCTAGON CLASS

// HEXAGON CLASS
class Hexagon implements Shape {
  private double sideLength;
  private final int SIDES = 6;

  public Hexagon(double sideLength) {
    this.sideLength = sideLength;
  }

  public int getSideCount() {
    return SIDES;
  }

  public double getArea() {
    return (3 * sqrt(3)) / 2 * (sideLength * sideLength);
  }

  public double getPerimeter() {
    return sideLength * 6;
  }
}
// HEXAGON CLASS

// Increment interface
interface Incrementable {
   void increment();
   int getValue();
}

class SequentialIncrementer implements Incrementable {
  private int value = 0;

  public void increment() {
    this.value++;
  }

  public int getValue() {
    return value;
  }

}

class RandomIncrementer implements Incrementable {
  int value = 0;
  public void increment() {

    Random r = new Random();
    value += r.nextInt();
  }

  public int getValue() {
    return value;
  }
}
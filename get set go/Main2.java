// A sample class shape which provides a method to get the shape's area
class Shape {
  public double getArea() {
    return 0;
  }
}
// A triangle with base and height
class Triangle extends Shape{ // extended form the shape class
private double base;
private double height;
public Triangle(double base, double height) {
  this.base = base;
  this.height = height;
}
public double getArea() {//area of triangle 1/2*b*h
// area using heron's formula can also be used here
  return 0.5 * base * height;
  }
}
// A SQUARE is a Shape with a specific side
class Square extends Shape {
  private double side;
  public Square(double side) {
    this.side = side;
  }
  public double getArea() {
    return side * side;
 }
}
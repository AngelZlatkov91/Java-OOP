package Polymorphism.Shapes;

public class Circle extends Shape{
    private Double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculatePerimeter() {
         double perimeter = 2 * Math.PI * this.radius;
         super.setPerimeter(perimeter);

    }

    @Override
    public void calculateArea() {
      double area = Math.PI * Math.pow(this.radius,2);
      super.setArea(area);

    }
}

package Polymorphism.Shapes;

public class Rectangle extends Shape{
    private Double height;
    private Double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 2 * (this.height + this.width);
       super.setPerimeter(perimeter);
        
    }

    @Override
    public void calculateArea() {
        double area = this.height * this.width;
        super.setArea(area);
    }
}

package Polymorphism.Shapes;

public abstract class Shape {
    private Double perimeter;
    private Double area;



    public abstract  void calculatePerimeter ();
    public abstract  void calculateArea();

    protected void setPerimeter(Double perimeter) {
        this.perimeter = perimeter;
    }

    protected void setArea(Double area) {
        this.area = area;
    }
}

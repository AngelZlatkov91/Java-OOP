package WorkingWithAbstraction.PointInRectangel;

public class Rectangle {
    private Point bottomLeft;
    private Point topRight;

    public Rectangle(Point bottomLeft, Point bottomRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = bottomRight;
    }

    public Point getBottomLeft() {
        return bottomLeft;
    }

    public void setBottomLeft(Point bottomLeft) {
        this.bottomLeft = bottomLeft;
    }

    public Point getTopRight() {
        return topRight;
    }

    public void setTopRight(Point topRight) {
        this.topRight = topRight;
    }
    public boolean contains (Point point) {
        boolean isXBasedInside = getBottomLeft().getX() <= point.getX() &&
                getTopRight().getX() >= point.getX();
        boolean isYBasedInside = getBottomLeft().getY() <= point.getY() &&
                getTopRight().getY() >= point.getY();
        return isXBasedInside && isYBasedInside;
    }
}

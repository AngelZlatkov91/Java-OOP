package WorkingWithAbstraction.PointInRectangel;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rectanglePoints = getInts(scanner);

        Point bottomLeft = new Point(rectanglePoints[0],rectanglePoints[1] );
        Point topRight = new Point(rectanglePoints[2],rectanglePoints[3]);
        Rectangle rectangle = new Rectangle(bottomLeft,topRight);
        int inputCount = Integer.parseInt(scanner.nextLine());
        while (inputCount-- >0){
            int[] pointCoordinates = getInts(scanner);
            contains(rectangle, pointCoordinates);
        }
    }

    private static void contains(Rectangle rectangle, int[] pointCoordinates) {
        Point point = new Point(pointCoordinates[0], pointCoordinates[1]);
        boolean contains = rectangle.contains(point);
        System.out.println(contains);
    }

    private static int[] getInts(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //se creeaza un ArrayList pe obiecte de tip Point
        ArrayList<Point> points = new ArrayList<>();

        //se adauga fiecare punct in Array
        points.add(new Point(1,1));
        points.add(new Point(1,3));
        points.add(new Point(2,1));
        //points.add(new Point(2,3));
        points.add(new Point(3,1));
        points.add(new Point(3,3));

        //se afiseaza punctele (inputul)
        System.out.println("Input: ");
        for (Point point : points){
            System.out.println(point.toString());
        }

        System.out.println("Output: ");
        System.out.println(Rectangles.getNumberOfRectangles_1(points));
    }
}
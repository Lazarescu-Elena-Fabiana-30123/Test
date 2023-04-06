import java.util.ArrayList;

public class Rectangles {
    //metoda primeste un array de obiecte de tip Point
    public static int getNumberOfRectangles(ArrayList<Point> pointList){
        int count = 0; // se initializeaza numarul de dreptunghiuri cu 0

        //daca lungimea array-ului este mai mica decat 4, atunci returneaza 0
        //deoarece nu este posibila crearea unui dreptunghi cu mai putin de 4 puncte
        if(pointList.size() <= 4) {
            System.out.println("Insert more points!");
            return 0;
        }

        //se parcurge array-ul de puncte si se ia primul punct (x1,y1)
        for(Point point : pointList){
        //se parcurge din nou array-ul si se ia cel de-al doilea punct (x2,y2)
            for (Point point1 : pointList){
        //daca nu se afla pe acceasi linie, atunci se calculeaza eventualele puncte corespunzatoare
        //diagonalelor formate de cele doua puncte
        //punctele rezultate sunt (x1,y2) si (x2,y1)
                if(point.getX() != point1.getX() && point.getY() != point1.getY()){

                    int x1 = point.getX(), x2 = point1.getX();
                    int y1 =  point.getY(), y2 = point1.getY();

                    //se verifica daca punctele obtinute se afla in array-ul de puncte dat initial
                    //daca se gasesc, atunci inseamna ca s-a gasit un dreptunghi, deci se adauga 1 variabile count
                    if(pointList.contains(new Point(x1, y2)) && pointList.contains(new Point(x2,y1))){
                        count++;
                }
            }
        }
        }
            return count;
        }

    public static int getNumberOfRectangles_1(ArrayList<Point> pointList){
        int count = 0; // se initializeaza numarul de dreptunghiuri cu 0

        //daca lungimea array-ului este mai mica decat 4, atunci returneaza 0
        //deoarece nu este posibila crearea unui dreptunghi cu mai putin de 4 puncte
        if(pointList.size() <= 4) {
            System.out.println("Insert more points!");
            return 0;
        }

        //se parcurge array-ul de puncte si se ia primul punct (x1,y1)
        for(Point point : pointList){
            //se parcurge din nou array-ul si se ia cel de-al doilea punct (x2,y2)
            for (Point point1 : pointList){
                //se verifica daca se afla pe acceasi linie
                if(point.getX() == point1.getX() && point.getY() == point1.getY()){
                    count++;
                }
            }
        }
        return count/2; // se imparte rezultatul la 2 pentru ca se verifica acelasi set de puncte de doua ori
    }
    }
/*
        for(int i = 0; i < pointList.size(); i++){
            Point p1 = new Point(pointList.get(i).getX(), pointList.get(i).getY());
            for (int j = 0; j < pointList.size(); j++){
                Point p2 = new Point(pointList.get(j).getX(), pointList.get(j).getY());
                for (int k = 0; k < pointList.size();k++){
                    Point p3 = new Point(pointList.get(k).getX(), pointList.get(k).getY());
                    for (int z = 0; z < pointList.size(); z++){
                        Point p4 = new Point(pointList.get(z).getX(), pointList.get(z).getY());
                        if(){

                            count++;
                        }
                    }
                }
            }
        }}}*/


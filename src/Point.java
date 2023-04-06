//clasa Point, ce are doua atribute private (x si y, respectiv abscisa si ordonata)
//la crearea unui punct, se apeleaza constructorul: Point point = new Point(x,y);
public class Point{
    private int x, y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }

    public  int getY(){
        return this.y;
    }

//metoda toString face posibila afisarea punctelor create sub forma (x,y)
    @Override
    public String toString(){
        return "(" + this.x + "," + this.y + ")";
    }
}
package javaUnitTest;


public class Rect {
    int x =0 ;
    int y= 0;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public Rect(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }
    public Rect() {
        super();
    }
    @Override
    public String toString() {
        return "Rect [x=" + x + ", y=" + y + "]";
    }
    
    public int Area() {
        return x*y;
    }
    public int peri(){
        return 2*(x+y);
    }
    
}

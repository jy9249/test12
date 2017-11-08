package st1shape완성;

public abstract class Shape {
    
    protected String color = "";
    protected int    x     = 0;
    protected int    y     = 0;
    
    // getter & setter
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
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
    
    // toString
    @Override
    public String toString() {
        return "Shape [color=" + color + ", x=" + x + ", y=" + y + "]";
    }
    
    // 생성자
    public Shape() {
        super();
    }
    
    // 추상메서드 자식에게 전가.
    public abstract Shape getShape();
    
    public void draw() {
        System.out.println("Shape Draw()");
    };
}

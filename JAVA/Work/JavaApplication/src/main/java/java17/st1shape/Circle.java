package java17.st1shape;

public class Circle extends Shape { //Shape 가 부모 클래스
    public int radius; 
    
        //메서드
    public void draw(){
        System.out.println("원 그림");
    }
    // 추상메서드 
    public Shape getShape(){
        return null; }  
    
    //getter & setter 
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    //toString
    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", toString()=" + super.toString()
                + "]";
    }
    //constructor 
    public Circle(String color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
        System.out.println("Circle(String color, int x, int y, int radius)");
    }
    
    public Circle(int radius) {
        super();
        this.radius = radius;
        System.out.println("Circle(int radius)");
    }
    //매개변수없는 constructor
    public Circle() {
        super();
        System.out.println("Circle()");
        // TODO Auto-generated constructor stub
    }

    public Circle(String color, int x, int y) {
        super(color, x, y);
        System.out.println("Circle(String color, int x, int y)");
        // TODO Auto-generated constructor stub
    }
    
    
}

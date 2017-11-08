package java14.st11pattern;


public class Circle extends Shape {
    private int radius=0;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }

    public Circle() {
        super();
        // TODO Auto-generated constructor stub
    }

  
    
}

package java14.st11pattern;


public class Rectangle extends Shape{
    private int width=0;
    private int height=0;
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
 
    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + "]";
    }
    public Rectangle() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Rectangle(int width, int height) {
        super();
        this.width = width;
        this.height = height;
    }
    
    
    
}

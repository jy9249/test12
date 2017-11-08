package java14.st4shape;

public class Rectagle extends Shape { // shape가 부모님!
    
    private int width  = 0;
    private int height = 0;
    // getter & setter
    
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
    

  
    
    // Constructor
       //x,y,color,width,height를 매개변수로 넘겨받는 생성자를 만드시오.
    public Rectagle(int x, int y, String color, int width, int height) {
        super(x, y, color);
        this.width = width;
        this.height = height;
        System.out.println("Rectagle()");
    }
      //width,height를 매개변수로 넘겨받는 생성자를 만드시오.
    public Rectagle(int width, int height) {
        super();
        this.width = width;
        this.height = height;
    }
    
    
    
        // toString
    
    @Override
    public String toString() {
        return "Rectagle [width=" + width + ", height=" + height
                 + super.toString() + "]";
        
    }

    public Rectagle(int x, int y, String color) {
        super(x, y, color);
    }
  
 


}

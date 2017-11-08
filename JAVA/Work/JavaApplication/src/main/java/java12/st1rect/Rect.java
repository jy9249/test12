package java12.st1rect;


public class Rect {
    private int width =0; //변수는 무조건 private 
    private int height =0;
    
    
    public int area (){   //메서드는 퍼블릭 무조건 쓰기 
        return width*height ;
    }
    public int perimeter(){
        return 2*(width+height);
    }
    @Override
    public String toString() {
        return "Rect [width=" + width + ", height=" + height + "]";
    }
    public Rect() {
       super();
        
    }
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
    
}

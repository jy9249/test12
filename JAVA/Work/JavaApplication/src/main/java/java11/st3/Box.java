package java11.st3;

public class Box {
    
    private int width  = 0;
    private int length = 0;
    private int height = 0;
    

    public int getWidth() {
        return width;
    }
    
    public void setWidth(int width) {
        this.width = width;
    }
    
    public int getLength() {
        return length;
    }
    
    public void setLength(int length) {
        this.length = length;
    }
    
    public int getHeight() {
        return height;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    //toString
    @Override
    public String toString() {
        return "Box [width=" + width + ", length=" + length + ", height="
                + height + "]";
    };
    
 
    
    public Box(int width, int length, int height) {
        super();
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public Box() {
        super();
    }

     int getVolunm() {
        return width*length*height;
    } //빵만드는기계 이고 밀가루를 넣으면 빵을 반환.
    
    public void printVolunm() {
        
        int vol = getVolunm();
        System.out.println(vol);
        
    }
    
    
}

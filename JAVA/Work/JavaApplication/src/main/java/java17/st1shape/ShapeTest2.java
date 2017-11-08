package java17.st1shape;


public class ShapeTest2 {
    
    public static void main(String[] args) {
        Shape s = null; //
        
        
        
        
        Rectangle r = new Rectangle();
        r.x =0; 
        r.y =0;
        r.width =100;
        r.height= 100;
        System.out.println("r"+r.toString());
        
        s=r; //자식의 인스턴스를 부모에게 넣었음
        System.out.println("s"+s.toString());
        
    }
    
}

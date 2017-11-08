package java14.st4shape;

public class RectangleTest {
    public static void main(String[] args) {
        // Rectagle 인스턴스 r1,r2,r3,r4 만드시오
        // r1 : x=1 ,y=1, color="black", width =0, height= 0
        // r2 : 0 0 0 0 0
        // r3 : 0 0 0 100 200
        // r4 : 1 1 black 100 200
        
        Rectagle r1 = new Rectagle(1, 1, "black", 0, 0);
        
        Rectagle r2 = new Rectagle(0, 0, "0", 0, 0);
        Rectagle r3 = new Rectagle(0, 0, "0", 100, 200);
        Rectagle r4 = new Rectagle(1, 1, "black", 100, 200);
        
        
        
        
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r3.toString());
        System.out.println(r4.toString());
    }
}

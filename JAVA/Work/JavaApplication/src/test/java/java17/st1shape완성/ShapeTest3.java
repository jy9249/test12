package java17.st1shape;

public class ShapeTest2 {
    public static void main(String arg[]) {

        // 클래스 하향 형변환
        s = new Rectangle();
        r = (Rectangle) s; 
        r.x = 10;
        r.y = 10;
        r.width = 200;
        r.height = 200;
        System.out.println( "s" + s.toString() );
        System.out.println( "r" + r.toString() );
    }
}

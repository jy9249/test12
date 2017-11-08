package java14st3car;

public class SportsCarTest {
    
    public static void main(String[] args) {
        
        SportsCar ts = new SportsCar();
        ts.speedUp(100);
        ts.speedDown(200);
        ts.setGear(4);
        ts.setColor("white");
        ts.setSpeed(200);
        ts.setTurbo(true);
        System.out.println(ts.toString());
        
        SportsCar c2 = new SportsCar(300, 5, "green", true);
        System.out.println(c2.toString());
        
        SportsCar c3 = new SportsCar(true);
        System.out.println(c3.toString());
        SportsCar c4 = new SportsCar("green", true);
        System.out.println(c4.toString());
    }
    
}

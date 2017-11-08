package javaCar;


public class CarTest {
    
    
    public static void main (String[] args)  { 
        
    
    Car mycar = new Car();
    mycar.getColor();
    mycar.getSpeed();
    mycar.getColor();
    mycar.speedUp(100);
    mycar.speedDown(200);
    
    
    System.out.println(mycar.toString());
    
}
}


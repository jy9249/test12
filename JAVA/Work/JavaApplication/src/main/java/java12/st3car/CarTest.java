package java12.st3car;

public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.speedUp(100);// myCar.spped = 100;
        myCar.speedDown(0);
        myCar.speedPrint();
        System.out.println(myCar.toString()); // 필드에 적용된 모든 값들을 한 번에 출력
        System.out.println("numberOfCar = " +myCar.getNumberOfCar());
        
        Car yourCar = new Car();
        yourCar.setColor("blue");
        yourCar.setSpeed(60);
        yourCar.setGear(3);
        System.out.println(yourCar.toString());
        
        System.out.println(yourCar.getNumberOfCar());
        
        Car otherCar = new Car("blue", 60, 3);
        System.out.println(otherCar.toString());
        System.out.println(otherCar.getNumberOfCar());
        
        System.out.println("-----------------------------------------");
        System.out.println("numberOfCar = "+myCar.getNumberOfCar());
        System.out.println("numberOfCar = "+yourCar.getNumberOfCar());
        System.out.println("numberOfCar = "+otherCar.getNumberOfCar());
        System.out.println("-----------------------------------------");
        System.out.println(Car.getNumberOfCar()); //static 붙은 메서드는 클레스명.으로 접근하고 아닌것은 인스턴스명.으로 접근한다. 
        
    }
}

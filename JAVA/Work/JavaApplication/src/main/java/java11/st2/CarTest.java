package java11.st2;

public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.speedUp(300);// myCar.spped = 100;
        myCar.speedDown(0);
        myCar.speedPrint();
        System.out.println(myCar.toString()); // 필드에 적용된 모든 값들을 한 번에 출력
        
        Car yourCar = new Car();
        yourCar.setColor("blue");
        yourCar.setSpeed(60);
        yourCar.setGear(3);
        System.out.println(yourCar.toString());

        Car Our = new Car();
        Our.getColor();
        Our.getGear();
        Our.getSpeed();
        System.out.println(Our.toString());

        
    }
}

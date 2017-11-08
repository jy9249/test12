package java11.st2;

public class Car {
    
    // 필드
    private String color = "빨강";
    private int    speed = 100;
    private int    gear  = 4;
    // 동작 : 메서드
    
    public int speedUp(int s) {
        int w= speed +s;
        return w; // s를 넣는다 나의 스피드에
        
    }
    
    public void speedDown(int s) {
        speed = speed - s;
    }
    
    public void speedPrint() {
        System.out.println("속도" + speed + "km");
    }
    
    // getter & setter 메서드 생성 
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public int getSpeed() {
        return speed;
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public int getGear() {
        return gear;
    }
    
    public void setGear(int gear) {
        this.gear = gear;
    }

    public Car() {
        super(); //아무 매개변수가 없는 생성자 (super = 부모 Car위의 부모라는 의미 )
    }

    public Car(String color, int speed, int gear) {
        super();
        this.color = color;
        this.speed = speed;
        this.gear = gear;
    }

    @Override //수평자 toString
    public String toString() {
        return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear
                + "]";
    }
    
    // getter & setter
    
    // constructor (생성자)
    
    // toString // 클래스안의 필드를 모두 한번에 출력하기 위함.


}

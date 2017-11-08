package javaCar;

public class Car {
    private int    speed = 10;
    private int    gear  = 4;
    private String color = "빨강";
    //speedUp & speedDown
    public void speedUp(int s) {
        speed = speed + s;
    }
    
    public void speedDown(int s) {
        speed = speed - s;
    }
    
    // getter & setter
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
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    // toString
    
    @Override
    public String toString() {
        return "Car [speed=" + speed + ", gear=" + gear + ", color=" + color
                + "]";
    }
    
    // 매개변수없는 생성자
    public Car() {
        super();
    }
    // 생성자
    
    public Car(int speed, int gear, String color) {
        super();
        this.speed = speed;
        this.gear = gear;
        this.color = color;
    }
    
}

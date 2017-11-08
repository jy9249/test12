package java14st3car;

public class SportsCar extends Car {
    
    private boolean turbo; // 있다없다.
    
    // getter & setter
    public boolean isTurbo() {
        return turbo;
    }
    
    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }
    
    // toString 할 때 부모의 toString도 선택해줘야 사용가능.
    @Override
    public String toString() {
        return "SportsCar [turbo=" + turbo + ", toString()=" + super.toString()
                + "]";
    }
    
    public SportsCar() {
        super(); // == Car();
        
    }
    
    public SportsCar(int speed, int gear, String color) {
        super(speed, gear, color); // Car(int speed, int gear, String color)
        
    }
    
    public SportsCar(boolean turbo) {
        super(); // Car()
        this.turbo = turbo; // 나의 터보에 터보를 넣는다.
    }
    
    public SportsCar(int speed, int gear, String color, boolean turbo) {
        super(speed, gear, color); // Car((int speed, int gear, String color) 생성자
        this.turbo = turbo; // 나의 터보에 터보른 넣는다.
    }
    
    public SportsCar(String color, boolean turbo) {
        super(color);
        this.turbo = turbo;
    }
    
}

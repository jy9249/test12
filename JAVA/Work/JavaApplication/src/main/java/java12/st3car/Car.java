package java12.st3car;

public class Car {
    // 필드 2가지 추가
    // getter 하나 추가 
    
    // 필드
    private String     color       = "빨강";
    private int        speed       = 100;
    private int        gear        = 4;
    private int        carid       = 0; // class 안에서만 사용되는 것이기때문에 Getter/setter 만들필요없음
    
    // static 필드 선언
    
    static int numberOfCar = 0;   // 여기 해보는 실습
    
    // 2. getter & setter 메서드 생성
    
    public static int getNumberOfCar() {
        return numberOfCar;
    } //getter만 만듬.
    
    public void speedUp(int s) {
        speed = speed + s;// s를 넣는다 나의 스피드에
        
    }
    
    public void speedDown(int s) {
        speed = speed - s;
    }
    
    public void speedPrint() {
        System.out.println("속도" + speed + "km");
    }
    
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
    
    // 3. 아무 매개변수가 없는 생성자 (super = 부모 Car위의 부모라는 의미 )
    public Car() {
        super();
        carid = ++ numberOfCar;  //car가 생성되면 carid는 +2가 됨. 
    }
    
    

    public Car(String color, int speed, int gear) {
        super();
        this.color = color;
        this.speed = speed;
        this.gear = gear;
        
        

        carid = ++ numberOfCar; //코드 추가 . 
    }
    // 3. toString 재생성
    @Override
    public String toString() {
        return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear
                + ", carid=" + carid + "]";
    }// carid 는 new를 한 순서. 
    
 
    
    // getter & setter
    
    // constructor (생성자)
    
    // toString // 클래스안의 필드를 모두 한번에 출력하기 위함.
    
}

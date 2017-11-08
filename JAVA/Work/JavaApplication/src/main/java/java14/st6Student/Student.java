package java14.st6Student;


public class Student  {
    
    
    
    private int number =0 ;
    public String name;
    protected int phone;
    //getter & setter 
    public int getNumber() {
        return number;
    }
   
    public void setNumber(int number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }   
   //toString
    @Override
    public String toString() {
        return "Student [number=" + number + ", name=" + name + ", phone="
                + phone + ", toString()=" + super.toString() + "]";
    }
   //constructor
    public Student(int number, String name, int phone) {
        super();
        this.number = number;
        this.name = name;
        this.phone = phone;
    }

    public Student() {
        super();
    }
}

 
    
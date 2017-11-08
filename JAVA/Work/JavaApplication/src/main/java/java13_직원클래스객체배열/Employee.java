package java13_직원클래스객체배열;

public class Employee {
    private String name;
    private String address;
    private int    salary;
    private String rrn;
    
    // getter & setter 생성
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public int getSalary() {
        return salary;
    }
    
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public String getRrn() {
        return rrn;
    }
    
    public void setRrn(String rrn) {
        this.rrn = rrn;
    }
    
    
 
    
    
    // 생성자생성
    
    public Employee(String name, String address, int salary, String rrn) {
        super();
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.rrn = rrn;
    }
    // toString 생성
    @Override
    public String toString() {
        return "Employee [name=" + name + ", address=" + address + ", salary="
                + salary + ", rrn=" + rrn + "]";
    }

    // 매개변수 없는 생성자 생성
    public Employee() {
        super();
    }
    
}

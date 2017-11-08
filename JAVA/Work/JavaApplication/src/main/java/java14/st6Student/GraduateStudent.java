package java14.st6Student;

public class GraduateStudent extends Student { //Student가 부모
    
    public String lab;
    
    // getter & setter
    public String getLab() {
        return lab;
    }
    
    public void setLab(String lab) {
        this.lab = lab;
    }
    
    // toString
    @Override
    public String toString() {
        return "GraduateStudent [lab=" + lab + ", toString()="
                + super.toString() + "]";
    }
    
    // constructor
    public GraduateStudent() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public GraduateStudent(int number, String name, int phone) {
        super(number, name, phone);
        // TODO Auto-generated constructor stub
    }
    
}

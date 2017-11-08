package java14.st6Student;


public class GraudateStudentTest {
    public static void main(String[] args){
        
        
        //setter 를 이용해서 입력
        GraduateStudent s1 = new GraduateStudent();
        s1.setLab("3df");
        s1.setName("dfdf");
        s1.setNumber(234234);
        s1.setPhone(12321);
        //직접 값을 입력
        GraduateStudent s2 = new GraduateStudent();
        s2.lab="2dff";
        s2.name="3dref";
        s2.phone=3434;
        
        
        //생성자 이용
        GraduateStudent s3 =new GraduateStudent(23,"343",3434);
        
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
    }
}

package java14.st5animal;

public class Dog extends Animal {
    public void bark() {
        System.out.println("bark");
    }
    
    @Override // 붙여주는게 좋다 안붙여도 문제없다
    // 부모에게도 eat이 있고 자기한테도 eat가 있을 때 자기것을 추출하는것을
    // 오버라이딩 이라고 한다.
    
    public void eat() {
        // 부모에게도 eat이 있고 자기한테도 eat가 있을 때 자기것을 추출하는것을
        // 오버라이딩 이라고 한다.
        System.out.println("코로먹는다.");
        
        /*
         * 다른타입임 public void eat (String food){ System.out.println("코로 먹는다"); }
         */
        /*
         * // 메서드 게타써이므로 안된다. public int eat() { return 0 ;
         * 
         * }
         */
    }
}

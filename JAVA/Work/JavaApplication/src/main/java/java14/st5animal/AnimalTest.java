package java14.st5animal;

public class AnimalTest {
    public static void main(String[] args) {
        
        Animal a = new Animal();
        a.sleep();
        a.eat();
        
        Dog d = new Dog();
        d.sleep();
        d.eat();
        d.bark();
        
        Cat e = new Cat();
        e.sleep();
        e.eat();
        e.sleep();
        
    }
}

package java15.st2interface;

public class Television implements RemoteControl, SerialCommunication {

    @Override
    public void turnOn() {
        System.out.println("Television.turnOn()");        
    }

    @Override
    public void turnOff() {
        System.out.println("Television.trunOff()");        
    }

    @Override
    public void moveLeft() {
        System.out.println("Television.moveLeft()");        
    }

    @Override
    public void moveRight() {
        System.out.println("Television.moveRight()");        
    }

    @Override
    public void send() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void receive() {
        // TODO Auto-generated method stub
        
    }

  
}

package java22.junit;

import java.awt.geom.Area;
import java.util.ArrayList;

import com.mysql.fabric.xmlrpc.base.Array;

public class MyUnit {
    
    public String concate(String string, String string2) {
        return string + string2;
    }
    
    public boolean getBoolean() {
     
        return false;
    }
    
    public Object getsameobject() {
        return null;
    }
    
    public Object getobject() {
        return null;
        
    }
    
    public String[] getstringArray() {
        return new String[] { "one", "two", "three" };
        
    }
    public double getExcetptiojn() throws ArithmeticException {
        throw new ArithmeticException("not Implened Exception");
        
    }
    
    public ArrayList<String> getEmptyList() {
        return new ArrayList<String>();
        
    }
}

package java22.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TsetArrayList {
    
    private static List<String> emplist = null;
    
    @BeforeClass
    public static void setUpClass() {
        emplist = new ArrayList<String>();
        emplist.add("0");
        emplist.add("2");
        emplist.add("1");
        emplist.add("3");
        emplist.add("4");
    }
    
    @Test
    public void Test01() {
        assertNotNull(emplist);
    }
    
    //empist 의 갯수가 5인지를 검증하는 테스트 
    @Test
    public void Test02(){
        assertEquals(5, emplist.size());
    }
    
    
    @Test
    public void Test03(){
        int result = emplist.indexOf("0"); // 0 or -1 를 반환
        assertEquals(0, result);

       boolean b =  emplist.contains("10"); //true false를 반환
        assertEquals(false, b);
        assertFalse(b);
    }
    
    @Test
    public void Test04(){   
        String name1[] = {"y2kpooh","hwnag"};
        String name2[] = {"y2kpooh","hwnag"};
        
     
        assertArrayEquals(name1, name2);
    }
    
    
    
}

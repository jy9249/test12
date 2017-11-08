package java22.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMyUnit {
    private static MyUnit myUnit = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        myUnit = new MyUnit();
        
    }
    
    @Test
    public void testconcate(){
        String result = myUnit.concate("ab", "11");
        assertEquals("ab11", result);
    }
    
    @Test
    public void testBoolean() {
        boolean result = myUnit.getBoolean();
        assertFalse("ab12", result);
        assertEquals(result, false);
        assertSame(result, false);
    }
    
    @Test
    public void testGetBoolean() {
        String result = null;
        try {
            result = myUnit.concate("t", "123");
        } catch (Exception e) {
            // TODO: handle exception
        }
        assertTrue(result, true);
    }
    
    @Test
    public void test_getSameobject(){
       Object result =  myUnit.getsameobject();
       assertNull(result);
       assertEquals(null, result);
       assertSame(null,result);
    }
    
    @Test
    public void testGetObject(){
        Object result = myUnit.getobject();
        assertNull(result);
        assertEquals(null, result);
        assertSame(null,result);
    }
    @Test
    public void TestGetStirngArray(){
        String[] result = myUnit.getstringArray();
        String[] expecteds={"one","two","three"};
       assertArrayEquals(expecteds, result); 
    }
   @Test(expected=ArithmeticException.class) //예외처리구문
   public void test_getException(){
       double result= myUnit.getExcetptiojn();
   }
   @Test(expected=IndexOutOfBoundsException.class) //예외처리구문
   public void test_getEmptyList(){
       ArrayList<String> list = myUnit.getEmptyList();
       list.get(0);
   }
 
   
    
    @Before
    public void setUp() throws Exception {
    }
    
    @Test
    public void test() {
        fail("Not yet implemented");
    }
    
}

package java22.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import javaUnitTest.Rect;

public class TestRect {
    private static Rect re=null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        
         re = new Rect(10, 30);
    }
    
    @Before
    public void setUp() throws Exception {
    }
    
    @Test
    public void test() {
        
        {
            int r = re.Area();
            assertEquals(300, r);
            assertTrue( 300==r );
        }
    }
    
    @Test
    public void test_peri() {
         re = new Rect();
        re.setX(20);
        re.setY(30);
        int r1 = re.peri();
        assertEquals(100, r1);
        assertFalse(80==r1);

    }
    
}

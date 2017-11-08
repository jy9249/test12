package java22.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestOper {
    
    @Test
    public void testAdd() {
        
        // Oper 클래스의 인스턴스 생성.
        Oper op = new Oper(2, 4);
        int rs = op.Add();
        assertEquals(6, rs);
    }
    // rs가 6과같은지 확인해라.
    
    public void testMinus() {
        Oper ops = new Oper(4, 2);
        int cs = ops.Minus();
        assertEquals(2, cs);
        // 녹색줄이보이면 Ok.
        
    }
    @Test
    public void testMul() {
        Oper ops = new Oper(2, 4);
        int cs = ops.Mul();
        assertEquals(8, cs);
        // 녹색줄이보이면 Ok.
        
    }
    
    @Test
    public void testDiv() {
        Oper ops = new Oper(2, 4);
        double cs = ops.Div();
        assertEquals(-3, cs);
        // 녹색줄이보이면 Ok.
        
    }
}

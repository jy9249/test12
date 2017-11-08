package java23.jdbc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestDBConnect {
    

    
    @Test
    public void test_connectionMySQL() {
        java.sql.Connection conn =DBconnect.connectionMySQL();
        
        if(conn!=null){
            assertTrue("db connect success",true);
        }
        else{
            assertTrue("db conncct fail",false);
        }
    }
    
    @Test
    public void test_makeConnection() throws Exception{
        java.sql.Connection conn = DBconnect.makeConnetion();
        if(conn!=null){
            assertTrue("db connect success",true);
            
        }
        else {
            assertTrue("db connect fail",false);
        }
    }
}

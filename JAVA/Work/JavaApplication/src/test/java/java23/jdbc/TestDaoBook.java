package java23.jdbc;

import static org.junit.Assert.*;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestDaoBook {
    static java.sql.Connection conn = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        conn = DBconnect.makeConnetion();
        
    }
    
    @Test
    public void testGetCount() throws SQLException {
        DaoBook dao = new DaoBook(conn);
        ModelBook model = new ModelBook();
        int result = dao.getCount(model);
        assertEquals(4, result);
    }
    
    @Test
    public void testGetMaxBookid() throws SQLException {
        DaoBook dao = new DaoBook(conn);
        ModelBook model = new ModelBook();
        int result = dao.getMaxBookid();
        assertEquals(4, result);
        
    }
    
    @Test
    public void testSelectAll() throws SQLException {
        DaoBook dao = new DaoBook(conn);
        ResultSet result = dao.selectAll();
        // 한칸아래
        result.next();
        Integer res = result.getInt("bookid");
        assertSame(1, res);
        // 2두칸아래
        result.next();
        String res2 = result.getString("bookname");
        assertNotNull(res2);
        
    }
    
    @Test
    public void testSelectLike() throws SQLException {
        DaoBook dao = new DaoBook(conn);
        ModelBook book = new ModelBook();
        book.setBookname("ja"); // ja가 들어가있으면 다 찾아라.
        java.sql.ResultSet rs = dao.selectLike(book);
        assertNotNull(rs);
        assertTrue(rs.getRow() >= 1);
        rs.getRow(); // resultset 들어 있는 row 총 수
        
        // 값을 이용한 검증
        rs.next(); // 커서가 첫번째로 row로 이동.
        String name = rs.getString("bookname"); // java를 가져옴
        
    }
    
    @Test
    public void testSelectEqual() throws SQLException {
        DaoBook dao = new DaoBook(conn);
        ModelBook book = new ModelBook();
        book.setBookname("mysql"); // ja가 들어가있으면 다 찾아라.
        
        java.sql.ResultSet rs = dao.selectEqual(book);
        
        // 인스턴스 검증
        assertNotNull(rs);
        
        // 값을 이용한 검증
        rs.next(); // 커서가 첫번째로 row로 이동.
        String name = rs.getString("bookname"); // 우리가 가져올라고 하는 값
        // name= mysql 이냐?
        assertEquals("mysql", name);
        
    }
    
    @Test
    public void testSelectDynamic() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testInsertBook() throws SQLException {
        // 이해하기 어려운날짜
        java.util.Date date1 = new java.util.Date(177, 10, 8);
        java.sql.Date date2 = java.sql.Date.valueOf("2017-11-08");
        ModelBook book = new ModelBook();
        book.setBookname("test");
        book.setPublisher("abc");
        book.setYear("2017");
        book.setPrice(20000);
        book.setDtm(date2); // 자바날짜 3가지 (1)
        book.setUse_yn(true);
        book.setAuthid(3);
        
        DaoBook dao = new DaoBook(conn);
        int result = dao.insertBook(book);// 위의 정보들을 book에다가 담음.
        
        // insert 검증
        // 1 리턴되는 경우 : insert 성공
        // 0,-1 리턴되는 경우 : insert 실패
        assertEquals(1, result);
        
    }
    
    @Test
    public void testUpdateBHook() {
        ModelBook wherebook = new ModelBook();
        wherebook.setBookname("test"); //bookname test인애를 찾아서
        
        ModelBook setbook = new ModelBook();
        setbook.setPrice(15000);
        setbook.setYear("2016");
        
        
        
        
    }
    
    @Test
    public void testDeleteBook() {
        fail("Not yet implemented");
    }
    
}

package java24.mybatis;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.List;

import javax.sql.DataSource;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java24.mybatis.model.ModelBook;
import java24.mybatis.service.ServiceBook;

public class ServiceBookTest {
    private static ServiceBook service = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        
        // classpath 를 이용한 설정 파일 로딩
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:ApplicationContext.xml");
        // DI를 이용한 servicebook 인스턴스 생성
        service = context.getBean("servicebook", ServiceBook.class); // new ServiceBook();
    
        javax.sql.DataSource dataSource = (DataSource) context.getBean("dataSource");
        org.apache.ibatis.jdbc.ScriptRunner runner = new
        org.apache.ibatis.jdbc.ScriptRunner( dataSource.getConnection() );
        runner.setAutoCommit(true);
        runner.setStopOnError(true);
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        String sf = cl.getResource("ddl/books.ddl.mysql.sql").getFile();
        java.io.Reader br = new java.io.BufferedReader( new java.io.FileReader(sf) );
        runner.runScript( br);
        runner.closeConnection();
    
    
    }
    
    @Test
    public void testGetCount() throws Exception {
        ModelBook book = new ModelBook();
        int rs = service.getCount(book);
        assertEquals(4, rs);
    }
    
    @Test
    public void testGetMaxBookid() throws Exception {
        int rs = service.getMaxBookid();
        assertEquals(4, rs);
        
    }
    
    @Test
    public void testSelectAll() throws Exception {
        ModelBook book = new ModelBook();
        List<ModelBook> result = service.selectAll(book);
        assertSame(result.size(), 14);
    }
    
    @Test
    public void testSelectLike() throws Exception {
        ModelBook book = new ModelBook();
        book.setBookname("First SQL");
        List<ModelBook> result = service.selectLike(book);
        assertSame(result.size(), 1);
    }
    
    @Test
    public void testSelectEqual() throws Exception {
        ModelBook book = new ModelBook();
        book.setBookname("First SQL");
        List<ModelBook> result = service.selectEqual(book);
        assertSame(result.size(), 1);
    }
    
    @Test
    public void testInsertBook() throws Exception {
        ModelBook book = new ModelBook();
        book.setBookname("test");
        book.setDtm(Date.valueOf("2016-11-12"));
        book.setPrice(10000);
        book.setPublisher("내가");
        book.setUse_yn(true);
        book.setYear("2016");
        book.setAuthid(10);
        
        int result = service.insertBook(book);
        assertSame(result, 6);
    }
    
    @Test
    public void testInsertMap() {
        ModelBook book = new ModelBook();
        String bookname = "test";
      //  Date dtm = 2016 - 11 - 12;
        int authid = 10;
     //   int result = service.insertMap(bookname, dtm, authid);
       // assertSame(result, 1);
        
    }
    
    @Test
    public void testUpdateBook() {
        ModelBook wherebook = new ModelBook();
        wherebook.setBookname("test"); // bookname test인애를 찾아서
        
        ModelBook setbook = new ModelBook();
        setbook.setPrice(15000);
        setbook.setYear("2016");
    }
    
    @Test
    public void testDeleteBook() throws Exception {
        ModelBook wherebook = new ModelBook();
        wherebook.deleteBook(wherebook); // bookname test인애를 찾아서
        
        ModelBook setbook = new ModelBook();
        setbook.setPrice(15000);
        setbook.setYear("2016");
    }
    
    @Test
    public void testSelectDynamic() {
        fail("Not yet implemented");
    }
}

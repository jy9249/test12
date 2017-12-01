package user;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import user.inf.IServeceUser;
import user.mod.ModelUser;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestServiceUser {
    private static IServeceUser service = null;
    // SLF4J Logging
    private Logger              logger  = LoggerFactory
            .getLogger(this.getClass());
    // private static IServic
    
    Date                        from    = new Date();
    String                      userid  = "진영"
            + new SimpleDateFormat("yyMMddhhmm").format(from);
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:user/springboard/ApplicationContext.xml");
        service = context.getBean("serviceuser", IServeceUser.class);
    }
    
    // DB Table 초기화 코드
    /*
     * javax.sql.DataSource dataSource = context.getBean("dataSource", javax.sql.DataSource.class);
     * org.apache.ibatis.jdbc.ScriptRunner runner = new org.apache.ibatis.jdbc.ScriptRunner(dataSource.getConnection());
     * runner.setAutoCommit(true); runner.setStopOnError(true); String sqlScriptFilePath =
     * ClassLoader.getSystemClassLoader().getResource("java21/ddl/board.ddl.mysql.sql").getFile(); java.io.Reader br =
     * new java.io.BufferedReader(new java.io.FileReader(sqlScriptFilePath )); runner.runScript( br);
     * runner.closeConnection();
     */
    @After
    
    @Test
    public void testServiceUser() {
    }
    
    @Test
    public void testInsertUser() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testLogin() {
        ModelUser user = new ModelUser();
        user.setUserid( "userid" );
        user.setPasswd("password");

        ModelUser result = service.login(user);
        
        assertNotNull(result);
        assertEquals(result.getUserid(), user.getUserid() );
    }
    
    @Test
    public void testLogout() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testUpdateUserInfo() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testUpdatePasswd() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testDeleteUser() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testSelectUserOne() {
        ModelUser user = new ModelUser();
        user.setUserno(1);
        ModelUser result = service.selectUserOne(user);
    }
    
    
    
    @Test
    public void testSelectUserList() {
        
    }
}

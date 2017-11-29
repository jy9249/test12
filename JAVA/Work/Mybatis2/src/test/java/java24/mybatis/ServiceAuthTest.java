package java24.mybatis;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java24.mybatis.model.ModelAuth;
import java24.mybatis.model.ModelBook;
import java24.mybatis.service.ServiceAuth;
import java24.mybatis.service.ServiceBook;

public class ServiceAuthTest {
    private static ServiceAuth service = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        // classpath 를 이용한 설정 파일 로딩
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath: ApplicationContext.xml");
        // DI를 이용한 servicebook 인스턴스 생성
        service = context.getBean("serviceauth", ServiceAuth.class); // new ServiceBook();
        
    }
    
    @Test
    public void testGetCount() throws Exception {
        ModelAuth auth = new ModelAuth();
        int rs = service.getCount(auth);
        assertEquals(4, rs);
    }
    
    @Test
    public void testGetMaxAuthid() throws Exception {
        int rs = service.getMaxAuthid();
        assertEquals(4, rs);
    }
    
    @Test
    public void testSelectAll() throws Exception {
        ModelAuth auth = new ModelAuth();
        List<ModelAuth> result = service.selectAll();
        assertSame(result.size(), 14);
    }
    
    @Test
    public void testSelectLike() throws Exception {
        ModelAuth auth = new ModelAuth();
        auth.setName("bob");
        List<ModelAuth> result = service.selectLike(auth);
        assertSame(result.size(), 1);
    }
    
    @Test
    public void testSelectEqual() throws Exception {
        ModelAuth auth = new ModelAuth();
        auth.setName("bob");
        List<ModelAuth> result = service.selectEqual(auth);
        assertSame(result.size(), 1);
    }
    
    @Test
    public void testInsertAuth() throws Exception {
        ModelAuth auth = new ModelAuth();
        auth.setName("test");
        
        int result = service.insertAuth(auth);
        assertEquals(result, 6);
    }
    
    @Test
    public void testUpdateAuth() throws Exception {
        ModelAuth whereauth = new ModelAuth();
        whereauth.setName("bobb");
        ModelAuth setauth = new ModelAuth();
        setauth.setAuthid(15);
        setauth.setBirth("2016");
    }
    
    @Test
    public void testDeleteAuth() {
        ModelAuth whereauth = new ModelAuth();
        
        ModelAuth setauth = new ModelAuth();
        setauth.setAuthid(15);
        setauth.setBirth("2016");
        
    }
}

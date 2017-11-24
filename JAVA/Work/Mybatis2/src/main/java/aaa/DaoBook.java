package aaa;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.HashedMap;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("daobook")
public class DaoBook implements IBook {
    
    @Autowired // new대신
    @Qualifier("slqSession")
    private SqlSession session;
    
    // SLF4J Logging
    private Logger     logger = LoggerFactory.getLogger(this.getClass());
    
    @Override
    public int getCount(ModelBook book) throws Exception {
        int result = 1;
        result = session.selectOne("mapper.mapperBook.getCount", book);
        return result;
    }
    
    @Override
    public int getMaxBookid() throws Exception {
        int result = -1;
        result = session.selectOne("mapper.mapperBook.getMaxBookid");
        return result;
    }
    
    @Override
    public List<ModelBook> selectAll(ModelBook book) throws Exception {
        List<ModelBook> result = null;
        result = session.selectList("mapper.mapperBook.selectAll", book);
        return result;
    }
    
    @Override
    public List<ModelBook> selectLike(ModelBook book) throws Exception {
        List<ModelBook> result = null;
        result = session.selectList("mapper.mapperBook.selectLike", book);
        return result;
        
    }
    
    @Override
    public List<ModelBook> selectEqual(ModelBook book) throws Exception {
        List<ModelBook> result = null;
        result = session.selectList("mapper.mapperBook.selectEqual", book);
        return result;
    }
    
    @Override
    public int insertBook(ModelBook book) throws Exception {
        
        session.insert("mapper.mapperBook.insertBook", book);
        return book.getBookid();
        
    }
    
    @Override
    public int insertMap(String bookname, Date dtm, int authid)
            throws Exception {
        int result = -1;
        Map<String, Object> map = new HashMap<>();
        map.put("b", bookname);
        map.put("d", dtm);
        map.put("a", authid);
        map.put("bookid", -1);
        result = session.insert("mapper.mapperBook.insertMap", map);
        return (int) map.get("bookid");
        
    }
    
    @Override
    public int updateBook(ModelBook wherebook, ModelBook setbook)
            throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int deleteBook(ModelBook book) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public List<ModelBook> selectDynamic(ModelBook book) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }
}

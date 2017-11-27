package aaa;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
@Service("servicebook")
public class ServiceBook implements IServiceBook {
    // SLF4J Logging
    private Logger logger = LoggerFactory.getLogger(ServiceBook.class);
    @Autowired
    @Qualifier("daobook")
    private IBook dao;
    @Override
    public int getCount(ModelBook book) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int getMaxBookid() throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public List<ModelBook> selectAll(ModelBook book) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public List<ModelBook> selectLike(ModelBook book) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public List<ModelBook> selectEqual(ModelBook book) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public int insertBook(ModelBook book) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int insertMap(String bookname, Date dtm, int authid)
            throws Exception {
        // TODO Auto-generated method stub
        return 0;
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

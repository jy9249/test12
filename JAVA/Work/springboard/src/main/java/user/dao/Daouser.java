package user.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import user.inf.IUser;
import user.mod.ModelUser;

@Repository("daouser")
public class Daouser implements IUser {
    // SLF4J Logging
    private Logger     logger = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    @Qualifier("sqlSession")
    private SqlSession session;
    
    @Override
    public int insertUser(ModelUser user) {
        return session.insert("mapper.mapperUser.insertUser", user);
        
    }
    
    @Override
    public ModelUser login(ModelUser user) {
        return session.selectOne("mapper.mapperUser.login", user);
        
    }
    
    @Override
    public int logout(String userid) {
        // 안함
        return 0;
    }
    
    @Override
    public int updateUserInfo(ModelUser setValue, ModelUser whereValue) {
        
        Map<String, ModelUser> parameter = new HashMap<String, ModelUser>();
        parameter.put("setValue", setValue);
        parameter.put("whereValue", whereValue);
        
        return session.update("mapper.mapperUser.updateUserInfo", parameter);
    }
    
    @Override
    public int updatePasswd(ModelUser user) {
        return session.update("mapper.mapperUser.updatePasswd", user);
        
    }
    
    @Override
    public int deleteUser(ModelUser user) {
        return session.delete("mapper.mapperUser.deleteUser", user);
        
    }
    
    @Override
    public ModelUser selectUserOne(ModelUser user) {
        return session.selectOne("mapper.mapperUser.selectUserOne", user);
        
    }
    
    @Override
    public List<ModelUser> selectUserList(ModelUser user) {
        return session.selectList("mapper.mapperUser.selectUserList", user);
        
    }
}

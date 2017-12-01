package user.ser;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import user.mod.ModelUser;
import user.inf.IServeceUser;
import user.inf.IUser;

@Service("serviceuser")
public class ServiceUser implements IServeceUser {
    // SLF4J Logging
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    @Qualifier("daouser")
    private IUser  daouser;
    
    public ServiceUser() {
        super();
    }
    
    @Override
    public int insertUser(ModelUser user) throws Exception {
        int result;
        try {
            result = -1;
            result = daouser.insertUser(user);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            // e.printStackTrace();
            logger.error("insertUser" + e.getMessage());
            throw e;
        }
        return result;
    }
    
    @Override
    public ModelUser login(ModelUser user) {
        ModelUser result = null;
        try {
            
            result = daouser.login(user);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            // e.printStackTrace();
            logger.error("login" + e.getMessage());
            throw e;
        }
        return result;
    }
    
    @Override
    public int logout(String userid) {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int updateUserInfo(ModelUser setValue, ModelUser whereValue) {
        int result = -1;
        try {
            result = daouser.updateUserInfo(setValue, whereValue);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            // e.printStackTrace();
            logger.error("updateUserInfo" + e.getMessage());
            throw e;
        }
        
        return result;
    }
    
    @Override
    public int updatePasswd(ModelUser user) {
        int result = -1;
        try {
            result = daouser.updatePasswd(user);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            // e.printStackTrace();
            logger.error("updatePasswd" + e.getMessage());
            throw e;
        }
        return result;
    }
    
    @Override
    public int deleteUser(ModelUser user) {
        int result = -1;
        try {
            result = daouser.deleteUser(user);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            // e.printStackTrace();
            logger.error("deleteUser" + e.getMessage());
            throw e;
        }
        return 0;
    }
    
    @Override
    public ModelUser selectUserOne(ModelUser user) {
        ModelUser result = null;
        try {
            result = daouser.selectUserOne(user);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            // e.printStackTrace();
            logger.error("selectUserOne" + e.getMessage());
            throw e;
        }
        return result;
    }
    
    @Override
    public List<ModelUser> selectUserList(ModelUser user) {
        List<ModelUser> result = null;
        try {
            result = daouser.selectUserList(user);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            // e.printStackTrace();
            logger.error("selectUserList" + e.getMessage());
            throw e;
        }
        return result;
    }
}

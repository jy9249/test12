package user.inf;

import java.util.List;

import user.mod.ModelUser;
import board.model.ModelBoard;

public interface IUser {
    
    int insertUser(ModelUser user) throws Exception;
    
    ModelUser login(ModelUser user);
    
    int logout(String userid);
    
    int updateUserInfo(ModelUser setValue, ModelUser whereValue);
    
    int updatePasswd(ModelUser user);
    
    int deleteUser(ModelUser user);
    
    ModelUser selectUserOne(ModelUser user);
    
    List<ModelUser> selectUserList(ModelUser user);
    
}

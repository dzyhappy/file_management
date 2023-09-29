package file_management.peoject.service;

import com.baomidou.mybatisplus.extension.service.IService;
import file_management.peoject.common.Result;
import file_management.peoject.entity.User;

/**
* @author dzyhappy
* @description 针对表【user(用户表)】的数据库操作Service
* @createDate 2023-09-18 16:15:50
*/
public interface UserService extends IService<User> {

    Result login(User user);
}

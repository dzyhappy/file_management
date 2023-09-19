package file_management.peoject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import file_management.peoject.mapper.UserMapper;
import file_management.peoject.service.UserService;
import file_management.peoject.entity.User;
import org.springframework.stereotype.Service;

/**
* @author dzyhappy
* @description 针对表【user(用户表)】的数据库操作Service实现
* @createDate 2023-09-18 16:15:50
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {

}





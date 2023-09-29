package file_management.peoject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import file_management.peoject.entity.UserLoginLog;
import file_management.peoject.mapper.UserLoginLogMapper;
import file_management.peoject.service.UserLoginLogService;
import org.springframework.stereotype.Service;

/**
* @author dzyhappy
* @description 针对表【user_login_log】的数据库操作Service实现
* @createDate 2023-09-27 20:55:23
*/
@Service
public class UserLoginLogServiceImpl extends ServiceImpl<UserLoginLogMapper, UserLoginLog>
    implements UserLoginLogService{

}





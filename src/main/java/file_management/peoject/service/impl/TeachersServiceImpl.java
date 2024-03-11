package file_management.peoject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import file_management.peoject.entity.Teachers;
import file_management.peoject.service.TeachersService;
import file_management.peoject.mapper.TeachersMapper;
import org.springframework.stereotype.Service;

/**
* @author dzyhappy
* @description 针对表【teachers】的数据库操作Service实现
* @createDate 2024-03-06 22:51:10
*/
@Service
public class TeachersServiceImpl extends ServiceImpl<TeachersMapper, Teachers>
    implements TeachersService{

}




package file_management.peoject.mapper;

import file_management.peoject.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author dzyhappy
* @description 针对表【user(用户表)】的数据库操作Mapper
* @createDate 2023-09-18 16:15:50
* @Entity User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}





package file_management.peoject.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import file_management.peoject.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
* @author dzyhappy
* @description 针对表【User】的数据库操作Mapper
* @createDate 2024-03-06 22:51:10
* @Entity Projects
*/

@Mapper
public interface UserMapper extends BaseMapper<User> {

}





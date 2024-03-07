package file_management.peoject.mapper;

import file_management.peoject.entity.Projects;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author dzyhappy
* @description 针对表【projects】的数据库操作Mapper
* @createDate 2024-03-06 22:51:10
* @Entity Projects
*/

@Mapper
public interface ProjectsMapper extends BaseMapper<Projects> {

}





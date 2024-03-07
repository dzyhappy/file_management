package file_management.peoject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import file_management.peoject.service.ProjectsService;
import file_management.peoject.entity.Projects;
import file_management.peoject.mapper.ProjectsMapper;
import org.springframework.stereotype.Service;

/**
* @author dzyhappy
* @description 针对表【projects】的数据库操作Service实现
* @createDate 2024-03-06 22:51:10
*/
@Service
public class ProjectsServiceImpl extends ServiceImpl<ProjectsMapper, Projects>
    implements ProjectsService {

}





package file_management.peoject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import file_management.peoject.entity.Project;
import file_management.peoject.mapper.ProjectMapper;
import file_management.peoject.service.ProjectService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImp extends ServiceImpl<ProjectMapper,Project> implements ProjectService {

    @Autowired
    ProjectMapper projectMapper;



    @Override
    public List<Project> SelectByTeacherId(Integer teacherId) {

        List<Project> projects = projectMapper.GetProjectByTeacherID(teacherId);

        return projects;
    }

    @Override
    public Boolean SaveProject(Project project) {
        int insert = projectMapper.insert(project);
        System.out.println(insert);
        return true;
    }
}

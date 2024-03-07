package file_management.peoject.service;

import com.baomidou.mybatisplus.extension.service.IService;
import file_management.peoject.entity.Project;
import file_management.peoject.entity.StudenTest;

import java.util.List;

public interface ProjectService extends IService<Project> {
    List<Project> SelectByTeacherId(Integer teacherId);

    Boolean SaveProject(Project project);


}

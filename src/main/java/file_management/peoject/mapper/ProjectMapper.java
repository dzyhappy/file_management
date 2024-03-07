package file_management.peoject.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import file_management.peoject.entity.Project;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProjectMapper extends BaseMapper<Project> {
    public List<Project> GetProjectByTeacherID(Integer teacherID);
}

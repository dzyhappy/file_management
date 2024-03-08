package file_management.peoject.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import file_management.peoject.entity.ProfessMeasures;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProMeasureMapper extends BaseMapper<ProfessMeasures> {

    public List<ProfessMeasures> GetAllByteacherId(Integer teacherid);

    public Boolean SelectByFileId(Integer fileid);

    public Boolean DeleteByFileId(Integer fileid);

    public Boolean UpdateByFileId(ProfessMeasures professMeasures);

}

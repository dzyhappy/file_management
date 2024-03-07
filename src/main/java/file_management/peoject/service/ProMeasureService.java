package file_management.peoject.service;

import com.baomidou.mybatisplus.extension.service.IService;
import file_management.peoject.entity.ProfessMeasures;

import java.util.List;

public interface ProMeasureService extends IService<ProfessMeasures> {
    List<ProfessMeasures> GetAllByteacherId(Integer teacherId);

    Boolean SelectByFileId(Integer fileid);

    Boolean DeleteByFileId(Integer fileid);

    Boolean UpdateByFileId(ProfessMeasures professMeasures);

    Boolean SaveProfess(ProfessMeasures professMeasures);
}

package file_management.peoject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import file_management.peoject.entity.ProfessMeasures;
import file_management.peoject.mapper.ProMeasureMapper;
import file_management.peoject.service.ProMeasureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProMeasureServiceImpl extends ServiceImpl<ProMeasureMapper,ProfessMeasures> implements ProMeasureService {

    @Autowired
    ProMeasureMapper mapper;

    @Override
    public List<ProfessMeasures> GetAllByteacherId(Integer teacherId) {

        List<ProfessMeasures> professMeasures = mapper.GetAllByteacherId(teacherId);

        return professMeasures;
    }

    @Override
    public Boolean SelectByFileId(Integer fileid) {
        Boolean flag = mapper.SelectByFileId(fileid);
        return flag;
    }

    @Override
    public Boolean DeleteByFileId(Integer fileid) {
        Boolean flag = mapper.DeleteByFileId(fileid);

        return flag;
    }

    @Override
    public Boolean UpdateByFileId(ProfessMeasures professMeasures) {

        mapper.UpdateByFileId(professMeasures);

        return null;
    }

    @Override
    public Boolean SaveProfess(ProfessMeasures professMeasures) {

        int insert = mapper.insert(professMeasures);

        return insert!=0?true:false;
    }
}

package file_management.peoject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import file_management.peoject.entity.TeacherAward;
import file_management.peoject.mapper.TearcherAwardMapper;
import file_management.peoject.service.TearcherAwardService;
import org.springframework.stereotype.Service;

@Service
public class TearcherAwardServiceImp extends ServiceImpl<TearcherAwardMapper, TeacherAward> implements TearcherAwardService {
}

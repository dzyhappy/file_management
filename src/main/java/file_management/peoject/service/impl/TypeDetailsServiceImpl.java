package file_management.peoject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import file_management.peoject.mapper.TypeDetailsMapper;
import file_management.peoject.entity.TypeDetails;
import file_management.peoject.service.TypeDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author dzyhappy
* @description 针对表【type_details】的数据库操作Service实现
* @createDate 2023-09-18 16:15:50
*/
@Service
public class TypeDetailsServiceImpl extends ServiceImpl<TypeDetailsMapper, TypeDetails>
    implements TypeDetailsService{

    @Autowired
    private TypeDetailsMapper typeDetailsMapper;

    @Override
    public List<TypeDetails> selectList() {
        return typeDetailsMapper.selectList(null);
    }
}





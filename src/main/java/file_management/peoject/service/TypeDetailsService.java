package file_management.peoject.service;

import file_management.peoject.entity.TypeDetails;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author dzyhappy
* @description 针对表【type_details】的数据库操作Service
* @createDate 2023-09-18 16:15:50
*/
public interface TypeDetailsService extends IService<TypeDetails> {


    List<TypeDetails> selectList();
}

package file_management.peoject.mapper;

import file_management.peoject.entity.Documents;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import file_management.peoject.entity.vo.DocumentsVo;
import org.apache.ibatis.annotations.Mapper;

import java.lang.reflect.Array;
import java.util.List;

/**
* @author dzyhappy
* @description 针对表【documents】的数据库操作Mapper
* @createDate 2023-09-18 16:15:08
* @Entity Documents
*/
@Mapper
public interface DocumentsMapper extends BaseMapper<Documents> {

    DocumentsVo GetDocumentsById(Integer numbers);

}





package file_management.peoject.service;

import com.baomidou.mybatisplus.extension.service.IService;
import file_management.peoject.entity.Documents;

import java.util.List;

/**
* @author dzyhappy
* @description 针对表【documents】的数据库操作Service
* @createDate 2023-09-18 16:15:09
*/
public interface DocumentsService extends IService<Documents> {

    List<Documents> GetDocumentsById(Integer typeId);
}

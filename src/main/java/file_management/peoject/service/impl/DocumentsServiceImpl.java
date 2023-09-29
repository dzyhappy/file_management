package file_management.peoject.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import file_management.peoject.entity.Documents;
import file_management.peoject.mapper.DocumentsMapper;
import file_management.peoject.service.DocumentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author dzyhappy
* @description 针对表【documents】的数据库操作Service实现
* @createDate 2023-09-18 16:15:09
*/
@Service
public class DocumentsServiceImpl extends ServiceImpl<DocumentsMapper, Documents>
    implements DocumentsService {

    @Autowired
    DocumentsMapper documentsMapper;



    @Override
    public List<Documents> GetDocumentsById(Integer typeId) {
        QueryWrapper<Documents> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("type_id",typeId);
        List<Documents> documentsList = documentsMapper.selectList(queryWrapper);
        return documentsList;
    }
}





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
import java.util.List;

@Service
public class DocumentsServiceImpl implements DocumentsService {

    @Autowired
    private DocumentsMapper documentsMapper; // 假设你的 DocumentsMapper 用于数据库操作

    @Override
    public Documents uploadDocument(Documents document) {
        // 执行插入操作，将档案信息保存到数据库
        documentsMapper.insert(document);
        return document;
    }

    @Override
    public List<Documents> getAllDocuments() {
        // 查询所有档案
        return documentsMapper.selectList(null);
    }

    @Override
    public Documents getDocumentById(Integer id) {
        // 根据ID查询档案
        return documentsMapper.selectById(id);
    }

    @Override
    public List<Documents> GetDocumentsById(Integer typeId) {
        QueryWrapper<Documents> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("type_id",typeId);
        List<Documents> documentsList = documentsMapper.selectList(queryWrapper);
        return documentsList;
    public Documents updateDocument(Integer id, Documents updatedDocument) {
        // 设置档案的ID并执行更新操作
        updatedDocument.setId(id);
        documentsMapper.updateById(updatedDocument);
        return updatedDocument;
    }

    @Override
    public boolean deleteDocument(Integer id) {
        // 根据ID执行删除操作
        int result = documentsMapper.deleteById(id);
        return result > 0;
    }
}

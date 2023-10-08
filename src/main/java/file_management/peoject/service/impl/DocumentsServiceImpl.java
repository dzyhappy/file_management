package file_management.peoject.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import file_management.peoject.entity.Documents;
import file_management.peoject.mapper.DocumentsMapper;
import file_management.peoject.service.DocumentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentsServiceImpl implements DocumentsService {

    @Autowired
    private DocumentsMapper documentsMapper;

    @Override
    public void uploadDocument(Documents document) {
        documentsMapper.insert(document);
    }

    @Override
    public Documents getDocumentById(Integer id) {
        // 根据ID查询档案
        return documentsMapper.selectById(id);
    }

    @Override
    public List<Documents> GetDocumentsById(Integer typeId) {
        QueryWrapper<Documents> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("type_id", typeId);
        List<Documents> documentsList = documentsMapper.selectList(queryWrapper);
        return documentsList;
    }

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

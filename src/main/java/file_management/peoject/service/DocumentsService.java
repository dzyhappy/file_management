package file_management.peoject.service;

import file_management.peoject.entity.Documents;

import java.util.List;

public interface DocumentsService {

    /**
     * 获取正文
     * */
    List<Documents> GetDocumentsById(Integer typeId);

    /**
     * 上传档案
     * @param document 要上传的档案对象
     * @return 上传后的档案对象
     */
    void uploadDocument(Documents document);

    /**
     * 根据ID获取档案
     * @param id 档案的ID
     * @return 档案对象
     */
    Documents getDocumentById(Integer id);

    /**
     * 更新档案信息
     * @param id 档案的ID
     * @param updatedDocument 更新后的档案对象
     * @return 更新后的档案对象
     */
    Documents updateDocument(Integer id, Documents updatedDocument);

    /**
     * 删除档案
     * @param id 档案的ID
     * @return 删除是否成功的布尔值
     */
    boolean deleteDocument(Integer id);
}

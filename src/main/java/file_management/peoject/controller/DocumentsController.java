package file_management.peoject.controller;

import file_management.peoject.common.*;
import file_management.peoject.entity.Documents;
import file_management.peoject.service.DocumentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
* 文件操作
* */

@RestController
@RequestMapping("/file")
public class DocumentsController {

    @Autowired
    private DocumentsService documentsService; // DocumentsService 用于处理档案的业务逻辑

    /**
    * 上传
    * */
    @PostMapping("/upload")
    public Result uploadDocument(@RequestBody UploadRequest uploadRequest) {
        try {
            Documents document=new Documents();
            document.setFileLocation(uploadRequest.getFile());
            document.setName(uploadRequest.getName());
            document.setOverview(uploadRequest.getOverview());
            document.setTypeId(uploadRequest.getTypeId());
            // 处理文件上传
            documentsService.uploadDocument(document);
            return Result.success("上传成功");
        } catch (Exception e) {
            return Result.fail("上传失败");
        }
    }

    /**
     * 下载
     * */
    @PostMapping("/download")
    public Result downloadDocument(@RequestBody DownloadRequest request) {
        try {
            Documents document = documentsService.getDocumentById(request.getId());// 根据ID查询档案
            if (document != null) {// 如果档案存在
                DownloadResponse response = new DownloadResponse();// DownloadResponse 用于返回下载结果
                response.setFile(document.getFileLocation());// 设置文件路径
                response.setName(document.getName());// 设置文件名
                return Result.success("下载成功", response);
            } else {
                return Result.fail("下载失败");
            }
        } catch (Exception e) {
            return Result.fail("下载失败");
        }
    }

    // 修改接口
    @PostMapping("/save")
    public Result saveDocument(@RequestBody UpdateRequest updateRequest) {
        try {
            Documents document=new Documents();
            document.setFileLocation(updateRequest.getFile());
            document.setName(updateRequest.getName());
            document.setOverview(updateRequest.getOverview());
            document.setTypeId(updateRequest.getTypeId());
            // 处理修改操作，你可以在 DocumentsService 中实现具体的修改逻辑
            documentsService.updateDocument(updateRequest.getId(), document);
            return Result.success("成功");
        } catch (Exception e) {
            return Result.fail("失败");
        }
    }

    // 删除接口
    @PostMapping("/delete")
    public Result deleteDocument(@RequestBody DeleteRequest request) {
        try {
            boolean deleted = documentsService.deleteDocument(request.getId());
            if (deleted) {
                return Result.success("成功");
            } else {
                return Result.fail("失败");
            }
        } catch (Exception e) {
            return Result.fail("失败");
        }
    }
}

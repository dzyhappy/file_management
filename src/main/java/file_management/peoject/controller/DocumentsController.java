package file_management.peoject.controller;
import file_management.peoject.common.DeleteRequest;
import file_management.peoject.common.DownloadRequest;
import file_management.peoject.common.DownloadResponse;
import file_management.peoject.common.Result;
import file_management.peoject.entity.Documents;
import file_management.peoject.service.DocumentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/file")
public class DocumentsController {

    @Autowired
    private DocumentsService documentsService; // DocumentsService 用于处理档案的业务逻辑

    // 上传
    @PostMapping("/upload")
    public Result uploadDocument(@RequestParam("file") Documents file,
                                 @RequestParam("typeId") Integer typeId,
                                 @RequestParam("name") String name,
                                 @RequestParam("overview") String overview) {
        try {
            Documents document = new Documents();
            document.setTypeId(typeId);
            document.setName(name);
            document.setOverview(overview);
            // 处理文件上传
            documentsService.uploadDocument(file);
            return Result.success("上传成功");
        } catch (Exception e) {
            return Result.fail("上传失败");
        }
    }

    // 下载接口
    @PostMapping("/download")
    public Result downloadDocument(@RequestBody DownloadRequest request) {// DownloadRequest 用于接收下载请求
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
    public Result saveDocument(@RequestBody Documents document) {
        try {
            // 处理修改操作，你可以在 DocumentsService 中实现具体的修改逻辑
            documentsService.updateDocument(document.getId(), document);
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

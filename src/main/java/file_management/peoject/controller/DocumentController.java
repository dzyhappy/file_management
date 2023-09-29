package file_management.peoject.controller;

import com.alibaba.fastjson.JSONObject;
import file_management.peoject.common.Result;
import file_management.peoject.entity.Documents;
import file_management.peoject.service.impl.DocumentsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/document")
public class DocumentController {
    @Autowired
    DocumentsServiceImpl documentsService;

    @PostMapping("/content")
     public Result getDocument(@RequestBody JSONObject request){
        Integer typeId = request.getInteger("typeId");
        List<Documents> documentsList =documentsService.GetDocumentsById(typeId);
        if(documentsList.isEmpty()){
            return Result.fail("获取信息失败");
        }
        return Result.success("获取数据成功",documentsList);
    }
}

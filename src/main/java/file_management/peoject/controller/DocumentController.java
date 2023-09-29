package file_management.peoject.controller;

import com.alibaba.fastjson.JSONObject;
import file_management.peoject.common.Result;
import file_management.peoject.entity.vo.DocumentsVo;
import file_management.peoject.service.impl.DocumentsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/document")
public class DocumentController {
    @Autowired
    DocumentsServiceImpl documentsService;

    @PostMapping("/content")
     public Result getDocument(@RequestBody JSONObject request){
        Integer id = request.getInteger("typeId");
        System.out.println("type_id: " + id);
        DocumentsVo  documentVo =documentsService.GetDocumentsById(id);
        if(documentVo==null){
            return Result.fail("获取信息失败");
        }
        return Result.success("获取数据成功",documentVo);
    }
    @PostMapping("/test")
    public void testDocument(@RequestBody String id){
        System.out.println("啊？"+id);
    }

}

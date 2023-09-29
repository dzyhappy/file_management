package file_management.peoject.controller;

import com.alibaba.fastjson2.JSONObject;
import file_management.peoject.entity.Documents;
import file_management.peoject.entity.vo.DocumentsVo;
import file_management.peoject.service.impl.DocumentsServiceImpl;
import file_management.peoject.untill.ReturnUntill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/document")
public class DocumentController {
    @Autowired
    DocumentsServiceImpl documentsService;

    @PostMapping("/content")
     ReturnUntill getDocument(@RequestBody JSONObject request){
//        String[] numbersson=id.substring(1,id.length()-1).split(",");
//        Integer[] numbers =new Integer [numbersson.length];
//        for (int i = 0; i < numbersson.length; i++) {
//            numbers[i]=Integer.parseInt(numbersson[i]);
//        }
        Integer id = request.getInteger("type_id");
        System.out.println("type_id: " + id);
        System.out.println(1);

        System.out.println(2);
        DocumentsVo  documentVo = (DocumentsVo) documentsService.GetDocumentsById(id);
        if(documentVo==null){
            return new ReturnUntill(0,"获取信息失败",null );
        }
        return new ReturnUntill(1,"获取数据成功",documentVo);
    }
    @PostMapping("/test")
    public void testDocument(@RequestBody String id){
        System.out.println("啊？"+id);
    }

}

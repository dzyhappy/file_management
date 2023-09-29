package file_management.peoject.controller;

import file_management.peoject.common.Result;
import file_management.peoject.entity.TypeDetails;
import file_management.peoject.service.TypeDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/document")
public class CatalogController {

    @Autowired
    private TypeDetailsService typeDetailsService;

    @GetMapping("/catalog")
    public Result getDocumentCatalog() {
        List<TypeDetails> catalog=typeDetailsService.selectList();
        if (catalog.isEmpty()){
            return Result.fail("获取目录失败");
        }
        return Result.success("请求成功",catalog);
    }
}

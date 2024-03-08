package file_management.peoject.controller;

import file_management.peoject.common.Result;
import file_management.peoject.entity.ProfessMeasures;
import file_management.peoject.service.ProMeasureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professmeasures")
public class ProMeasureController {

    @Autowired
    ProMeasureService proMeasureService;

    @PostMapping("delmeasures")
    public Result delmeasures(@RequestParam Integer fileId ){

        proMeasureService.DeleteByFileId(fileId);

        return Result.success();
    }

    @GetMapping("getmeasures")
    public Result getmeasures(@RequestParam Integer teacherId){
        List<ProfessMeasures> professMeasures = proMeasureService.GetAllByteacherId(teacherId);
        return Result.success("查找成功",professMeasures);
    }

    @PostMapping("savemeasures")
    public Result savemeasures(@RequestBody ProfessMeasures professMeasures){

        proMeasureService.save(professMeasures);

        return Result.success();
    }

    @PostMapping("update")
    public Result update(@RequestBody ProfessMeasures professMeasures){

        proMeasureService.updateById(professMeasures);

        return Result.success();
    }


}

package file_management.peoject.controller;

import file_management.peoject.common.Result;
import file_management.peoject.entity.ProfessMeasures;
import file_management.peoject.exception.BusinessException;
import file_management.peoject.exception.BusinessExceptionEnum;
import file_management.peoject.service.ProMeasureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/professmeasures")
public class ProMeasureController {

    @Autowired
    ProMeasureService proMeasureService;

    @PostMapping("delmeasures")
    public Result delmeasures(@RequestParam Integer fileId ){

        Boolean result = proMeasureService.DeleteByFileId(fileId);
        if (!result){
            throw new BusinessException(BusinessExceptionEnum.Delete_Failed);
        }else {
            return Result.success();
        }
    }

    @GetMapping("getmeasures")
    public Result getmeasures(@RequestParam Integer teacherId){
        List<ProfessMeasures> professMeasures = proMeasureService.GetAllByteacherId(teacherId);
        if (professMeasures==null){
            throw new BusinessException(BusinessExceptionEnum.NULL_CHECK);
        }else {
            return Result.success("查询成功", professMeasures);
        }
    }

    @PostMapping("savemeasures")
    public Result savemeasures(@Valid @RequestBody ProfessMeasures professMeasures){

        boolean result = proMeasureService.save(professMeasures);
        if (!result){
            throw new BusinessException(BusinessExceptionEnum.Write_Failed);
        }else {
            return Result.success();
        }
    }

    @PostMapping("update")
    public Result update(@Valid @RequestBody ProfessMeasures professMeasures){

        boolean result = proMeasureService.updateById(professMeasures);
        if (!result){
            throw new BusinessException(BusinessExceptionEnum.Write_Failed);
        }else {
            return Result.success();
        }
    }


}

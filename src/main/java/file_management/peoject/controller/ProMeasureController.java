package file_management.peoject.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import file_management.peoject.common.Result;
import file_management.peoject.entity.ProfessMeasures;
import file_management.peoject.exception.BusinessException;
import file_management.peoject.exception.BusinessExceptionEnum;
import file_management.peoject.service.ProMeasureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/professmeasures")
public class ProMeasureController {

    @Autowired
    ProMeasureService proMeasureService;

    @PostMapping("/delmeasures")
    public Result delmeasures(@RequestBody ProfessMeasures professMeasures) {

        Boolean result = proMeasureService.DeleteByFileId(professMeasures.getId());
        if (!result) {
            throw new BusinessException(BusinessExceptionEnum.Delete_Failed);
        } else {
            return Result.success();
        }
    }

    @GetMapping("/getmeasures")
    public Result getmeasures( Integer teacherId) {
        List<ProfessMeasures> professMeasures = null;
        if (teacherId == null) {
            professMeasures = proMeasureService.list();
        } else {
            LambdaQueryWrapper<ProfessMeasures> lambdaQueryWrapper = new LambdaQueryWrapper<>();
            lambdaQueryWrapper.eq(ProfessMeasures::getTeacherId, teacherId);
            professMeasures=proMeasureService.list(lambdaQueryWrapper);
        }
        if (professMeasures == null) {
            throw new BusinessException(BusinessExceptionEnum.NULL_CHECK);
        } else {
            return Result.success("查询成功", professMeasures);
        }
    }

    @PostMapping("/savemeasures")
    public Result savemeasures(@Valid @RequestBody ProfessMeasures professMeasures) {

        try {
            boolean result = proMeasureService.save(professMeasures);
            if (!result) {
                throw new BusinessException(BusinessExceptionEnum.Write_Failed);
            } else {
                return Result.success();
            }
        } catch (DataAccessException e) {
            throw new BusinessException(BusinessExceptionEnum.SQL_Failed);
        }
    }

    @PostMapping("/update")
    public Result update(@RequestBody ProfessMeasures professMeasures) {

        boolean result = proMeasureService.updateById(professMeasures);
        if (!result) {
            throw new BusinessException(BusinessExceptionEnum.Write_Failed);
        } else {
            return Result.success();
        }
    }


}

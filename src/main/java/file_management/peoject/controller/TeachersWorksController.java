package file_management.peoject.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import file_management.peoject.common.Result;
import file_management.peoject.entity.TeachersWorks;
import file_management.peoject.exception.BusinessException;
import file_management.peoject.exception.BusinessExceptionEnum;
import file_management.peoject.service.TeachersWorksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


/**
 * 获奖情况
 */
@RestController
@RequestMapping("/teachers_works")
public class TeachersWorksController {

    @Autowired
    TeachersWorksService service;

    @GetMapping("/getwork")
    public Result getWork(@RequestParam Integer teacherId) {

        LambdaQueryWrapper<TeachersWorks> wrapper =new LambdaQueryWrapper();
        wrapper.eq(TeachersWorks::getTeacherId,teacherId);
        List<TeachersWorks> list = service.list(wrapper);
        if (list==null){
            throw new BusinessException(BusinessExceptionEnum.NULL_CHECK);
        }else {
            return Result.success("查询成功", list);
        }
    }

    @PostMapping("/delwork")
    public Result delWork(@RequestBody TeachersWorks teachersWorks) {

        boolean result = service.removeById(teachersWorks);
        if (!result){
            throw new BusinessException(BusinessExceptionEnum.Delete_Failed);
        }else {
            return Result.success();
        }
    }

    @PostMapping("/uploadwork")
    public Result uploadwork(@Valid @RequestBody TeachersWorks teachersWorks) {

        try {
            boolean result = service.save(teachersWorks);
            if (!result){
                throw new BusinessException(BusinessExceptionEnum.Write_Failed);
            }else {
                return Result.success();
            }
        }catch (DataAccessException e){
            throw new BusinessException(BusinessExceptionEnum.SQL_Failed);
        }
    }

    @PostMapping("/updatework")
    public Result updatework(@Valid @RequestBody TeachersWorks teachersWorks) {
        
        boolean result = service.updateById(teachersWorks);
        if (!result){
            throw new BusinessException(BusinessExceptionEnum.Write_Failed);
        }else {
            return Result.success();
        }
    }
}

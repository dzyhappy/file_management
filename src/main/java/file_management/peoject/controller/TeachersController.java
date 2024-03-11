package file_management.peoject.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import file_management.peoject.common.Result;
import file_management.peoject.entity.Teachers;
import file_management.peoject.exception.BusinessException;
import file_management.peoject.exception.BusinessExceptionEnum;
import file_management.peoject.service.TeachersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/teacher/information")
public class TeachersController {


    @Autowired
    TeachersService service;

    @GetMapping("/get")
    public Result getInformation(Integer id){

        Teachers teacher = service.getById(id);
        if (teacher==null){
            throw new BusinessException(BusinessExceptionEnum.NULL_CHECK);
        }else {
            return Result.success("查询成功", teacher);
        }
    }



    @PostMapping("/update")
    public Result updateInformation(@Valid @RequestBody Teachers teacher){

        boolean result = service.updateById(teacher);
        if (!result){
            throw new BusinessException(BusinessExceptionEnum.Write_Failed);
        }else {
            return Result.success();
        }

    }

    @PostMapping("/delete")
    public Result deleteInformation(@RequestBody Teachers teacher){

//        LambdaQueryWrapper<Teachers> wrapper =new LambdaQueryWrapper();
//        wrapper.eq(Teachers::getTeacherId,teacher.getTeacherId());

        boolean result = service.removeById(teacher);
        if (!result){
            throw new BusinessException(BusinessExceptionEnum.Delete_Failed);
        }else {
            return Result.success();
        }
    }

    @PostMapping("/upload")
    public Result uploadInformation(@Valid @RequestBody Teachers teacher){

        try {
            boolean result = service.save(teacher);
            if (!result) {
                throw new BusinessException(BusinessExceptionEnum.Write_Failed);
            } else {
                return Result.success();
            }
        }catch (DataAccessException e){
            throw new BusinessException(BusinessExceptionEnum.SQL_Failed);
        }
    }

    @GetMapping("/all")
    public Result getall(){

        List<Teachers> list = service.list();
        if(list==null){
            throw new BusinessException(BusinessExceptionEnum.NULL_CHECK);
        }else{
            return Result.success("查询成功",list);
        }
    }

}

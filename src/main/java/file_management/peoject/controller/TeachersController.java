package file_management.peoject.controller;


import file_management.peoject.common.Result;
import file_management.peoject.entity.Teachers;
import file_management.peoject.service.TeachersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher/information")
public class TeachersController {


    @Autowired
    TeachersService service;

    @GetMapping("/get")
    public Result getInformation(Integer id){

        Teachers teacher = service.getById(id);


        return Result.success("查询成功",teacher);
    }



    @PostMapping("/update")
    public Result updateInformation(@RequestBody Teachers teacher){

        service.updateById(teacher);

        return Result.success();
    }

    @PostMapping("/delete")
    public Result deleteInformation(@RequestBody Teachers teacher){

        service.removeById(teacher);


        return Result.success();
    }

    @PostMapping("/upload")
    public Result uploadInformation(@RequestBody Teachers teacher){

        boolean s = service.save(teacher);

        if(!s){
            return Result.fail("添加失败");
        }

        return Result.success();
    }

    @GetMapping("/all")
    public Result getall(){

        List<Teachers> list = service.list();
        return Result.success("查询成功",list);
    }

}

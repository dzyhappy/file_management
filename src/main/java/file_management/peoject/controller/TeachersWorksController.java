package file_management.peoject.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import file_management.peoject.common.Result;
import file_management.peoject.entity.Teachers;
import file_management.peoject.entity.TeachersWorks;
import file_management.peoject.service.TeachersService;
import file_management.peoject.service.TeachersWorksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public Result getWork(Integer teacherId) {

        LambdaQueryWrapper<TeachersWorks> wrapper =new LambdaQueryWrapper();
        wrapper.eq(TeachersWorks::getTeacherId,teacherId);
        List<TeachersWorks> list = service.list(wrapper);

        return Result.success("查询成功", list);
    }

    @PostMapping("/delwork")
    public Result delWork(@RequestBody TeachersWorks teachersWorks) {

        service.removeById(teachersWorks);

        return Result.success();
    }

    @PostMapping("/uploadwork")
    public Result uploadwork(@RequestBody TeachersWorks teachersWorks) {

        service.save(teachersWorks);

        return Result.success();
    }

    @PostMapping("/updatework")
    public Result updatework(@RequestBody TeachersWorks teachersWorks) {

        service.updateById(teachersWorks);

        return Result.success();
    }
}

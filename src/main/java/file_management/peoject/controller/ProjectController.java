package file_management.peoject.controller;

import file_management.peoject.common.Result;
import file_management.peoject.entity.Project;
import file_management.peoject.entity.StudenTest;
import file_management.peoject.service.ProjectService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/teacher/project")
public class ProjectController {
    @Autowired
    ProjectService projectService;

    //信息获取
    @PostMapping("/details")
    public Result Details(@RequestBody Project project){

        List<Project> projects = projectService.SelectByTeacherId(Integer.parseInt(project.getTeacherId()));
        return Result.success("成功",projects);
    }

    @PostMapping("/save")
    public Result Upload(@RequestBody Project project){


        Boolean aBoolean = projectService.SaveProject(project);

        if(!aBoolean){
            return Result.success();
        }

        return Result.fail("添加失败");
    }

    @PostMapping("/update")
    public Result update(@RequestBody Project project){

        projectService.updateById(project);

        return Result.success();
    }

    @PostMapping("/delete")
    public Result delete(@RequestBody Project project){


       projectService.removeById(project);

        return Result.success();
    }

}

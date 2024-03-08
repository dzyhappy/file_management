package file_management.peoject.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import file_management.peoject.common.Result;
import file_management.peoject.entity.Projects;
import file_management.peoject.service.ProjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teacher/project")
public class ProjectsController {
    @Autowired
    ProjectsService projectService;

    //信息获取
    @PostMapping("/details")
    public Result Details(@RequestBody Projects project){

        LambdaQueryWrapper<Projects> wrapper =new LambdaQueryWrapper();

        wrapper.eq(Projects::getTeacherId,project.getTeacherId());

        List<Projects> projects = projectService.list(wrapper);

        return Result.success("成功",projects);
    }

    @PostMapping("/save")
    public Result Upload(@RequestBody Projects project){


        Boolean aBoolean = projectService.save(project);

        if(!aBoolean){
            return Result.fail("添加失败");
        }

        return Result.success();
    }

    @PostMapping("/update")
    public Result update(@RequestBody Projects project){

        boolean b = projectService.updateById(project);

        if(!b){
            return Result.fail("添加失败");
        }

        return Result.success();
    }

    @PostMapping("/delete")
    public Result delete(@RequestBody Projects project){


       projectService.removeById(project);

        return Result.success();
    }

}

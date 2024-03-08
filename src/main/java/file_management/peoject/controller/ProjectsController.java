package file_management.peoject.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import file_management.peoject.common.Result;
import file_management.peoject.entity.Projects;
import file_management.peoject.exception.BusinessException;
import file_management.peoject.exception.BusinessExceptionEnum;
import file_management.peoject.service.ProjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
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
        if (projects==null){
            throw new BusinessException(BusinessExceptionEnum.NULL_CHECK);
        }else {
            return Result.success("查询成功", projects);
        }
    }

    @PostMapping("/save")
    public Result Upload(@Valid @RequestBody Projects project){


        Boolean result = projectService.save(project);
        if (!result){
            throw new BusinessException(BusinessExceptionEnum.Write_Failed);
        }else {
            return Result.success();
        }
    }

    @PostMapping("/update")
    public Result update(@Valid @RequestBody Projects project){

        boolean result = projectService.updateById(project);
        if (!result){
            throw new BusinessException(BusinessExceptionEnum.Write_Failed);
        }else {
            return Result.success();
        }
    }

    @PostMapping("/delete")
    public Result delete(@Valid @RequestBody Projects project){


        boolean result = projectService.removeById(project);
        if (!result){
            throw new BusinessException(BusinessExceptionEnum.Delete_Failed);
        }else {
            return Result.success();
        }
    }

}

package file_management.peoject.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import file_management.peoject.common.Result;
import file_management.peoject.entity.StudentAssessment;
import file_management.peoject.entity.SupervisorAssessment;
import file_management.peoject.entity.TeachersWorks;
import file_management.peoject.service.StudentAssessmentService;
import file_management.peoject.service.SupervisorAssessmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/assessment")
public class SupervisorAssessmentController {

    @Autowired
    SupervisorAssessmentService service;

    @Autowired
    StudentAssessmentService assessmentService;

    @GetMapping("/supervisor/get")
    public Result getSupervisor(Integer teacherId){



        if(teacherId==null||teacherId.equals("")){
            List<SupervisorAssessment> list = service.list();
            Result.success("获取成功",list);
        }

        LambdaQueryWrapper<SupervisorAssessment> wrapper =new LambdaQueryWrapper();
        wrapper.eq(SupervisorAssessment::getTeacherId,teacherId);
        List<SupervisorAssessment> list = service.list(wrapper);


        return Result.success("获取成功",list);
    }

    @PostMapping("/supervisor/delete")
    public Result delSupervisor(@RequestBody SupervisorAssessment assessment){

        service.removeById(assessment);

        return Result.success();
    }

    @PostMapping("/supervisor/put")
    public Result putSupervisor(@RequestBody SupervisorAssessment assessment){

        service.save(assessment);

        return Result.success();
    }



    @PostMapping("/supervisor/patch")
    public Result updateSupervisor(@RequestBody SupervisorAssessment assessment){

        service.updateById(assessment);

        return Result.success();
    }

    /**
     * 往下是学生
     */


    @GetMapping("/student/get")
    public Result getStudent(Integer teacherId){





        if(teacherId==null||teacherId.equals("")){
            List<StudentAssessment> list = assessmentService.list();
            Result.success("获取成功",list);
        }

        LambdaQueryWrapper<StudentAssessment> wrapper =new LambdaQueryWrapper();
        wrapper.eq(StudentAssessment::getTeacherId,teacherId);
        List<StudentAssessment> list = assessmentService.list(wrapper);


        return Result.success("获取成功",list);
    }

    @PostMapping("/student/delete")
    public Result delStudent(@RequestBody StudentAssessment assessment){

        assessmentService.removeById(assessment);

        return Result.success();
    }

    @PostMapping("/student/put")
    public Result putStudent(@RequestBody StudentAssessment assessment){

        assessmentService.save(assessment);

        return Result.success();
    }



    @PostMapping("/student/patch")
    public Result updateStudent(@RequestBody StudentAssessment assessment){


        assessmentService.updateById(assessment);

        return Result.success();
    }

}

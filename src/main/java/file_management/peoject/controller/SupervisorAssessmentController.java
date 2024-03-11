package file_management.peoject.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import file_management.peoject.common.Result;
import file_management.peoject.entity.StudentAssessment;
import file_management.peoject.entity.SupervisorAssessment;
import file_management.peoject.exception.BusinessException;
import file_management.peoject.exception.BusinessExceptionEnum;
import file_management.peoject.service.StudentAssessmentService;
import file_management.peoject.service.SupervisorAssessmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
           return  Result.success("获取成功",list);
        }

        LambdaQueryWrapper<SupervisorAssessment> wrapper =new LambdaQueryWrapper();
        wrapper.eq(SupervisorAssessment::getTeacherId,teacherId);
        List<SupervisorAssessment> list = service.list(wrapper);

        if (list==null){
            throw new BusinessException(BusinessExceptionEnum.NULL_CHECK);
        }else {
            return Result.success("查询成功", list);
        }
    }

    @PostMapping("/supervisor/delete")
    public Result delSupervisor(@RequestBody SupervisorAssessment assessment){

        boolean result = service.removeById(assessment);
        if (!result){
            throw new BusinessException(BusinessExceptionEnum.Delete_Failed);
        }else {
            return Result.success();
        }
    }

    @PostMapping("/supervisor/put")
    public Result putSupervisor(@Valid @RequestBody SupervisorAssessment assessment){

        try {
            boolean result = service.save(assessment);
            if (!result){
                throw new BusinessException(BusinessExceptionEnum.Write_Failed);
            }else {
                return Result.success();
            }
        }catch (DataAccessException e){
            throw new BusinessException(BusinessExceptionEnum.SQL_Failed);
        }
    }



    @PostMapping("/supervisor/patch")
    public Result updateSupervisor(@RequestBody SupervisorAssessment assessment){

        boolean result = service.updateById(assessment);
        if (!result){
            throw new BusinessException(BusinessExceptionEnum.Write_Failed);
        }else {
            return Result.success();
        }
    }

    /**
     * 往下是学生
     */


    @GetMapping("/student/get")
    public Result getStudent(Integer teacherId){

        if(teacherId==null||teacherId.equals("")){
            List<StudentAssessment> list = assessmentService.list();
            return Result.success("获取成功",list);
        }

        LambdaQueryWrapper<StudentAssessment> wrapper =new LambdaQueryWrapper();
        wrapper.eq(StudentAssessment::getTeacherId,teacherId);
        List<StudentAssessment> list = assessmentService.list(wrapper);


        System.out.println(list);
        if (list==null){
            throw new BusinessException(BusinessExceptionEnum.NULL_CHECK);
        }else {
            return Result.success("查询成功", list);
        }
    }

    @PostMapping("/student/delete")
    public Result delStudent(@RequestBody StudentAssessment assessment){

        boolean result = assessmentService.removeById(assessment);
        if (!result){
            throw new BusinessException(BusinessExceptionEnum.Write_Failed);
        }else {
            return Result.success();
        }
    }

    @PostMapping("/student/put")
    public Result putStudent(@Valid @RequestBody StudentAssessment assessment){

        try {
            boolean result = assessmentService.save(assessment);
            if (!result){
                throw new BusinessException(BusinessExceptionEnum.Write_Failed);
            }else {
                return Result.success();
            }
        }catch (DataAccessException e){
            throw new BusinessException(BusinessExceptionEnum.SQL_Failed);
        }
    }



    @PostMapping("/student/patch")
    public Result updateStudent(@RequestBody StudentAssessment assessment){

        boolean result = assessmentService.updateById(assessment);
        if (!result){
            throw new BusinessException(BusinessExceptionEnum.Write_Failed);
        }else {
            return Result.success();
        }
    }

}

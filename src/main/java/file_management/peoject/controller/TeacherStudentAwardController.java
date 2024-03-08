package file_management.peoject.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import file_management.peoject.common.Result;
import file_management.peoject.entity.TeacherAward;
import file_management.peoject.entity.TeacherStudentAward;
import file_management.peoject.entity.dto.TeacherStudentAwardDTO;
import file_management.peoject.service.TeacherStudentAwardService;
import file_management.peoject.service.TearcherAwardService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 因为并没有在teacherAward表中设置主键所以mq中所有的ById方法都不能使用
 */
@RestController
@RequestMapping("/teacher_student_award")
public class TeacherStudentAwardController {

    @Autowired
    TeacherStudentAwardService teacherStudentAwardService;

    @Autowired
    TearcherAwardService tearcherAwardService;


    /**
     * 此处id为教师id
     * @param id
     * @return
     */
    @GetMapping("/get")
    public Result get(Integer id){

        //     * 根据从TeacherAward表中获取所有与其有关的奖项的id
        LambdaQueryWrapper<TeacherAward> wrapper =new LambdaQueryWrapper();
        wrapper.eq(TeacherAward::getTeacherId,id);
        Set<Integer> collect = tearcherAwardService.list(wrapper).stream().map(TeacherAward::getAwardId).collect(Collectors.toSet());

        //     * 然后查询所有id
        List<TeacherStudentAward> list = teacherStudentAwardService.listByIds(collect);


        return Result.success("查找成功",list);
    }



    @PostMapping("/update")
    public Result update(@RequestBody TeacherStudentAwardDTO teacher){

        //首先查询TeacherAward中的数据查询到所有的与该奖项有关的教师
        LambdaQueryWrapper<TeacherAward> wrapper =new LambdaQueryWrapper();
        wrapper.eq(TeacherAward::getAwardId,teacher.getId());
        List<Integer> teacherids = tearcherAwardService.list(wrapper).stream().map(TeacherAward::getTeacherId).collect(Collectors.toList());


        TeacherStudentAward teacherStudentAward =new TeacherStudentAward();
        BeanUtils.copyProperties(teacher,teacherStudentAward);

        //构造下面用来更新的语句
        LambdaQueryWrapper<TeacherStudentAward> wrapper1 =new LambdaQueryWrapper();
        wrapper1.eq(TeacherStudentAward::getId,teacherStudentAward.getId());

        if(!teacher.getTeacherId().isEmpty()){
            //如果不为空则将所有的有关该奖的数据从TeacherAward中的数据删除
            tearcherAwardService.remove(wrapper);
            //然后重新存
            TeacherAward award =new TeacherAward();
            award.setAwardId(teacher.getId());
            teacherids.forEach(id->{
                award.setTeacherId(id);
                tearcherAwardService.save(award);
            });

            //然后直接更新
            teacherStudentAwardService.update(teacherStudentAward,wrapper1);
            return Result.success();

        }

        //如果为空 那么直接修改
        teacherStudentAwardService.update(wrapper1);


        return Result.success();
    }

    @PostMapping("/delete")
    public Result delete(@RequestBody TeacherStudentAwardDTO teacher){

        //从TeacherAward中获取所有和该奖项id有关的数据
        LambdaQueryWrapper<TeacherAward> wrapper1 =new LambdaQueryWrapper();
        wrapper1.eq(TeacherAward::getAwardId,teacher.getId());
        tearcherAwardService.remove(wrapper1);


        LambdaQueryWrapper<TeacherStudentAward> wrapper2 =new LambdaQueryWrapper();
        wrapper2.eq(TeacherStudentAward::getId,teacher.getId());
        teacherStudentAwardService.remove(wrapper2);


        return Result.success();
    }

    //新增时规定前端传的DTO里的teacherId的数据为一个list集合
    @PostMapping("/add")
    public Result save(@RequestBody TeacherStudentAwardDTO teacher){
        List<Integer> teacherIds = teacher.getTeacherId();

        TeacherStudentAward teacherStudentAward =new TeacherStudentAward();
        TeacherAward teacherAward =new TeacherAward();

        //首先存获奖的数据，获奖数据是没有teacherid的，我们先把拷贝数据，数据拷贝完之后就可以直接保存了
        BeanUtils.copyProperties(teacher,teacherStudentAward);
        teacherStudentAwardService.save(teacherStudentAward);

        teacherAward.setAwardId(teacherStudentAward.getId());

        //然后是存TeacherAward的数据,直接遍历，不会更高级的办法
        teacherIds.forEach(id->{
            teacherAward.setTeacherId(id);
            tearcherAwardService.save(teacherAward);
        });

        return Result.success();
    }

    @GetMapping("/all")
    public Result getall(){

        List<TeacherStudentAward> list = teacherStudentAwardService.list();


        return Result.success("查询成功",list);
    }


}

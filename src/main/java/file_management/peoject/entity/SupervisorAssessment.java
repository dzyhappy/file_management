package file_management.peoject.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName supervisor_assessment
 */
@TableName(value ="supervisor_assessment")
@Data
public class SupervisorAssessment implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 课程名称
     */
    @NotBlank(message = "字段不为空")
    private String courseName;

    /**
     * 教师编号
     */
    @NotBlank(message = "字段不为空")
    private String teacherId;

    /**
     * 听课班级
     */
    @NotBlank(message = "字段不为空")
    private String cls;

    /**
     * 听课日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date;

    /**
     * 第几节课
     */
    @TableField("`order`")
    private Integer order;

    /**
     * 听课地点
     */
    private String address;

    /**
     * 应到人数
     */
    private Integer shouldTotal;

    /**
     * 实到人数
     */
    private Integer haveTotal;

    /**
     * 迟到人数
     */
    private Integer lateTotal;

    /**
     * 开课学院
     */
    private String school;

    /**
     * 年份
     */

    private Integer year;

    /**
     * 综合评分
     */
    private Integer score;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", courseName=").append(courseName);
        sb.append(", teacherId=").append(teacherId);
        sb.append(", cls=").append(cls);
        sb.append(", date=").append(date);
        sb.append(", order=").append(order);
        sb.append(", address=").append(address);
        sb.append(", shouldTotal=").append(shouldTotal);
        sb.append(", haveTotal=").append(haveTotal);
        sb.append(", lateTotal=").append(lateTotal);
        sb.append(", school=").append(school);
        sb.append(", year=").append(year);
        sb.append(", score=").append(score);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
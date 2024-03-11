package file_management.peoject.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * 
 * @TableName student_assessment
 */
@TableName(value ="student_assessment")
@Data
public class StudentAssessment implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 教师编号
     */
    @NotBlank(message = "字段不为空")
    private String teacherId;

    /**
     * 课程名称
     */
    @NotBlank(message = "字段不为空")
    private String courseName;

    /**
     * 平均分
     */
    private Double averageScore;

    /**
     * 样本数
     */
    private Integer sampleTotal;

    /**
     * 参评率
     */
    private Integer participationRate;

    /**
     * 开始年份
     */
    private String year;

    /**
     * 上下学期
     */
    private Integer term;

    /**
     * 开课学院
     */
    private String school;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        StudentAssessment other = (StudentAssessment) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTeacherId() == null ? other.getTeacherId() == null : this.getTeacherId().equals(other.getTeacherId()))
            && (this.getCourseName() == null ? other.getCourseName() == null : this.getCourseName().equals(other.getCourseName()))
            && (this.getAverageScore() == null ? other.getAverageScore() == null : this.getAverageScore().equals(other.getAverageScore()))
            && (this.getSampleTotal() == null ? other.getSampleTotal() == null : this.getSampleTotal().equals(other.getSampleTotal()))
            && (this.getParticipationRate() == null ? other.getParticipationRate() == null : this.getParticipationRate().equals(other.getParticipationRate()))
            && (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getTerm() == null ? other.getTerm() == null : this.getTerm().equals(other.getTerm()))
            && (this.getSchool() == null ? other.getSchool() == null : this.getSchool().equals(other.getSchool()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTeacherId() == null) ? 0 : getTeacherId().hashCode());
        result = prime * result + ((getCourseName() == null) ? 0 : getCourseName().hashCode());
        result = prime * result + ((getAverageScore() == null) ? 0 : getAverageScore().hashCode());
        result = prime * result + ((getSampleTotal() == null) ? 0 : getSampleTotal().hashCode());
        result = prime * result + ((getParticipationRate() == null) ? 0 : getParticipationRate().hashCode());
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getTerm() == null) ? 0 : getTerm().hashCode());
        result = prime * result + ((getSchool() == null) ? 0 : getSchool().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", teacherId=").append(teacherId);
        sb.append(", courseName=").append(courseName);
        sb.append(", averageScore=").append(averageScore);
        sb.append(", sampleTotal=").append(sampleTotal);
        sb.append(", participationRate=").append(participationRate);
        sb.append(", year=").append(year);
        sb.append(", term=").append(term);
        sb.append(", school=").append(school);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
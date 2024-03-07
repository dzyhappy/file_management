package file_management.peoject.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

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
    private String courseName;

    /**
     * 教师编号
     */
    private String teacherId;

    /**
     * 听课班级
     */
    private String cls;

    /**
     * 听课日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date;

    /**
     * 第几节课
     */
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
    private String shool;

    /**
     * 年份
     */
    private Object year;

    /**
     * 综合评分
     */
    private Integer score;

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
        SupervisorAssessment other = (SupervisorAssessment) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCourseName() == null ? other.getCourseName() == null : this.getCourseName().equals(other.getCourseName()))
            && (this.getTeacherId() == null ? other.getTeacherId() == null : this.getTeacherId().equals(other.getTeacherId()))
            && (this.getCls() == null ? other.getCls() == null : this.getCls().equals(other.getCls()))
            && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getOrder() == null ? other.getOrder() == null : this.getOrder().equals(other.getOrder()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getShouldTotal() == null ? other.getShouldTotal() == null : this.getShouldTotal().equals(other.getShouldTotal()))
            && (this.getHaveTotal() == null ? other.getHaveTotal() == null : this.getHaveTotal().equals(other.getHaveTotal()))
            && (this.getLateTotal() == null ? other.getLateTotal() == null : this.getLateTotal().equals(other.getLateTotal()))
            && (this.getShool() == null ? other.getShool() == null : this.getShool().equals(other.getShool()))
            && (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCourseName() == null) ? 0 : getCourseName().hashCode());
        result = prime * result + ((getTeacherId() == null) ? 0 : getTeacherId().hashCode());
        result = prime * result + ((getCls() == null) ? 0 : getCls().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getOrder() == null) ? 0 : getOrder().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getShouldTotal() == null) ? 0 : getShouldTotal().hashCode());
        result = prime * result + ((getHaveTotal() == null) ? 0 : getHaveTotal().hashCode());
        result = prime * result + ((getLateTotal() == null) ? 0 : getLateTotal().hashCode());
        result = prime * result + ((getShool() == null) ? 0 : getShool().hashCode());
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        return result;
    }

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
        sb.append(", shool=").append(shool);
        sb.append(", year=").append(year);
        sb.append(", score=").append(score);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
package file_management.peoject.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName projects
 */
@TableName(value ="projects")
@Data
public class Projects implements Serializable {
    /**
     * 项目id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 项目名字
     */
    @NotBlank(message = "字段不为空")
    private String projectName;

    /**
     * 项目描述
     */
    private String description;

    /**
     * 项目开始时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startDate;

    /**
     * 项目结束时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endDate;

    /**
     * 项目负责人ID, 外键关联到教师表
     */
    @NotNull(message = "字段不为空")
    private Integer teacherId;

    /**
     * 项目等级
     */
    @NotBlank(message = "字段不为空")
    private String level;

    /**
     * 项目获取奖项
     */
    private String award;

    /**
     * 项目软著情况
     */
    private String softwareWorks;

    /**
     * 项目软著材料
     */
    private String softwareWorksPhoto;

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
        Projects other = (Projects) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProjectName() == null ? other.getProjectName() == null : this.getProjectName().equals(other.getProjectName()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getStartDate() == null ? other.getStartDate() == null : this.getStartDate().equals(other.getStartDate()))
            && (this.getEndDate() == null ? other.getEndDate() == null : this.getEndDate().equals(other.getEndDate()))
            && (this.getTeacherId() == null ? other.getTeacherId() == null : this.getTeacherId().equals(other.getTeacherId()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()))
            && (this.getAward() == null ? other.getAward() == null : this.getAward().equals(other.getAward()))
            && (this.getSoftwareWorks() == null ? other.getSoftwareWorks() == null : this.getSoftwareWorks().equals(other.getSoftwareWorks()))
            && (this.getSoftwareWorksPhoto() == null ? other.getSoftwareWorksPhoto() == null : this.getSoftwareWorksPhoto().equals(other.getSoftwareWorksPhoto()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        result = prime * result + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        result = prime * result + ((getTeacherId() == null) ? 0 : getTeacherId().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        result = prime * result + ((getAward() == null) ? 0 : getAward().hashCode());
        result = prime * result + ((getSoftwareWorks() == null) ? 0 : getSoftwareWorks().hashCode());
        result = prime * result + ((getSoftwareWorksPhoto() == null) ? 0 : getSoftwareWorksPhoto().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", projectName=").append(projectName);
        sb.append(", description=").append(description);
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", teacherId=").append(teacherId);
        sb.append(", level=").append(level);
        sb.append(", award=").append(award);
        sb.append(", softwareWorks=").append(softwareWorks);
        sb.append(", softwareWorksPhoto=").append(softwareWorksPhoto);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
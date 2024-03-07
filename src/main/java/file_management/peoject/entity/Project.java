package file_management.peoject.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Objects;

@Data
@TableName(value = "projects")
public class Project {

    //文档id
    @TableId(type = IdType.AUTO)
    private Integer id;

    //项目名称
    private String projectName;

    //项目描述
    private String description;

    //项目开始时间
    private String startDate;

    //项目结束时间
    private String endDate;

    //项目负责人ID
    private String teacherId;

    //项目等级
    private String level;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Project project = (Project) o;

        if (getId() != null ? !getId().equals(project.getId()) : project.getId() != null) return false;
        if (getProjectName() != null ? !getProjectName().equals(project.getProjectName()) : project.getProjectName() != null)
            return false;
        if (getDescription() != null ? !getDescription().equals(project.getDescription()) : project.getDescription() != null)
            return false;
        if (getStartDate() != null ? !getStartDate().equals(project.getStartDate()) : project.getStartDate() != null)
            return false;
        if (getEndDate() != null ? !getEndDate().equals(project.getEndDate()) : project.getEndDate() != null)
            return false;
        if (getTeacherId() != null ? !getTeacherId().equals(project.getTeacherId()) : project.getTeacherId() != null)
            return false;
        if (getLevel() != null ? !getLevel().equals(project.getLevel()) : project.getLevel() != null) return false;
        if (getAward() != null ? !getAward().equals(project.getAward()) : project.getAward() != null) return false;
        if (getSoftwareWorks() != null ? !getSoftwareWorks().equals(project.getSoftwareWorks()) : project.getSoftwareWorks() != null)
            return false;
        return getSoftwareWorksPhoto() != null ? getSoftwareWorksPhoto().equals(project.getSoftwareWorksPhoto()) : project.getSoftwareWorksPhoto() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getProjectName() != null ? getProjectName().hashCode() : 0);
        result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
        result = 31 * result + (getStartDate() != null ? getStartDate().hashCode() : 0);
        result = 31 * result + (getEndDate() != null ? getEndDate().hashCode() : 0);
        result = 31 * result + (getTeacherId() != null ? getTeacherId().hashCode() : 0);
        result = 31 * result + (getLevel() != null ? getLevel().hashCode() : 0);
        result = 31 * result + (getAward() != null ? getAward().hashCode() : 0);
        result = 31 * result + (getSoftwareWorks() != null ? getSoftwareWorks().hashCode() : 0);
        result = 31 * result + (getSoftwareWorksPhoto() != null ? getSoftwareWorksPhoto().hashCode() : 0);
        return result;
    }

    //项目获取奖项
    private String award;

    //项目软著情况
    private String softwareWorks;

    //项目软著材料
    private String softwareWorksPhoto;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TProject{");
        sb.append("id=").append(id);
        sb.append(", projectName='").append(projectName).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", startDate='").append(startDate).append('\'');
        sb.append(", endDate='").append(endDate).append('\'');
        sb.append(", teacherId='").append(teacherId).append('\'');
        sb.append(", level='").append(level).append('\'');
        sb.append(", award='").append(award).append('\'');
        sb.append(", softwareWorks='").append(softwareWorks).append('\'');
        sb.append(", softwareWorksPhoto='").append(softwareWorksPhoto).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

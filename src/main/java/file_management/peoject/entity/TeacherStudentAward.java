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
 * 教师带领学生获奖表
 * @TableName teacher_student_award
 */
@TableName(value ="teacher_student_award")
@Data
public class TeacherStudentAward implements Serializable {
    /**
     * 唯一标识
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 序列号
     */
    private String sequence;

    /**
     * 学院
     */
    private String college;

    /**
     * 竞赛名称
     */
    private String competitionName;

    /**
     * 参赛作品名称
     */
    private String entryName;

    /**
     * 指导老师
     */
    private String supervisor;

    /**
     * 联系电话
     */
    private String contactNumber;

    /**
     * 荣誉级别
     */
    private String level;

    /**
     * 荣誉等级
     */
    private String honorLevel;

    /**
     * 主办单位
     */
    private String organizingUnit;

    /**
     * 竞赛类别
     */
    private String competitionCategory;

    /**
     * 获奖时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date awardDate;

    /**
     * 项目负责人
     */
    private String projectLeader;

    /**
     * 学号
     */
    private String studentId;

    /**
     * 负责人电话
     */
    private String leaderContactNumber;

    /**
     * 团队成员
     */
    private String teamMembers;

    /**
     * 备注
     */
    private String remarks;

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
        TeacherStudentAward other = (TeacherStudentAward) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSequence() == null ? other.getSequence() == null : this.getSequence().equals(other.getSequence()))
            && (this.getCollege() == null ? other.getCollege() == null : this.getCollege().equals(other.getCollege()))
            && (this.getCompetitionName() == null ? other.getCompetitionName() == null : this.getCompetitionName().equals(other.getCompetitionName()))
            && (this.getEntryName() == null ? other.getEntryName() == null : this.getEntryName().equals(other.getEntryName()))
            && (this.getSupervisor() == null ? other.getSupervisor() == null : this.getSupervisor().equals(other.getSupervisor()))
            && (this.getContactNumber() == null ? other.getContactNumber() == null : this.getContactNumber().equals(other.getContactNumber()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()))
            && (this.getHonorLevel() == null ? other.getHonorLevel() == null : this.getHonorLevel().equals(other.getHonorLevel()))
            && (this.getOrganizingUnit() == null ? other.getOrganizingUnit() == null : this.getOrganizingUnit().equals(other.getOrganizingUnit()))
            && (this.getCompetitionCategory() == null ? other.getCompetitionCategory() == null : this.getCompetitionCategory().equals(other.getCompetitionCategory()))
            && (this.getAwardDate() == null ? other.getAwardDate() == null : this.getAwardDate().equals(other.getAwardDate()))
            && (this.getProjectLeader() == null ? other.getProjectLeader() == null : this.getProjectLeader().equals(other.getProjectLeader()))
            && (this.getStudentId() == null ? other.getStudentId() == null : this.getStudentId().equals(other.getStudentId()))
            && (this.getLeaderContactNumber() == null ? other.getLeaderContactNumber() == null : this.getLeaderContactNumber().equals(other.getLeaderContactNumber()))
            && (this.getTeamMembers() == null ? other.getTeamMembers() == null : this.getTeamMembers().equals(other.getTeamMembers()))
            && (this.getRemarks() == null ? other.getRemarks() == null : this.getRemarks().equals(other.getRemarks()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSequence() == null) ? 0 : getSequence().hashCode());
        result = prime * result + ((getCollege() == null) ? 0 : getCollege().hashCode());
        result = prime * result + ((getCompetitionName() == null) ? 0 : getCompetitionName().hashCode());
        result = prime * result + ((getEntryName() == null) ? 0 : getEntryName().hashCode());
        result = prime * result + ((getSupervisor() == null) ? 0 : getSupervisor().hashCode());
        result = prime * result + ((getContactNumber() == null) ? 0 : getContactNumber().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        result = prime * result + ((getHonorLevel() == null) ? 0 : getHonorLevel().hashCode());
        result = prime * result + ((getOrganizingUnit() == null) ? 0 : getOrganizingUnit().hashCode());
        result = prime * result + ((getCompetitionCategory() == null) ? 0 : getCompetitionCategory().hashCode());
        result = prime * result + ((getAwardDate() == null) ? 0 : getAwardDate().hashCode());
        result = prime * result + ((getProjectLeader() == null) ? 0 : getProjectLeader().hashCode());
        result = prime * result + ((getStudentId() == null) ? 0 : getStudentId().hashCode());
        result = prime * result + ((getLeaderContactNumber() == null) ? 0 : getLeaderContactNumber().hashCode());
        result = prime * result + ((getTeamMembers() == null) ? 0 : getTeamMembers().hashCode());
        result = prime * result + ((getRemarks() == null) ? 0 : getRemarks().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sequence=").append(sequence);
        sb.append(", college=").append(college);
        sb.append(", competitionName=").append(competitionName);
        sb.append(", entryName=").append(entryName);
        sb.append(", supervisor=").append(supervisor);
        sb.append(", contactNumber=").append(contactNumber);
        sb.append(", level=").append(level);
        sb.append(", honorLevel=").append(honorLevel);
        sb.append(", organizingUnit=").append(organizingUnit);
        sb.append(", competitionCategory=").append(competitionCategory);
        sb.append(", awardDate=").append(awardDate);
        sb.append(", projectLeader=").append(projectLeader);
        sb.append(", studentId=").append(studentId);
        sb.append(", leaderContactNumber=").append(leaderContactNumber);
        sb.append(", teamMembers=").append(teamMembers);
        sb.append(", remarks=").append(remarks);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
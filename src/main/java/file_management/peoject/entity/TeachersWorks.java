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
 * @TableName teachers_works
 */
@TableName(value ="teachers_works")
@Data
public class TeachersWorks implements Serializable {
    /**
     * 作品id
     */
    @TableId(type = IdType.AUTO)
    @NotNull(message = "id不为空")
    private Integer id;

    /**
     * 教师id
     */
    @NotNull(message = "字段不为空")
    private Integer teacherId;

    /**
     * 著作论文名称
     */
    @NotBlank(message = "字段不为空")
    private String workName;

    /**
     * 内容
     */
    private String workContent;

    /**
     * 方向
     */
    private String workDirection;

    /**
     * 附件
     */
    private String workFile;

    /**
     * 状态
     */
    private String workStatus;

    /**
     * 发表时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date publishTime;

    /**
     * 记录时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date recordTime;

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
        TeachersWorks other = (TeachersWorks) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTeacherId() == null ? other.getTeacherId() == null : this.getTeacherId().equals(other.getTeacherId()))
            && (this.getWorkName() == null ? other.getWorkName() == null : this.getWorkName().equals(other.getWorkName()))
            && (this.getWorkContent() == null ? other.getWorkContent() == null : this.getWorkContent().equals(other.getWorkContent()))
            && (this.getWorkDirection() == null ? other.getWorkDirection() == null : this.getWorkDirection().equals(other.getWorkDirection()))
            && (this.getWorkFile() == null ? other.getWorkFile() == null : this.getWorkFile().equals(other.getWorkFile()))
            && (this.getWorkStatus() == null ? other.getWorkStatus() == null : this.getWorkStatus().equals(other.getWorkStatus()))
            && (this.getPublishTime() == null ? other.getPublishTime() == null : this.getPublishTime().equals(other.getPublishTime()))
            && (this.getRecordTime() == null ? other.getRecordTime() == null : this.getRecordTime().equals(other.getRecordTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTeacherId() == null) ? 0 : getTeacherId().hashCode());
        result = prime * result + ((getWorkName() == null) ? 0 : getWorkName().hashCode());
        result = prime * result + ((getWorkContent() == null) ? 0 : getWorkContent().hashCode());
        result = prime * result + ((getWorkDirection() == null) ? 0 : getWorkDirection().hashCode());
        result = prime * result + ((getWorkFile() == null) ? 0 : getWorkFile().hashCode());
        result = prime * result + ((getWorkStatus() == null) ? 0 : getWorkStatus().hashCode());
        result = prime * result + ((getPublishTime() == null) ? 0 : getPublishTime().hashCode());
        result = prime * result + ((getRecordTime() == null) ? 0 : getRecordTime().hashCode());
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
        sb.append(", workName=").append(workName);
        sb.append(", workContent=").append(workContent);
        sb.append(", workDirection=").append(workDirection);
        sb.append(", workFile=").append(workFile);
        sb.append(", workStatus=").append(workStatus);
        sb.append(", publishTime=").append(publishTime);
        sb.append(", recordTime=").append(recordTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
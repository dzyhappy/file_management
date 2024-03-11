package file_management.peoject.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 培养措施路径存储
 * @TableName profess_measures
 */
@TableName(value ="profess_measures")
@Data
public class ProfessMeasures implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 教师姓名
     */
    @NotBlank(message = "字段不为空")
    private String name;

    /**
     * 教师的工号
     */

    private Integer teacherId;

    /**
     * 文档id
     */
    @NotNull(message = "字段不为空")
    private Integer fileId;

    /**
     * 文档
     */
    private String fileLocation;

    /**
     * 优点的内容
     */
    private String adContent;

    /**
     * 缺点的内容
     */
    private String uadContent;

    /**
     * 
     */
    @NotBlank(message = "字段不为空")
    private String createTime;

    /**
     * 
     */
    private String updateTime;

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
        ProfessMeasures other = (ProfessMeasures) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getTeacherId() == null ? other.getTeacherId() == null : this.getTeacherId().equals(other.getTeacherId()))
            && (this.getFileId() == null ? other.getFileId() == null : this.getFileId().equals(other.getFileId()))
            && (this.getFileLocation() == null ? other.getFileLocation() == null : this.getFileLocation().equals(other.getFileLocation()))
            && (this.getAdContent() == null ? other.getAdContent() == null : this.getAdContent().equals(other.getAdContent()))
            && (this.getUadContent() == null ? other.getUadContent() == null : this.getUadContent().equals(other.getUadContent()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getTeacherId() == null) ? 0 : getTeacherId().hashCode());
        result = prime * result + ((getFileId() == null) ? 0 : getFileId().hashCode());
        result = prime * result + ((getFileLocation() == null) ? 0 : getFileLocation().hashCode());
        result = prime * result + ((getAdContent() == null) ? 0 : getAdContent().hashCode());
        result = prime * result + ((getUadContent() == null) ? 0 : getUadContent().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", teacherId=").append(teacherId);
        sb.append(", fileId=").append(fileId);
        sb.append(", fileLocation=").append(fileLocation);
        sb.append(", adContent=").append(adContent);
        sb.append(", uadContent=").append(uadContent);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
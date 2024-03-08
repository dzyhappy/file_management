package file_management.peoject.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName documents
 */
@TableName(value ="documents")
@Data
public class Documents implements Serializable {
    /**
     * 档案id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 档案名称
     */
    private String name;

    /**
     * 档案类型id，使用去掉JX的纯数字代码
     */
    private Integer typeId;

    /**
     * 存储路径
     */
    private String fileLocation;

    /**
     * 档案概述及备注
     */
    private String overview;

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
        Documents other = (Documents) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getTypeId() == null ? other.getTypeId() == null : this.getTypeId().equals(other.getTypeId()))
            && (this.getFileLocation() == null ? other.getFileLocation() == null : this.getFileLocation().equals(other.getFileLocation()))
            && (this.getOverview() == null ? other.getOverview() == null : this.getOverview().equals(other.getOverview()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getTypeId() == null) ? 0 : getTypeId().hashCode());
        result = prime * result + ((getFileLocation() == null) ? 0 : getFileLocation().hashCode());
        result = prime * result + ((getOverview() == null) ? 0 : getOverview().hashCode());
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
        sb.append(", typeId=").append(typeId);
        sb.append(", fileLocation=").append(fileLocation);
        sb.append(", overview=").append(overview);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
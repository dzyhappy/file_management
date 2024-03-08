package file_management.peoject.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName type_details
 */
@TableName(value ="type_details")
@Data
public class TypeDetails implements Serializable {
    /**
     * 类型id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 档案类型id，关联档案类型
     */
    private Integer typeId;

    /**
     * 类型名称
     */
    private String typeName;

    /**
     * 保管期限
     */
    private Integer storageAge;

    /**
     * 所属一级大类
     */
    private String largeCategories;

    /**
     * 类型描述与备注
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
        TypeDetails other = (TypeDetails) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTypeId() == null ? other.getTypeId() == null : this.getTypeId().equals(other.getTypeId()))
            && (this.getTypeName() == null ? other.getTypeName() == null : this.getTypeName().equals(other.getTypeName()))
            && (this.getStorageAge() == null ? other.getStorageAge() == null : this.getStorageAge().equals(other.getStorageAge()))
            && (this.getLargeCategories() == null ? other.getLargeCategories() == null : this.getLargeCategories().equals(other.getLargeCategories()))
            && (this.getOverview() == null ? other.getOverview() == null : this.getOverview().equals(other.getOverview()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTypeId() == null) ? 0 : getTypeId().hashCode());
        result = prime * result + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        result = prime * result + ((getStorageAge() == null) ? 0 : getStorageAge().hashCode());
        result = prime * result + ((getLargeCategories() == null) ? 0 : getLargeCategories().hashCode());
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
        sb.append(", typeId=").append(typeId);
        sb.append(", typeName=").append(typeName);
        sb.append(", storageAge=").append(storageAge);
        sb.append(", largeCategories=").append(largeCategories);
        sb.append(", overview=").append(overview);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
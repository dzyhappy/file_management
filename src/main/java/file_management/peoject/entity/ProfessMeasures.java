package file_management.peoject.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@TableName("profess_measures")
public class ProfessMeasures {
    /**
     * 优点内容
     */
    private String adContent;
    /**
     * 创建的时间
     */
    private String createTime;
    /**
     * 文档的id
     */
    private Integer fileId;
    /**
     * 文档的存储地址
     */
    private String fileLocation;
    /**
     * 文档ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 教师姓名
     */
    private String name;
    /**
     * 外键用来连接教师的
     */
    private Integer teacherId;
    /**
     * 缺点内容
     */
    private String uadContent;
    /**
     * 更新的时间
     */
    private String updateTime;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ProfessMeasures{");
        sb.append("adContent='").append(adContent).append('\'');
        sb.append(", createTime='").append(createTime).append('\'');
        sb.append(", fileId=").append(fileId);
        sb.append(", fileLocation='").append(fileLocation).append('\'');
        sb.append(", id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", teacherId=").append(teacherId);
        sb.append(", uadContent='").append(uadContent).append('\'');
        sb.append(", updateTime='").append(updateTime).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProfessMeasures that = (ProfessMeasures) o;

        if (getFileId() != that.getFileId()) return false;
        if (getId() != that.getId()) return false;
        if (getTeacherId() != that.getTeacherId()) return false;
        if (getAdContent() != null ? !getAdContent().equals(that.getAdContent()) : that.getAdContent() != null)
            return false;
        if (getCreateTime() != null ? !getCreateTime().equals(that.getCreateTime()) : that.getCreateTime() != null)
            return false;
        if (getFileLocation() != null ? !getFileLocation().equals(that.getFileLocation()) : that.getFileLocation() != null)
            return false;
        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) return false;
        if (getUadContent() != null ? !getUadContent().equals(that.getUadContent()) : that.getUadContent() != null)
            return false;
        return getUpdateTime() != null ? getUpdateTime().equals(that.getUpdateTime()) : that.getUpdateTime() == null;
    }

    @Override
    public int hashCode() {
        int result = getAdContent() != null ? getAdContent().hashCode() : 0;
        result = 31 * result + (getCreateTime() != null ? getCreateTime().hashCode() : 0);
        result = 31 * result + (int) (getFileId() ^ (getFileId() >>> 32));
        result = 31 * result + (getFileLocation() != null ? getFileLocation().hashCode() : 0);
        result = 31 * result + (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (int) (getTeacherId() ^ (getTeacherId() >>> 32));
        result = 31 * result + (getUadContent() != null ? getUadContent().hashCode() : 0);
        result = 31 * result + (getUpdateTime() != null ? getUpdateTime().hashCode() : 0);
        return result;
    }

}

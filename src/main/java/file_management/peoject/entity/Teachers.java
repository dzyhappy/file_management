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
 * 
 * @TableName teachers
 */
@TableName(value ="teachers")
@Data
public class Teachers implements Serializable {
    /**
     * 教师id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 教师姓名
     */
    @NotBlank(message = "教师名字不为空")
    private String teacherName;

    /**
     * 性别
     */
    @NotBlank(message = "字段不为空")
    private String gender;

    /**
     * 教师年龄
     */
    @NotBlank(message = "字段不为空")
    private String teacherAge;

    /**
     * 教师职称
     */
    @NotBlank(message = "字段不为空")
    private String title;

    /**
     * 所在部门
     */
    @NotBlank(message = "字段不为空")
    private String department;

    /**
     * 教师邮箱
     */
    @NotBlank(message = "字段不为空")
    private String email;

    /**
     * 教师电话
     */
    @NotBlank(message = "字段不为空")
    private String phone;

    /**
     * 教师id
     */
    @NotNull(message = "id不能为空")
    private Integer teacherId;

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
        Teachers other = (Teachers) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTeacherName() == null ? other.getTeacherName() == null : this.getTeacherName().equals(other.getTeacherName()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getTeacherAge() == null ? other.getTeacherAge() == null : this.getTeacherAge().equals(other.getTeacherAge()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getDepartment() == null ? other.getDepartment() == null : this.getDepartment().equals(other.getDepartment()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getTeacherId() == null ? other.getTeacherId() == null : this.getTeacherId().equals(other.getTeacherId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTeacherName() == null) ? 0 : getTeacherName().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getTeacherAge() == null) ? 0 : getTeacherAge().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getDepartment() == null) ? 0 : getDepartment().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getTeacherId() == null) ? 0 : getTeacherId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", teacherName=").append(teacherName);
        sb.append(", gender=").append(gender);
        sb.append(", teacherAge=").append(teacherAge);
        sb.append(", title=").append(title);
        sb.append(", department=").append(department);
        sb.append(", email=").append(email);
        sb.append(", phone=").append(phone);
        sb.append(", teacherId=").append(teacherId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
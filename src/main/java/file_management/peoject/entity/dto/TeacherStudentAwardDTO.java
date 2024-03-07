package file_management.peoject.entity.dto;


import file_management.peoject.entity.TeacherStudentAward;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class TeacherStudentAwardDTO extends TeacherStudentAward implements Serializable {
    private List<Integer> teacherId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        TeacherStudentAwardDTO that = (TeacherStudentAwardDTO) o;

        return getTeacherId() != null ? getTeacherId().equals(that.getTeacherId()) : that.getTeacherId() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getTeacherId() != null ? getTeacherId().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TeacherStudentAwardDTO{");
        sb.append("teacherId=").append(teacherId);
        sb.append('}');
        return sb.toString();
    }
}

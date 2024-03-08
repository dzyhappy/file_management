package file_management.peoject.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName(value ="tearcher_award")
public class TeacherAward implements Serializable {

	/**
	 * 教师的工号
	 */
	private Integer teacherId;

	/**
	 * 奖项的工号
	 */
	private Integer awardId;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		TeacherAward that = (TeacherAward) o;

		if (getTeacherId() != null ? !getTeacherId().equals(that.getTeacherId()) : that.getTeacherId() != null)
			return false;
		return getAwardId() != null ? getAwardId().equals(that.getAwardId()) : that.getAwardId() == null;
	}

	@Override
	public int hashCode() {
		int result = getTeacherId() != null ? getTeacherId().hashCode() : 0;
		result = 31 * result + (getAwardId() != null ? getAwardId().hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("TeacherAward{");
		sb.append("teacherId=").append(teacherId);
		sb.append(", awardId=").append(awardId);
		sb.append('}');
		return sb.toString();
	}
}

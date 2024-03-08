package file_management.peoject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudenTest {
    private String name;
    private  Integer old;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("StudenTest{");
        sb.append("name='").append(name).append('\'');
        sb.append(", old=").append(old);
        sb.append('}');
        return sb.toString();
    }
}

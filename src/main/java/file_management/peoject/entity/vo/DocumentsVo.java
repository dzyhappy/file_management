package file_management.peoject.entity.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class DocumentsVo {
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
     * 档案概述及备注
     */
    private String overview;

}

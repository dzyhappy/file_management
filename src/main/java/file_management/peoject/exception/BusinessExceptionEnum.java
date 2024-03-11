package file_management.peoject.exception;


/**
 * 异常枚举类
 * */
public enum BusinessExceptionEnum {

    NULL_CHECK("查询数据为空"),
    CONFIRM_ORDER_EXCEPTION("服务器忙，请稍候重试"),
    Write_Failed("写操作失败"),
    Delete_Failed("删除失败"),
    SQL_Failed("您提供的数据导致运行异常")
    ;

    private String desc;

    BusinessExceptionEnum(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "BusinessExceptionEnum{" +
                "desc='" + desc + '\'' +
                "} " + super.toString();
    }
}

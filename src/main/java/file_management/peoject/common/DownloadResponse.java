package file_management.peoject.common;

/*
DownloadResponse 包含了两个属性，分别对应下载成功响应中的字段 file 和 name。用于封装下载成功时返回的数据。

 */
public class DownloadResponse {
    private String file;
    private String name;

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

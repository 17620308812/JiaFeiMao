package jfm.common.pojo;

public class JfmFile {

    /**
     *
     */
    private String fileCode;
    /**
     *
     */
    private String fileName;
    /**
     *
     */
    private String fileOriginalName;
    /**
     *
     */
    private String uploadUser;
    /**
     *
     */
    private int uploadDate;
    /**
     *
     */
    private int uploadTime;
    /**
     *
     */
    private String path;

    /**
     *
     */
    private int size;

    /**
     *
     */
    private String fileType;

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getFileCode() {
        return fileCode;
    }

    public void setFileCode(String fileCode) {
        this.fileCode = fileCode;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileOriginalName() {
        return fileOriginalName;
    }

    public void setFileOriginalName(String fileOriginalName) {
        this.fileOriginalName = fileOriginalName;
    }

    public String getUploadUser() {
        return uploadUser;
    }

    public void setUploadUser(String uploadUser) {
        this.uploadUser = uploadUser;
    }

    public int getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(int uploadDate) {
        this.uploadDate = uploadDate;
    }

    public int getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(int uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}

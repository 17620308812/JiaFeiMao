package jfm.file.server.emum;

import org.apache.commons.lang.StringUtils;

public enum FilePathEnum {

    OTHER("static/other", "0", "其他文件"),

    IMAGE_ORIGIN("static/image", "1", "图片文件"),

    VIDEO_ORIGIN("static/video", "2", "视频文件"),

    ;

    private String path;

    private String fileType;

    private String describe;

    FilePathEnum(String path, String fileType, String describe) {
        this.path = path;
        this.fileType = fileType;
        this.describe = describe;
    }

    public static FilePathEnum getFileType(String fileType) {
        if (StringUtils.isNotEmpty(fileType)) {
            for (FilePathEnum pathEnum : FilePathEnum.values()) {
                if (StringUtils.equals(fileType, pathEnum.getFileType())) {
                    return pathEnum;
                }
            }
        }
        return FilePathEnum.OTHER;
    }

    public String getFileType() {
        return fileType;
    }

    public String getPath() {
        return path;
    }

    public String getDescribe() {
        return describe;
    }
}

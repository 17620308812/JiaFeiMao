package jfm.file.server.emum;

public enum FilePathEnum {

    IMAGE_ORIGIN("static/image","图片文件"),

    VIDEO_ORIGIN("static/video","视频文件"),

    OTHER("static/other","其他文件"),
    ;

    private String path;

    private String describe;

    FilePathEnum(String path, String describe) {
    }

    public String getPath() {
        return path;
    }

    public String getDescribe() {
        return describe;
    }
}

package jfm.live2d.server.pojo;

import java.util.List;

public class ModelHitAreasCustom {

    private List<Float> head_x;

    private List<Float> head_y;

    private List<Float> body_x;

    private List<Float> body_y;

    public List<Float> getHead_x() {
        return head_x;
    }

    public void setHead_x(List<Float> head_x) {
        this.head_x = head_x;
    }

    public List<Float> getHead_y() {
        return head_y;
    }

    public void setHead_y(List<Float> head_y) {
        this.head_y = head_y;
    }

    public List<Float> getBody_x() {
        return body_x;
    }

    public void setBody_x(List<Float> body_x) {
        this.body_x = body_x;
    }

    public List<Float> getBody_y() {
        return body_y;
    }

    public void setBody_y(List<Float> body_y) {
        this.body_y = body_y;
    }
}

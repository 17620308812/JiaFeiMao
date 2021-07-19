package jfm.live2d.server.pojo;


import java.util.List;

public class ModelMotions {

    private List<ModelMotionsIdle> idle;

    private List<ModelMotionsFlickHead> flick_head;

    private List<ModelMotionsTapBody> tap_body;

    public List<ModelMotionsIdle> getIdle() {
        return idle;
    }

    public void setIdle(List<ModelMotionsIdle> idle) {
        this.idle = idle;
    }

    public List<ModelMotionsFlickHead> getFlick_head() {
        return flick_head;
    }

    public void setFlick_head(List<ModelMotionsFlickHead> flick_head) {
        this.flick_head = flick_head;
    }

    public List<ModelMotionsTapBody> getTap_body() {
        return tap_body;
    }

    public void setTap_body(List<ModelMotionsTapBody> tap_body) {
        this.tap_body = tap_body;
    }
}

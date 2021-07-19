

package jfm.live2d.server.pojo;

import java.util.List;

public class Model {
    /**
     *
     */
    private String modelId;
    /**
     *
     */
    private String modelTexturesId;

    /**
     * 版本号
     */
    private String version;
    /**
     * model.moc 文件路径
     */
    private String model;
    /**
     * 多个 贴图路径
     */
    private List<String> textures;
    /**
     * pose路径
     */
    private String pose;
    /**
     * physics路径
     */
    private String physics;
    /**
     *
     */
    private ModelLayout layout;
    /**
     *
     */
    private ModelHitAreasCustom hit_areas_custom;
    /**
     *
     */
    private List<ModelExpressions> expressions;
    /**
     *
     */
    private ModelMotions motions;

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getModelTexturesId() {
        return modelTexturesId;
    }

    public void setModelTexturesId(String modelTexturesId) {
        this.modelTexturesId = modelTexturesId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<String> getTextures() {
        return textures;
    }

    public void setTextures(List<String> textures) {
        this.textures = textures;
    }

    public String getPose() {
        return pose;
    }

    public void setPose(String pose) {
        this.pose = pose;
    }

    public String getPhysics() {
        return physics;
    }

    public void setPhysics(String physics) {
        this.physics = physics;
    }

    public ModelLayout getLayout() {
        return layout;
    }

    public void setLayout(ModelLayout layout) {
        this.layout = layout;
    }

    public ModelHitAreasCustom getHit_areas_custom() {
        return hit_areas_custom;
    }

    public void setHit_areas_custom(ModelHitAreasCustom hit_areas_custom) {
        this.hit_areas_custom = hit_areas_custom;
    }

    public List<ModelExpressions> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<ModelExpressions> expressions) {
        this.expressions = expressions;
    }

    public ModelMotions getMotions() {
        return motions;
    }

    public void setMotions(ModelMotions motions) {
        this.motions = motions;
    }
}

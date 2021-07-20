
package jfm.live2d.server.utils;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import jfm.live2d.server.pojo.*;
import org.apache.commons.lang.StringUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GetModelData5_7 {

    public static void main(String[] args) throws IOException {
        // 5:1-3,7:1-2
        for (int i = 1; i < 3; i++) {
            System.err.println("请求：" + "https://api3.fghrsh.net/live2d/get/?id=5-" + i);
            String str = GetHttpData.getHttpInterface("https://api3.fghrsh.net/live2d/get/?id=5-" + i);
            //String str = "{\"name\":\"shizuku_48.512\",\"model\":\"../model/ShizukuTalk/shizuku-48/model.moc\",\"textures\":[\"../model/ShizukuTalk/shizuku-48/textures.512/00.png\",\"../model/ShizukuTalk/shizuku-48/textures.512/01.png\",\"../model/ShizukuTalk/shizuku-48/textures.512/02.png\",\"../model/ShizukuTalk/shizuku-48/textures.512/03.png\",\"../model/ShizukuTalk/shizuku-48/textures.512/04.png\",\"../model/ShizukuTalk/shizuku-48/textures.512/05.png\",\"../model/ShizukuTalk/shizuku-48/textures.512/06.png\",\"../model/ShizukuTalk/shizuku-48/textures.512/07.png\"],\"physics\":\"../model/ShizukuTalk/shizuku-48/physics.json\",\"pose\":\"../model/ShizukuTalk/shizuku-48/pose.json\",\"expressions\":[{\"name\":\"f01\",\"file\":\"../model/ShizukuTalk/shizuku-48/expressions/f01.exp.json\"},{\"name\":\"f02\",\"file\":\"../model/ShizukuTalk/shizuku-48/expressions/f02.exp.json\"},{\"name\":\"f03\",\"file\":\"../model/ShizukuTalk/shizuku-48/expressions/f03.exp.json\"},{\"name\":\"f04\",\"file\":\"../model/ShizukuTalk/shizuku-48/expressions/f04.exp.json\"}],\"layout\":{\"center_x\":0,\"center_y\":-0.16,\"width\":1.8},\"hit_areas_custom\":{\"head_x\":[-0.35,0.6],\"head_y\":[0.19,-0.2],\"body_x\":[-0.3,-0.25],\"body_y\":[0.3,-0.9]},\"motions\":{\"idle\":[{\"file\":\"../model/ShizukuTalk/shizuku-48/motions/idl_00.mtn\"},{\"file\":\"../model/ShizukuTalk/shizuku-48/motions/idl_01.mtn\"},{\"file\":\"../model/ShizukuTalk/shizuku-48/motions/idl_02.mtn\"},{\"file\":\"../model/ShizukuTalk/shizuku-48/motions/idl_03.mtn\"},{\"file\":\"../model/ShizukuTalk/shizuku-48/motions/idl_04.mtn\"},{\"file\":\"../model/ShizukuTalk/shizuku-48/motions/idl_05.mtn\"},{\"file\":\"../model/ShizukuTalk/shizuku-48/motions/idle_01.mtn\"},{\"file\":\"../model/ShizukuTalk/shizuku-48/motions/idle_02.mtn\"},{\"file\":\"../model/ShizukuTalk/shizuku-48/motions/idle_03.mtn\"},{\"file\":\"../model/ShizukuTalk/shizuku-48/motions/idle_04.mtn\"},{\"file\":\"../model/ShizukuTalk/shizuku-48/motions/idle_05.mtn\"},{\"file\":\"../model/ShizukuTalk/shizuku-48/motions/idle_06.mtn\"},{\"file\":\"../model/ShizukuTalk/shizuku-48/motions/idle_07.mtn\"},{\"file\":\"../model/ShizukuTalk/shizuku-48/motions/idle_08.mtn\"},{\"file\":\"../model/ShizukuTalk/shizuku-48/motions/idle_09.mtn\"},{\"file\":\"../model/ShizukuTalk/shizuku-48/motions/idle_A.mtn\"},{\"file\":\"../model/ShizukuTalk/shizuku-48/motions/idle_A2.mtn\"},{\"file\":\"../model/ShizukuTalk/shizuku-48/motions/idle_B.mtn\"},{\"file\":\"../model/ShizukuTalk/shizuku-48/motions/idle_B2.mtn\"},{\"file\":\"../model/ShizukuTalk/shizuku-48/motions/idle_C.mtn\"},{\"file\":\"../model/ShizukuTalk/shizuku-48/motions/idle_C2.mtn\"},{\"file\":\"../model/ShizukuTalk/shizuku-48/motions/idle_C2_copy.mtn\"},{\"file\":\"../model/ShizukuTalk/shizuku-48/motions/kurakura1.mtn\"},{\"file\":\"../model/ShizukuTalk/shizuku-48/motions/kurakura2.mtn\"},{\"file\":\"../model/ShizukuTalk/shizuku-48/motions/kurakura3.mtn\"},{\"file\":\"../model/ShizukuTalk/shizuku-48/motions/wait_01.mtn\"},{\"file\":\"../model/ShizukuTalk/shizuku-48/motions/wait_02.mtn\"},{\"file\":\"../model/ShizukuTalk/shizuku-48/motions/wait_03.mtn\"},{\"file\":\"../model/ShizukuTalk/shizuku-48/motions/wait_04.mtn\"},{\"file\":\"../model/ShizukuTalk/shizuku-48/motions/wait_05.mtn\"}],\"flick_head\":[{\"file\":\"../model/ShizukuTalk/shizuku-48/motions/double_tap1.mtn\"},{\"file\":\"../model/ShizukuTalk/shizuku-48/motions/double_tap2.mtn\"},{\"file\":\"../model/ShizukuTalk/shizuku-48/motions/double_tap3.mtn\"},{\"file\":\"../model/ShizukuTalk/shizuku-48/motions/double_tap4.mtn\"}],\"tap_body\":[{\"file\":\"../model/ShizukuTalk/shizuku-48/motions/touch1.mtn\"},{\"file\":\"../model/ShizukuTalk/shizuku-48/motions/touch2.mtn\"},{\"file\":\"../model/ShizukuTalk/shizuku-48/motions/touch3.mtn\"},{\"file\":\"../model/ShizukuTalk/shizuku-48/motions/touch4.mtn\"}]}}\n";
            Model model = JSONObject.parseObject(str, Model.class);
            model.setModelId("5");
            model.setModelTexturesId(i + "");
            String[] split = model.getModel().split("/");
            String basePath = "C:\\Users\\lsh18\\Desktop\\create\\" + split[split.length - 3] + "\\" + split[split.length - 2];
            File file = new File(basePath);
            if (!file.exists()) {
                file.mkdirs();
            }
            model(basePath, str, model);
            exp(basePath, str, model);
            moc(basePath, str, model);
            mtn(basePath, str, model);
            textures(basePath, str, model);
        }

    }

    public static void model(String basePath, String str, Model model) throws IOException {
        File a1 = new File(basePath + "\\model");
        if (!a1.exists()) {
            a1.mkdirs();
        }
        String a = model.getModel().replace("../model", "/static").replace("/model.moc", "/moc/model.moc");
        Model mc = JSONObject.parseObject(str, Model.class);
        mc.setModel(a);
//=====================
        List<String> textures = model.getTextures();
        List<String> list = new ArrayList<>();
        for (String s : textures) {
            String replace = s.replace("../model", "/static");
            String[] split = replace.split("/");
            split[split.length - 2] = "textures";
            list.add(StringUtils.join(split, "/"));
        }
        mc.setTextures(list);
//=====================
        List<ModelExpressions> expressions = model.getExpressions();
        if (expressions != null) {
            List<ModelExpressions> act = new ArrayList<>();
            for (ModelExpressions m : expressions) {
                String c = model.getModel().replace("../model", "/static").replace("/model.moc", "/exp/" + m.getName() + ".json");
                ModelExpressions modelExpressions = new ModelExpressions();
                modelExpressions.setName(m.getName());
                modelExpressions.setFile(c);
                act.add(modelExpressions);
            }
            mc.setExpressions(act);
        }
//=====================
        List<ModelMotionsIdle> idle = model.getMotions().getIdle();
        List<ModelMotionsIdle> b = new ArrayList<>();
        for (ModelMotionsIdle m : idle) {
            String[] split = m.getFile().split("/");
            String s = split[split.length - 1];
            String c = model.getModel().replace("../model", "/static").replace("/model.moc", "/mtn/" + s);
            ModelMotionsIdle modelMotionsIdle = new ModelMotionsIdle();
            modelMotionsIdle.setFade_in(m.getFade_in());
            modelMotionsIdle.setFade_out(m.getFade_out());
            modelMotionsIdle.setFile(c);
            b.add(modelMotionsIdle);
        }
        mc.getMotions().setIdle(b);
        //=====================
        List<ModelMotionsFlickHead> flick_head = model.getMotions().getFlick_head();
        List<ModelMotionsFlickHead> b1 = new ArrayList<>();
        for (ModelMotionsFlickHead m : flick_head) {
            String[] split = m.getFile().split("/");
            String s = split[split.length - 1];
            String c = model.getModel().replace("../model", "/static").replace("/model.moc", "/mtn/" + s);
            ModelMotionsFlickHead modelMotionsIdle = new ModelMotionsFlickHead();
            modelMotionsIdle.setFile(c);
            b1.add(modelMotionsIdle);
        }
        mc.getMotions().setFlick_head(b1);
        //=====================
        List<ModelMotionsTapBody> tap_body = model.getMotions().getTap_body();
        List<ModelMotionsTapBody> b2 = new ArrayList<>();
        for (ModelMotionsTapBody m : tap_body) {
            String[] split = m.getFile().split("/");
            String s = split[split.length - 1];
            String c = model.getModel().replace("../model", "/static").replace("/model.moc", "/mtn/" + s);
            ModelMotionsTapBody modelMotionsIdle = new ModelMotionsTapBody();
            modelMotionsIdle.setDialogue(m.getDialogue());
            modelMotionsIdle.setSound(m.getSound());
            modelMotionsIdle.setFile(c);
            b2.add(modelMotionsIdle);
        }
        mc.getMotions().setTap_body(b2);
        //=====================
        mc.setModelTexturesId(model.getModelTexturesId());
        mc.setModelId(model.getModelId());
        //=====================
        File a11 = new File(basePath + "\\model\\model.json");
        BufferedWriter bw = new BufferedWriter(new FileWriter(a11));
        bw.write(JSON.toJSONString(mc));//在创建好的文件中写入"Hello I/O"
        bw.close();//一定要关闭文件
    }

    public static void exp(String basePath, String str, Model model) throws IOException {
        File a1 = new File(basePath + "\\exp");
        if (!a1.exists()) {
            a1.mkdirs();
        }
        List<ModelExpressions> expressions = model.getExpressions();
        if (expressions != null) {
            String[] split = model.getModel().split("/");
            for (ModelExpressions m : expressions) {
                String replace = m.getFile().replace("../model", "https://api3.fghrsh.net/live2d/model");
                String s = GetHttpData.getHttpInterface(replace);
                File a12 = new File(basePath + "\\exp\\" + m.getName() + ".json");
                BufferedWriter bw1 = new BufferedWriter(new FileWriter(a12));
                bw1.write(s);//在创建好的文件中写入"Hello I/O"
                bw1.close();//一定要关闭文件
            }
        }
    }
    public static void moc(String basePath, String str, Model model) throws IOException {
        File a1 = new File(basePath + "\\moc");
        if (!a1.exists()) {
            a1.mkdirs();
        }
        String replace = model.getModel().replace("../model", "https://api3.fghrsh.net/live2d/model");
        GetHttpData.saveFileToHttp(replace, basePath + "\\moc\\" + "model.moc");
    }

    public static void mtn(String basePath, String str, Model model) throws IOException {
        File a1 = new File(basePath + "\\mtn");
        if (!a1.exists()) {
            a1.mkdirs();
        }
        List<ModelMotionsIdle> idle = model.getMotions().getIdle();
        for (ModelMotionsIdle m : idle) {
            String urlPath = m.getFile().replace("../model", "https://api3.fghrsh.net/live2d/model");
            String[] split2 = m.getFile().split("/");
            GetHttpData.saveFileToHttp(urlPath, basePath + "\\mtn\\" + split2[split2.length - 1]);
        }

        List<ModelMotionsFlickHead> flick_head = model.getMotions().getFlick_head();
        for (ModelMotionsFlickHead m : flick_head) {
            String urlPath = m.getFile().replace("../model", "https://api3.fghrsh.net/live2d/model");
            String[] split2 = m.getFile().split("/");
            GetHttpData.saveFileToHttp(urlPath, basePath + "\\mtn\\" + split2[split2.length - 1]);
        }

        List<ModelMotionsTapBody> tap_body = model.getMotions().getTap_body();
        for (ModelMotionsTapBody m : tap_body) {
            String urlPath = m.getFile().replace("../model", "https://api3.fghrsh.net/live2d/model");
            String[] split2 = m.getFile().split("/");
            GetHttpData.saveFileToHttp(urlPath, basePath + "\\mtn\\" + split2[split2.length - 1]);
        }
    }

    public static void textures(String basePath, String str, Model model) throws IOException {
        File a1 = new File(basePath + "\\textures");
        if (!a1.exists()) {
            a1.mkdirs();
        }
        List<String> textures = model.getTextures();
        for (String s : textures) {
            String replace = s.replace("../model", "https://api3.fghrsh.net/live2d/model");
            String[] split = s.split("/");
            GetHttpData.saveFileToHttp(replace, basePath + "\\textures\\" + split[split.length - 1]);
        }
    }
}

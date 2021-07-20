package jfm.live2d.server.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import jfm.live2d.server.pojo.Model;
import jfm.live2d.server.pojo.ModelExpressions;
import jfm.live2d.server.pojo.ModelMotionsIdle;
import org.apache.commons.lang.StringUtils;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class GetModelData6 {

    public static void main(String[] args) throws IOException {
        //6:1-21
        for (int i = 1; i < 3; i++) {
            System.err.println("请求：" + "https://api3.fghrsh.net/live2d/get/?id=6-" + i);
            String str = GetHttpData.getHttpInterface("https://api3.fghrsh.net/live2d/get/?id=6-" + i);
            Model model = JSONObject.parseObject(str, Model.class);
            model.setModelId("6");
            model.setModelTexturesId(i + "");
            String[] split = model.getModel().split("/");
            String basePath = "C:\\Users\\admin\\Desktop\\create\\" + split[split.length - 3] + "\\" + split[split.length - 2];
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
                String[] split1 = m.getFile().split("/../../");
                String s = GetHttpData.getHttpInterface("https://api3.fghrsh.net/live2d/model/" + split[split.length - 3] + "/" + split1[1]);
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
        String[] split = model.getModel().split("/");
        for (ModelMotionsIdle m : idle) {
            String[] split1 = m.getFile().split("/../../");
            String urlPath = "https://api3.fghrsh.net/live2d/model/" + split[split.length - 3] + "/" + split1[1];
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

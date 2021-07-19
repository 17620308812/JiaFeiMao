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
        for (int i = 1; i < 21; i++) {
            System.err.println("请求：" + "https://api3.fghrsh.net/live2d/get/?id=6-" + i);
            String str = getHttpInterface("https://api3.fghrsh.net/live2d/get/?id=6-" + i);
            Model model = JSONObject.parseObject(str, Model.class);
            model.setModelId("6");
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

    // 调用http接口获取数据
    public static String getHttpInterface(String path) {
        BufferedReader in = null;
        StringBuffer result = null;
        try {
            URL url = new URL(path);
            //打开和url之间的连接
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setRequestProperty("Charset", "utf-8");
            connection.connect();

            result = new StringBuffer();
            //读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result.append(line);
            }
            return result.toString();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    /**
     * 通过流下载文件
     */
    public static void saveFileToHttp(String urlPath, String fileNamePath) {
        try {
            URL url = new URL(urlPath);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            DataInputStream in = new DataInputStream(connection.getInputStream());
            DataOutputStream out = new DataOutputStream(new FileOutputStream(fileNamePath));
            byte[] buffer = new byte[4096];
            int count = 0;
            while ((count = in.read(buffer)) > 0) {
                out.write(buffer, 0, count);
            }
            out.close();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
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
                String s = getHttpInterface("https://api3.fghrsh.net/live2d/model/" + split[split.length - 3] + "/" + split1[1]);
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
        saveFileToHttp(replace, basePath + "\\moc\\" + "model.moc");
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
            saveFileToHttp(urlPath, basePath + "\\mtn\\" + split2[split2.length - 1]);
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
            saveFileToHttp(replace, basePath + "\\textures\\" + split[split.length - 1]);
        }
    }


}

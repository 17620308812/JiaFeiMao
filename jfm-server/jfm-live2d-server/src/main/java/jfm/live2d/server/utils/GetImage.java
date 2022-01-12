

package jfm.live2d.server.utils;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.sun.xml.internal.bind.v2.runtime.XMLSerializer;
import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.HttpClientUtils;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class GetImage {


    public static void main(String[] args) {
        List<String> urls = new ArrayList<>();
        List<String> names = new ArrayList<>();
        List<String> smalls = new ArrayList<>();
        for (int i = 1; i < 2; i++) {
            String html = getHtml("https://wallhaven.cc/latest?page=" + i);
            System.err.println(html);
            //(?<=data-wallpaper-id=\")(.*?)(?=")
            String regStr = "<figure+.*?>(.*?)</figure>";
            Pattern pattern = Pattern.compile(regStr);
            Matcher matcher = pattern.matcher(html);
            while (matcher.find()) {
                String group = matcher.group();
                //System.out.println(group);
                Matcher m = Pattern.compile("<img+.*?>").matcher(group);
                if (m.find()) {
                    String group2 = m.group();
                    Matcher m1 = Pattern.compile("(?<=data-src=\\\")(.*?)(?=\")").matcher(group2);
                    if (m1.find()) {
                        String group1 = m1.group();
                        smalls.add(group1);
                        String small = group1.substring(group1.indexOf("small") + 5);
                        String[] split = small.split("/");
                        names.add(split[split.length - 1]);
                        if (group.contains("<span>PNG</span>")) {
                            String a = split[split.length - 1].substring(0, split[split.length - 1].lastIndexOf(".")) + ".png";
                            split[split.length - 1] = "wallhaven-" + a;
                        } else {
                            split[split.length - 1] = "wallhaven-" + split[split.length - 1];
                        }
                        urls.add("https://w.wallhaven.cc/full" + StringUtils.join(split, "/"));
                    }
                }
            }
        }

        for (int i = 0; i < urls.size(); i++) {
            saveFile(urls.get(i), "C:\\Users\\admin\\Desktop\\six\\image\\" + names.get(i));
            saveFile(smalls.get(i), "C:\\Users\\admin\\Desktop\\six\\small\\" + names.get(i));
        }
    }


    static String getHtml(String url) {
        //1.生成httpclient，相当于该打开一个浏览器
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        //2.创建get请求，相当于在浏览器地址栏输入 网址
        HttpGet request = new HttpGet(url);
        try {
            //3.执行get请求，相当于在输入地址栏后敲回车键
            response = httpClient.execute(request);

            //4.判断响应状态为200，进行处理
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                //5.获取响应内容
                HttpEntity httpEntity = response.getEntity();
                String html = EntityUtils.toString(httpEntity, "utf-8");
                return html;
            } else {
                //如果返回状态不是200，比如404（页面不存在）等，根据情况做处理，这里略
                System.err.println("返回状态不是200");
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            //6.关闭
            HttpClientUtils.closeQuietly(response);
            HttpClientUtils.closeQuietly(httpClient);
        }
    }

    public static void saveFile(String url, String fileNamePath) {
        try {
            //1.生成httpclient，相当于该打开一个浏览器
            CloseableHttpClient httpClient = HttpClients.createDefault();
            CloseableHttpResponse response = null;
            //2.创建get请求，相当于在浏览器地址栏输入 网址
            HttpGet request = new HttpGet(url);
            //3.执行get请求，相当于在输入地址栏后敲回车键
            response = httpClient.execute(request);

            //4.判断响应状态为200，进行处理
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                //5.获取响应内容
                HttpEntity httpEntity = response.getEntity();
                InputStream content = httpEntity.getContent();

                DataInputStream in = new DataInputStream(content);
                DataOutputStream out = new DataOutputStream(new FileOutputStream(fileNamePath));
                byte[] buffer = new byte[4096];
                int count = 0;
                while ((count = in.read(buffer)) > 0) {
                    out.write(buffer, 0, count);
                }
                out.close();
                in.close();
            } else {
                //如果返回状态不是200，比如404（页面不存在）等，根据情况做处理，这里略
                System.err.println("返回状态不是200");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}

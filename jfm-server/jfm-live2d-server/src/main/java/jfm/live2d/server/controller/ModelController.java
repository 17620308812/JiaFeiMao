package jfm.live2d.server.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import io.micrometer.core.instrument.util.IOUtils;
import jfm.live2d.server.pojo.Model;
import jfm.live2d.server.pojo.ModelExpressions;
import jfm.live2d.server.pojo.ModelMotions;
import jfm.live2d.server.pojo.ModelMotionsIdle;
import jfm.live2d.server.utils.ConstUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

@RestController
@RequestMapping("/model")
public class ModelController {


    @PostConstruct
    public void init() {
        ConstUtils.MODEL.clear();
        try {
            Resource[] resources = new PathMatchingResourcePatternResolver().getResources("static/**/model/model.json");
            System.err.println(resources.length);
            for (int i = 0; i < resources.length; i++) {
                InputStream inputStream = resources[i].getInputStream();
                String s = IOUtils.toString(inputStream);
                Model model = JSONObject.parseObject(s, Model.class);
                ConstUtils.MODEL.put(model.getModelId() + "-" + model.getModelTexturesId(), model);
                inputStream.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @GetMapping("/get/{modelId}/{modelTexturesId}")
    public Object getModelById(@PathVariable("modelId") String modelId, @PathVariable String modelTexturesId) {
        return ConstUtils.MODEL.get(modelId + "-" + modelTexturesId);
    }

    /**
     * 获取modelId
     */
    @GetMapping("/modelId")
    public String getModelId() {

        Set<String> strings = ConstUtils.MODEL.keySet();
        Set<String> result = new HashSet<>();
        for (String s : strings) {
            result.add(s.substring(0, s.indexOf("-")));
        }
        ArrayList<String> list = new ArrayList<>(result);
        return list.get(new Random().nextInt(list.size()));
    }

    /**
     * 获取modelId
     */
    @GetMapping("/modelTexturesId")
    public String getModelId(@RequestParam String modelId) {
        Set<String> strings = ConstUtils.MODEL.keySet();
        Set<String> result = new HashSet<>();
        for (String s : strings) {
            if (StringUtils.startsWith(s, modelId + "-")) {
                result.add(s.substring(s.indexOf("-") + 1));
            }
        }
        ArrayList<String> list = new ArrayList<>(result);
        return list.get(new Random().nextInt(list.size()));
    }


}

package jfm.file.server.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import jfm.file.server.emum.FilePathEnum;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import javax.annotation.PostConstruct;
import java.io.File;
import java.util.List;

@Configuration
public class FileConfig extends WebMvcConfigurationSupport {

    @PostConstruct
    private void createDir(){
        FilePathEnum[] values = FilePathEnum.values();
        for (FilePathEnum en:values){
            File file = new File(en.getPath());
            if(!file.exists()){
                file.mkdirs();
            }
        }
    }


    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        //1、定义一个convert转换消息的对象
        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
        //2、添加fastjson的配置信息
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
        //3、在convert中添加配置信息
        fastConverter.setFastJsonConfig(fastJsonConfig);
        //4、将convert添加到converters中
        converters.add(fastConverter);
        //5、追加默认转换器
        super.addDefaultHttpMessageConverters(converters);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        String aStatic = new File("static").getAbsolutePath()+"/";
        registry.addResourceHandler("/static/**").addResourceLocations("file:///"+aStatic);
        super.addResourceHandlers(registry);
    }
}

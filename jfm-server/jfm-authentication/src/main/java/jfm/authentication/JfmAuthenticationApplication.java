package jfm.authentication;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.stereotype.Repository;

@SpringBootApplication(scanBasePackages = {"jfm.authentication","jfm.common.config"})
@EnableEurekaClient
@MapperScan(basePackages = {"jfm.authentication.repository"}, annotationClass = Repository.class)
public class JfmAuthenticationApplication {
    public static void main(String[] args) {
        SpringApplication.run(JfmAuthenticationApplication.class, args);
    }
}

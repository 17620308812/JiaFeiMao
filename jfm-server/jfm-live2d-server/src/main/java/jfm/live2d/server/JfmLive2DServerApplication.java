package jfm.live2d.server;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = {"jfm.live2d.server"})
@EnableDiscoveryClient
public class JfmLive2DServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(JfmLive2DServerApplication.class, args);
    }
}

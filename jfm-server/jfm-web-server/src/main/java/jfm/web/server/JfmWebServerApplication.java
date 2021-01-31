package jfm.web.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class JfmWebServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(JfmWebServerApplication.class, args);
    }
}

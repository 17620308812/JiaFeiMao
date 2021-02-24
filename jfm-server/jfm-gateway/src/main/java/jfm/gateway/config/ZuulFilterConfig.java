package jfm.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ZuulFilterConfig {

    @Bean
    public JfmZuulFilter setJfmZuulFilter(){
        return new JfmZuulFilter();
    }
}

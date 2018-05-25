package tech.winson.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 服务提供者
 */
@SpringBootApplication
@EnableEurekaClient
public class ProviderStart extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(ProviderStart.class, args);
    }

}

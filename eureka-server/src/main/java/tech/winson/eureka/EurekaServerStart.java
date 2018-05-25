package tech.winson.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka服务注册中心
 */
@SpringBootApplication
@EnableEurekaServer //注解启动一个服务注册中心
public class EurekaServerStart extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerStart.class, args);
    }
}

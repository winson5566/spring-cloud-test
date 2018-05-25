package tech.winson.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 服务消费者
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ConsumerStart extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerStart.class, args);
    }

}

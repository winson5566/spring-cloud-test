package tech.winson.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 服务消费者Feign+Ribbon
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ConsumerStart extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerStart.class, args);
    }

    /**
     * Ribbon需要加载的负载均衡模板
     * @return
     */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}

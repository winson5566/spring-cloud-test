package tech.winson.eureka.service;

import org.springframework.stereotype.Service;

/**
 * Feign自带的断路器
 */
@Service
public class HelloFeignServiceHystric implements HelloFeignService {
    @Override
    public String hello(String name) {
        return "sorry "+name;
    }
}

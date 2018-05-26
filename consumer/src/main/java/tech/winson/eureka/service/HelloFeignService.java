package tech.winson.eureka.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Feign断路器HelloFeignServiceHystric
 */
@FeignClient(value = "provider",fallback = HelloFeignServiceHystric.class)
public interface HelloFeignService {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String hello(@RequestParam(value = "name") String name);
}

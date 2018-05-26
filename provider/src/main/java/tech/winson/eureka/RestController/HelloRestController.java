package tech.winson.eureka.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试用服务提供者
 * 整合Hystrix实现服务Ribbon的熔断机制
 */
@RestController
public class HelloRestController {
    @Value("${server.port}")
    String port;

    @RequestMapping("/hello")
//    @HystrixCommand(fallbackMethod = "helloError")
    public String home(@RequestParam String name) {
        return "hello "+name+",I am from port:" +port;
    }

    public String helloError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}

package tech.winson.eureka.RestController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试用服务提供者
 */
@RestController
public class HelloRestController {
    @Value("${server.port}")
    String port;

    @RequestMapping("/hello")
    public String home(@RequestParam String name) {
        return "hello "+name+",I am from port:" +port;
    }
}

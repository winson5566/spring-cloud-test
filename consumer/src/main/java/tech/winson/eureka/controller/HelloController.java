package tech.winson.eureka.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tech.winson.eureka.Feign.HelloService;

/**
 * 消费者测试接口
 */
@Controller
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(String name) {
        return helloService.hello(name);
    }
}

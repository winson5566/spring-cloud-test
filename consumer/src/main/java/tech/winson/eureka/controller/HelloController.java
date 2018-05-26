package tech.winson.eureka.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import tech.winson.eureka.service.HelloFeignService;
import tech.winson.eureka.service.HelloRibbonService;

/**
 * 消费者测试接口
 */
@Controller
public class HelloController {

    @Autowired
    HelloFeignService helloFeignService;

    @Autowired
    HelloRibbonService helloRibbonService;

    @RequestMapping("/helloFeign")
    @ResponseBody
    public String helloFeign(String name) {
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("[Feign]").append(helloFeignService.hello(name));
        return stringBuffer.toString();
    }

    @RequestMapping("/helloRibbon")
    @ResponseBody
    public String helloRibbon(String name) {
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("[Ribbon]").append(helloRibbonService.hello(name));
        return stringBuffer.toString();
    }

}

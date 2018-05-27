package tech.winson.eureka.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Configuration
@RefreshScope
public class CloudConfig {

    static volatile String foo; // 20 sec

    @Value("${foo}")
    public void setCount(String foo) {
        this.foo = foo;
    }

    public static String getFoo() {
        return foo;
    }

}

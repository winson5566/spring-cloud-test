# spring-cloud-test
该项目为了测试整合Spring Cloud各组件的分布式架构

# 项目说明
eureka-server 为注册中心  
provider 为服务提供者  
consumer 为消费者 （Feign+Ribbon）


# 项目启动
## 1.修改每个项目的application.yml
eureka:
  instance:
    hostname: 自己的ip

## 2.启动VM参数
通过启动不同的端口启动多个实例测试负载均衡特性
### 2.1单例启动方式
#### 双注册中心   
-Dspring.profiles.active=dev0  

#### 双服务提供者  
-Dspring.profiles.active=dev0  

#### 消费者  
-Dspring.profiles.active=dev0

### 2.2分布式启动方式
#### 双注册中心   
-Dspring.profiles.active=dev1  
-Dspring.profiles.active=dev2

#### 双服务提供者  
-Dspring.profiles.active=dev1  
-Dspring.profiles.active=dev2

#### 消费者  
-Dspring.profiles.active=dev0

# 系统架构图

# 更新日志
2018.05.25 完成Eureka+Feign+Ribbon整合
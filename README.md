# spring-cloud-test
# 项目架构
eureka-server 为注册中心  
provider 为服务提供者  
consumer 为消费者 

## consumer
整合Feign和Ribbon两种负载均衡模式 




# 项目启动说明
## 1.修改每个项目的application.yml
eureka:
  instance:
    hostname: 自己的ip

## 2.启动VM参数
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
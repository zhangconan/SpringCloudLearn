问题一：not have available server
```java
com.netflix.client.ClientException: Load balancer does not have available server for client: eureka-producer
```
这个问题刚开始困扰了我好长时间，最后发现原来是因为我没加入 eureka-client 这个依赖，只加了 spring-boot-starter-web 和 spring-cloud-starter-openfeign。只有后两者的话，启动的时候其实是不会有任何异常被抛出的，
但是如果细心地查看了启动 log 的话，其中有这么一条可以看出实际上确实是没有获取到任何服务的
```java
com.netflix.loadbalancer.BaseLoadBalancer  : Client: eureka-producer instantiated a LoadBalancer: DynamicServerListLoadBalancer:{NFLoadBalancer:name=eureka-producer,current list of Servers=[],Load balancer stats=Zone stats: {},Server stats: []}ServerList:null
```
所以，要想使用 Feign，至少需要以下三个依赖
```
spring-boot-starter-web
spring-cloud-starter-openfeign
spring-cloud-starter-netflix-eureka-client
```

问题二：Request method ‘POST’ not supported 获取调用方参数为空
```java
feign.FeignException: status 405 reading HelloRemote#hello(String); content:
{"timestamp":"2018-04-13T16:29:12.453+0000","status":405,"error":"Method Not Allowed","message":"Request method 'POST' not
```
HelloRemote方法中的参数别忘了添加RequestParam

https://windmt.com/2018/04/15/spring-cloud-3-service-producer-and-consumer/
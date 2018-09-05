## CAP：  
    C:Consistency一致性。  
    A:Availability可用性。  
    P:Partition tolerance分区容错性。  
    
Zookeeper保证CP。  
Eureka保证AP。  

Eureka中的节点之间是相互平等的，部分注册中心的节点挂掉也不会对集群造成影响，即使集群只剩下一个节点存活也可以
正常提供发现服务。哪怕是所有的服务注册节点都挂了，Eureka Clients上也会缓存服务调用的信息，保证了微服务之间的互相调用是足够健壮的。

SpringCloudNetflix主要组件：Eureka、Ribbon、Hystrix、Feign等。


    
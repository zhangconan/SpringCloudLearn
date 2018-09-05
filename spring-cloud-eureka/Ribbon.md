Ribbon主要包括六个组件：   
#### ServerList
    ServerList:负载均衡使用的服务器列表。这个列表会缓存在负载均衡器中，并定期更新。当Ribbon与Eureka结合使用时，
    ServerList的实现类就是DiscoveryEnabledNIWSServerList，它会保存EurekaServer中注册的服务实例表。  
#### ServerListFilter 
    ServerListFilter:服务器列表过滤器，这是一个接口，主要用于对ServiceConsumer获取到的服务器列表进行预过滤，过滤的结果
    也是ServerList。Ribbon提供了多种过滤器的实现。  
#### IPing
    IPing：探测服务实例是否存活的策略。
#### IRule
    IRule：负载均衡策略，其实现类表述的策略包括：轮询、随机、根据响应时间加权等。
    
 ![IRule](./img/Ribbon%20IRule.png)
 
 #### ILoadBalancer
    ILoadBalancer:负载均衡器。一般ILoadBalancer的实现类中会引用一个IRule。
    
![ILoadBalancer](./img/Ribbon%20ILoadBalancer.png)    
#### RestClient
    RestClient：服务调用器。
    
Ribbon工作的时候会做四件事：  
1、优先选择在同一个Zone且负载较少的EurekaServer。  
2、定期从Eureka更新并过滤服务实例列表。  
3、根据用户指定的策略，从Server取到的服务注册列表中选择一个实例的地址。  
4、通过RestClient进行服务调用。
       
    
    
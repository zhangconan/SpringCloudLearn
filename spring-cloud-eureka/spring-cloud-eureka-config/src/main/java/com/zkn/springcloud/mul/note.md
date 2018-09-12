    1、在搭建 Eureka Server 双节点或集群的时候，要把eureka.client.register-with-eureka和eureka.client.fetch-registry均改为true（默认）。
    否则会出现实例列表为空，且 peer2 不在 available-replicas 而在 unavailable-replicas 的情况（这时其实只是启动了两个单点实例）。
    如果是像我这样图省事把之前的单节点配置和双节点的配置放在一个工程里，双节点的配置里要显示设置以上两个参数，
    直接删除是用不了默认配置的——Spring profile 会继承未在子配置里设置的父配置（application.yml）中的配置。  

    2、在注册的时候，配置文件中的spring.application.name必须一致，否则情况会是这样的
    
https://windmt.com/2018/04/15/spring-cloud-2-eureka/    
    
    
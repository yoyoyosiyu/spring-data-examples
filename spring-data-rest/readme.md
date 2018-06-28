# Spring Data Rest Example

演示如何完整的使用Spring Data Rest 来开发我们的数据服务

示例所使用的数据模型为northwind


### 知识点

Jpa的字段命名策略设置
```yaml
spring:
  jpa:
    hibernate:
      naming:
        physical-strategy: org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl
```

https://www.cnblogs.com/mahongbiao/p/3764782.html
# Jpa 的命名策略

### 如何运行示例
要检查结果，需要运行测试。整个jpa的配置在测试目录下的JpaConfig类当中。
默认的Hibernate的命名策略并不是我们在spring boot 环境中看到的那种snake case方式。就是大写字母前用下划线，然后大写字母转换为小写的方式，例如
ItemCategory 转为 item_category, 而默认的方式是把所有大写字母都转为小写，例如：ItemCategory 转换为 itemcategory。可以尝试将JpaConfig中
的设置名字策略代码注释掉就看到结果

```java
properties.setProperty("hibernate.implicit_naming_strategy", SpringImplicitNamingStrategy.class.getName());
properties.setProperty("hibernate.physical_naming_strategy", SpringPhysicalNamingStrategy.class.getName());
```

SpringImplicitNamingStrategy和SpringPhysicalNamingStrategy都是spring-boot的类，所以maven需要引入spring-boot依赖。
SpringPhysicalNamingStrategy的主要工作就是转换实体以及实体的属性为snake case。


从Hibernate 5 开始，Hibernate 对实体以及实体属性的映射分为两个阶段，第一个阶段是确定logic name， 第二个阶段是physical name。
所以可以通过分别设置hibernate.implicit_naming_strategy以及hibernate.physical_naming_strategy这两个属性来添加自己的命名策略


一、mybatis_01
    1、自定义类似mybatis框架（查询功能）支持sql和注解和xml配置
    2、核心技术：
        2.1、工厂模式
        2.2、动态代理模式
        2.3、dom4j解析xml
二、mybatis_02
    1、增删改查
    2、动态sql

三、mybatis_03
    1、xml的resultMap配置
    2、一对多、多对多配置

四、mybatis_04
    1、如何设置延迟加载（分步查询）
        作用范围：一般来说主要用在一对多和多对多，而多对一和一对一可以不使用
        如何配置：在配置文件开启延迟加载
                XMl文件配置
    2、mybatis的一级缓存和二级缓存使用(测试类：)
        一级缓存（测试类UserFirstCacheTest.java）：
            作用域是：sqlSession  默认已经开启

        二级缓存(测试类SecondLevelCacheTest)：
            作用域：sqlSessionFactory
            如何开启：配置在xml配置 <setting name="cacheEnabled" value="true"/>和<!--开启user支持二级缓存--><cache/>
                注意：二级缓存是在sqlSessionFactory存放的是字符串，所以共享的是数据本身不是对象本身

    3、mybatis注解开发（一对多、多对多）
        配置：
        com.josh.annotation.IAccountDao
        com.josh.annotation.IUserDao

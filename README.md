# Yilami v0.0.1(易纳米）

=======================================================================================================================
    *************** ****************************    V0.0.1 *******************************************
======================================================================================================================= 
1. 基础架构

   MyIbatis3.1.1+Spring3.12+SpringSecurity3.13+SpringMvc3.12快速开发库的基础架构

2. 数据库存储
   Yilami v0.0.1目前采用的是H2文件内置的数据库模式，已经对应的处理了相关H2的数据库方言(dialect),项目内部结构中已经存在不同版本的数据库的
   初始化脚本(db_yilami_init_h2.sql)

3. 内置服务器
   Yilami v0.0.1的项目工程是符合WEB功能的目录结构，可以部署到Tomcat6中，对于更高版本的，目前还是存在一些问题，可以对应的升级Spring的版本。
   目前默认的采用内置的tomcat进行项目发布和启动。

4. 项目建构
   考虑到应用的场景的问题，没有采用maven的方式进行项目建构，仍旧使用ant的方式进行项目的建构和打包。



=======================================================================================================================
    *******************************************    后续改进 *******************************************
======================================================================================================================= 
1. 基础架构
   在v0.0.1架构基础之上,将表现层和业务层在功能上进行分离,计划采用alibaba dubbo+zookeeper的方式进行处理

2. 数据库存储
   支持主流的数据库(mysql,oracle,db2) 等。


3. 项目建构
   有采用maven的方式进行项目建构。

4. 废弃前端的Jquery,改用angularJs进行改造。



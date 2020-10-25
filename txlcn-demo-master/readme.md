## Introduction
这其实是两个项目
一个项目是官方的,但牵涉的不熟悉的东西比较多,就没跑起来
对应txlcn-demo.sql 和txlcn-demo-xxx 模块们

一个是参考博客 [SpringCloud整合TX-LCN5.0.2使用LCN实现分布式事务（附源码）_qq_43173523的博客-CSDN博客 ](https://blog.csdn.net/qq_43173523/article/details/106408473?utm_medium=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-2.channel_param&depth_1-utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-2.channel_param)

### 官方说明
txlcn 5.0 demo


使用说明:

1. 本Demo基于[txlcn-最新发布](https://github.com/codingapi/tx-lcn)版本
2. 启动Demo前需先启动事务管理器TM（txlcn-demo-tm）。
3. 更多信息见官网 [https://www.txlcn.org](https://www.txlcn.org)
4. [性能测试报告](https://txlcn.org/zh-cn/docs/test.html)

### 参考博客成功搭建的
- account-api
- tx-manager
- eureka-server
- bank-provider
- bank-consumer
对应模块如上,对应
可以试试分布式事务注解和不加注解时伪造异常的情形

## usage summary
- 先启动tx-manager做一简单的配置即可,这个还未了解,目前不知有何要特别注意之处
  - 在主启动类中添加@EnableTransactionManagerServer
- 启动tx-client,即需要分布式事务功能的模块
  - 在主启动类中添加@EnableDistributedTransaction
  - 在service层添加@LcnTransaction(或者TCC,TXC,见机行事),并依据发起方或者参与方来决定事务传播特性(发起方通常propagation = DTXPropagation.REQUIRED,参与方通常propagation = DTXPropagation.SUPPORTS)

其它要说明的点就是:TX-LCN不产生事务只负责协调事务,所以在service层还需要添加@Transaction使能各个模块的本地事务.

## 主要参考资料
[tx-lcn 官方](https://github.com/codingapi/tx-lcn)
[txlcn-demo 官方](https://github.com/codingapi/txlcn-demo)
[SpringCloud系列——TX-LCN分布式事务管理 - huanzi-qch - 博客园 ](https://www.cnblogs.com/huanzi-qch/p/11057974.html)
[SpringCloud整合TX-LCN5.0.2使用LCN模式实现分布式事务_hxt的博客-CSDN博客 ](https://blog.csdn.net/qq_40378034/article/details/103759130)
[SpringCloud整合TX-LCN5.0.2使用LCN实现分布式事务（附源码）_qq_43173523的博客-CSDN博客 ](https://blog.csdn.net/qq_43173523/article/details/106408473?utm_medium=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-2.channel_param&depth_1-utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-2.channel_param)
[浅谈SpringCloud微服务下分布式事务框架TX-LCN | 码农家园 ](https://www.codenong.com/cs105845103/)
[SpringBoot2.x集成Consul，实现服务的配置中心化管理（配置共享）_Appleyk的专栏-CSDN博客 ](https://blog.csdn.net/Appleyk/article/details/104362446)
https://gitee.com/huanzi-qch/springCloud

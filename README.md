# ZX's Library Management System  

## Abstract

This is a library management system. In this system, we support fundamental functions about management system. 
We use JavaSE for development. 
At last, we provide this repository to promote our coding ability.  

## Environment

JavaSE 15.0.2

## Structure

### MVC Framework

MVC: Model, View and Controller. Traditional 3 layer structure. The process oriented Java Web layered pattern is mainly divided into the following three levels:

Model: Manages data and business logic.

View: Handles layout and display.

Controller: Routes commands to the model and view parts.

We use MVC application structure to modifying our project. 

#### MVC:

controller ： 主要是对外的接口

service ： 核心业务逻辑

dao/mapper ： 数据库访问层

entity： 实体类，字段和数据库保持一致

vo： 前端专用类型，避免暴露数据库结构

common： 基础工具包和常量package

This is an example about MVC structure.

**(To do: Code block)**
```text
├─com.company.microservice
│    │ 
│    ├─apis   API接口层
│    │    ├─model     视图模型,数据模型定义 vo/dto（大多数情況是一样的）
│    │    ├─assembler    装配器，实现模型转换eg. apiModel<=> domainModel
│    │    └─controller   控制器，对外提供（Restful）接口
│    │ 
│    ├─application   应用层
│    │    ├─service  应用服务，非核心服务
│    │    ├─task     任务定义，协调领域模型 
│    │    └─***      others
│    │ 
│    ├─domain   领域层
│    │    ├─common       公共代码抽取，限于领域层有效  
│    │    ├─events       领域事件，聚合之间通信通过领域事件来触发
│    │    ├─model        领域模型 
│    │    │    ├─dict    领域划分的模块，可理解为子域划分
│    │    │    │    ├─DictVo.java       领域值对象
│    │    │    │    ├─DictEntity.java   领域实体，充血的领域模型，如本身的CRUD操作在此处
│    │    │    │    ├─DictAgg.java      领域聚合，通常表现为实体的聚合，需要有聚合根
│    │    │    │    └─DictService.java  领域服务，不能归类到上述模型，如分页条件查询等可写在此处
│    │    │    ├─xxx
│    │    │    │    ├─xxxEntity.java      
│    │    │    │    ├─bbbAgg.java     
│    │    │    │    └─cccAgg.java        
│    │    ├─service      领域服务类，一些不能归属某个具体领域模型的行为
│    │    ├─repository   仓储接口
│    │    └─factory      工厂类，负责复杂领域对象创建，封装细节 
│    │ 
│    ├─infrastructure  基础设施层
│    │    ├─persistent   持久化机制
│    │    │    ├─po           持久化对象 
│    │    │    └─repository   仓储类，持久化接口&实现，可与ORM映射框架结合
│    │    ├─general      通用技术支持，向其他层输出通用服务
│    │    │    ├─config       配置类
│    │    │    ├─toolkit      工具类  
│    │    │    └─common       基础公共模块等
│    │ 
│    ├─reference  引用层，扩展外部接口包装引用，防止穿插到Domain层腐化领域模型等 
│    │    ├─ 忽略技术实现，此处的RPC、Http等调用，Domain层一般通过DomainEvent关联 
│    │
│    └─resources  
│        ├─statics  静态资源
│        ├─template 系统页面 
│        └─application.yml   全局配置文件
```

## instructions

None

## Developer

The project is developed by xzq & zzx.

## Reference

[MVC Framework](https://www.tutorialspoint.com/mvc_framework/mvc_framework_introduction.htm)

[Library Management System](https://www.cnblogs.com/aimetoi/p/13529731.html)
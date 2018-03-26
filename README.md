# 龙果充值平台

### 项目介绍
1. 具备话费充值、流量充值、话费卡兑换功能；
2. 可以拓展其他充值兑换业务，如：Q币充值、游戏卡充值等等；
3. 也适用于支付、鉴权等业务功能的拓展；

### 技术选型
1. 核心技术框架：Spring Boot
2. 数据库连接池：Druid
3. 持久层的框架：MyBatis
4. 权限管理框架：Shiro
5. 后台页面框架：B-JUI

### 项目结构

```
├─roncoo-recharge -----------------------------父项目，公共依赖
│  │
│  ├─roncoo-recharge-api
│  │  │
│  │  ├─roncoo-recharge-api-core --------------上游接口的封装：对接上游，只需要对其接口进行实现
│  │  │
│  │  ├─roncoo-recharge-api-longguo -----------上游接口实现demo1
│  │  │
│  │  └─roncoo-recharge-api-roncoo ------------上游接口实现demo2
│  │
│  ├─roncoo-recharge-boss ---------------------运营管理后台
│  │
│  ├─roncoo-recharge-crontab ------------------定时任务工程
│  │
│  ├─roncoo-recharge-gateway ------------------网关工程：核心流程请看帮助文档
│  │
│  ├─roncoo-recharge-util ---------------------工具类
│  │
│  ├─roncoo-recharge-web ----------------------下游管理后台
│  │
│  ├─doc
│  │  │
│  │  ├─images --------------------------------项目演示截图
│  │  │
└──└──└─rc_recharge.sql------------------------项目SQL脚本：带有demo数据
```

### 帮助文档
![流程图](/doc/images/90.png)

### 官方QQ群
* QQ2群: 601146630
* QQ1群: 213097382 (满)

### 项目截图
![话费卡兑换](/doc/images/1.png)
![流量充值](/doc/images/2.png)
![话费充值](/doc/images/3.png)
![菜单管理](/doc/images/4.png)
![角色管理](/doc/images/5.png)
![用户管理](/doc/images/6.png)
![商品管理](/doc/images/7.png)
![商品管理](/doc/images/8.png)

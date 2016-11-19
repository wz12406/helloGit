# Git教程
- feature-A
## 概述
学习使用git的一个测试项目哦！以前都是零碎的学习了点git的使用，现在开始好好系统的学习一下git了
### 无须列表
* markdown语言学习
* 集中仓库和分散仓库的区别

### 再来一个有序列表
1. 1 hello world
2. 2 新建一个仓库玩玩

### 引用
>引用例子

### 连接和插图
* [百度]（www.baidu.com）
* ![Mou icon](https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png)

### 斜体和粗体
* **这个是粗体**
* *这个是斜体*

### 下面是表格哦
| Tables        | Are           | Cool  |
| ------------- |:-------------:| -----:|
| col 3 is      | right-aligned | $1600 |
| col 2 is      | centered      |   $12 |
| zebra stripes | are neat      |    $1 |

### 这个比较重要 代码

```Java
public void overdueCalculates() throws Exception {
        //查询出逾期的还款计划
        List<DataInstallmentPlan> overduePlan = findOverduePlan();
        //1.标记状态
        markStatus();
        log.info("状态标记完毕");
        //2. 生成逾期记录
        generateOverdueRecord(overduePlan);
        log.info("插入或生成逾期记录完毕");
        //3.更新已到期合同的逾期等级
        updateExpireOverdueLevel();
        log.info("更新已到期合同逾期等级完毕");
        //4.计算罚息、违约金 未完待续...

    }
```

### 分割线 
分
***
隔
***
线

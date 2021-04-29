# 简介
## 为什么要使用外观模式
在软件开发中，有时候一个客户类需要和多个业务类交互，由于涉及到的类比较多，导致使用时代码较为复杂，此时，特
别需要一个能够统筹所有业务类的角色，由它来负责和业务类进行交互，而客户类只需与该类交互。外观模式通过引入一
个新的外观类(Facade)来实现该功能，它为多个业务类的调用提供了一个统一的入口，简化了类与类之间的交互。
> 自解：分散给各个业务系统去实现
## 什么是外观模式
外观模式(Facade Pattern)：为子系统中的一组接口提供一个统一的入口。外观模式定义了一个高层接口，这个接口使得
这一子系统更加容易使用。
## 类型
对象结构型模式
## 遵守的原则
迪米特法则。外观模式对客户端屏蔽子系统，客户端不需要了解子系统，直接访问外观类即可。
# 本文角色
- Facade：外观角色 
    - 具体类
    - 知道哪些子系统负责处理请求。
    - 将客户端的请求转发给合适的子系统对象。
- SubSystem：子系统角色 
    - 类或者类的集合
    - 处理由外观角色Facade对象指派的任务。
## 简化 
如果只有一个具体建造者，那么抽象建造者和指挥者都可以省略。
## 角色之间的协作
客户通过发送请求给Facade与子系统通信，Facade将这些请求转发给适当的SubSystem。
# 实现
- 创建外观角色Facade.java
- 创建子系统角色SubSystemA.java、SubSystemB.java、SubSystemC.java
- 创建客户类Client.java
# 优缺点
## 优点
- 遵守“迪米特法则”。外观模式对客户端屏蔽子系统，客户端不需要了解子系统，直接访问外观类即可。
- 简化了客户端代码。客户端只需要将请求发送给Facade，减少了客户处理的对象的数目。
- 解耦。实现了客户端和子系统的松耦合关系。
- 性能高。使用原型模式克隆对象比直接new一个对象性能高。
## 缺点
- 违背了“开闭原则”。在不引入抽象外观类的情况下，增加新的子系统可能需要修改外观类或客户端的源代码。
# 适用环境
- 要为访问一系列复杂的子系统提供一个简单入口时。
## 使用场景
- 导航栏/菜单。导航/栏菜单作为外观类。
# 扩展
## 抽象外观类的引入解决外观模式违背了“开闭原则”的问题
外观模式最大的缺点在于违背了“开闭原则”。当增加新的子系统或者移除子系统时需要修改外观类。可以通过引入抽象外
观类在一定程度上解决该问题，客户端针对抽象外观类进行编程。增加新的子系统时，不修改原有外观类，而对应增加一
个新的具体外观类，由新的具体外观类来关联新的子系统对象。
## Mediator模式与Facade模式的相似点与区别
- 相似点
    - 都抽象了一些已有的类的功能
- 不同点
    - Mediator模式目的是实现同事之间的通信，而Facade模式目的是为客户端提供一个访问子系统的接口。
    - Mediator模式的同事对象知道Mediator的存在，而Facade模式的子系统并不知道Facade的存在
# 问题
## 在软件开发中，你在哪里用到了外观模式？怎么用的？
待补充。
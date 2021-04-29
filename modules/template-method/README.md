# 简介
## 为什么要使用模板方法模式
在软件设计中，某个功能的实现可能需要若干个步骤，其中有些步骤是固定的操作，而有些步骤就不固定，这时如何设计
功能就是个问题，模板方法模式可以解决这个问题。在模板方法模式中，将固定的步骤放在父类中实现，不固定的步骤在
父类中声明，具体实现放在子类中，在运行时选择一个子类来实现一个完整的功能。
## 什么是模板方法模式
模板方法模式（Template Method Pattern）：定义一个操作中算法的框架，而将一些步骤延迟到子类中。模板方法模式使
得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
## 类型
类行为型模式
## 实现的原则
开闭原则。
## 使用频率
★★★★☆
# 本文角色
- AbstractClass：抽象类 
    - 抽象类
    - 定义基本操作和模板方法。
    - 基本操作(PrimitiveOperations)：每一个基本操作对应实现算法的一个步骤，在其子类中可以重定义或实现这些步骤。
    - 模板方法(Template Method)：用于定义算法的框架。可以调用抽象类中基本方法，在抽象类的子类中实现的基本方法，还可以调用其他对象中的方法。
- ConcreteClass：具体子类 
    - 具体类
    - 抽象类的子类。
    - 实现在父类中声明的抽象基本操作，或者重写在父类中已经实现的具体基本操作。
# 实现
- 创建抽象类AbstractClass.java
- 创建具体子类ConcreteClassA.java、ConcreteClassB.java
- 创建测试类Client.java
# 优缺点
## 优点
- 代码复用。使用继承来实现代码复用。
- 遵守“开闭原则”。可以在不修改原有代码的前提下灵活的新增具体子类。
- 实现反向控制。通过由子类决定是否覆盖父类的空方法来决定某一特定步骤是否需要执行。
## 缺点
- 如果基本方法中，可变的基本方法过多，会导致产生大量的子类。
# 适用环境
- 各子类中公共的行为应被提取出来放到一个公共父类中以避免代码重复。
- 通过由子类决定是否覆盖父类的空方法来决定某一特定步骤是否需要执行。
## 使用场景
- 待补充
# 扩展
## 钩子方法 
在父类中提供了缺省的行为，一般是个空方法，由子类决定是否覆盖父类的钩子方法来决定某一特定步骤是否需要执行。
## 相关模式
工厂方法模式（Factory Method）。常被模板方法模式调用。
策略模式(Strategy)。模板方法模式使用继承来改变算法的某一部分。Strategy使用委托来改变整个算法。
# 问题
## 在软件开发中，你在哪里用到了策略模式？
待补充。
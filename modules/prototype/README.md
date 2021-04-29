# 简介
## 为什么要使用原型模式
用于创建重复的对象。当直接创建对象代价比较大时，使用此模式。
## 什么是原型模式
原型模式(Prototype Pattern)：用原型实例指定创建对象的种类，并通过拷贝这些原型创建新的对象。
## 类型
对象创建型模式
# 本文角色
- Product：抽象原型类 
    - 声明克隆方法的接口。
    - 是所有具体原型类的公共父类。
    - 可以是抽象类也可以是接口，甚至还可以是具体实现类。
- ConcretePrototype：具体原型类 
    - Prototype的具体原型类。
    - 实现在抽象原型类中声明的克隆方法，在克隆方法中返回自己的一个克隆对象。
- Client：客户类 
    - 通过调用该对象的克隆方法即可让一个原型对象克隆自身从而创建一个新的对象，得到多个相同的对象。
## 简化 
如果只有一个具体建造者，那么抽象建造者和指挥者都可以省略。
# 实现
- 创建抽象原型类Prototype.java
- 创建具体原型类ConcretePrototype.java
- 创建测试类客户类Client.java
# 优缺点
## 优点
- 性能高。使用原型模式克隆对象比直接new一个对象性能高。
## 缺点
- 原型模式和单例模式是冲突的。
# 适用环境
- new一个对象时需要耗费很大的资源。
## 使用场景
待补充
# 问题
## 克隆出的对象和被克隆的对象有何不同？
内存地址是不同的。对克隆出的对象做修改不会对被克隆的对象产生任何影响。
## 在软件开发中，你在哪里用到了原型模式？
待补充。
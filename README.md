# GOF23种设计模式简介
> 注意：设计模式中有些设计模式光看UML图会发现代码实现很像，所以，其实真正进行区分的还是业务场景，抽象出功能代码的业务，才能更好的表示，有时候也可能是多个设计模式进行结合。

《Design Patterns: Elements of Reusable Object-Oriented Software》（即后述《设计模式》一书），由 Erich Gamma、Richard Helm、
Ralph Johnson 和 John Vlissides 合著（Addison-Wesley，1995）。这几位作者常被称为"四人组（Gang of Four）"

GoF（“四人帮”，指Gamma, Helm, Johnson & Vlissides, Addison-Wesley四人）提出的23种设计模式可谓经典，由于其定义比较严谨趋于理论化，故刚
开始不一定很快掌握，下面简要对23种设计模式予以简要介绍，并给出现实中相关的通俗易懂的事例：

## 七大设计原则： 
- 1、单一职责原则【SINGLE RESPONSIBILITY PRINCIPLE】：一个类负责一项职责. 
- 2、里氏替换原则【LISKOV SUBSTITUTION PRINCIPLE】：继承与派生的规则.（子类可替换父类） 
- 3、依赖倒转原则【DEPENDENCE INVERSION PRINCIPLE】：高层模块不应该依赖低层模块，二者都应该依赖其抽象；抽象不应该依赖细节；细节应该依赖抽象。即针对接口编程，不要针对实现编程。 
- 4、接口隔离原则【INTERFACE SEGREGATION PRINCIPLE】：建立单一接口，不要建立庞大臃肿的接口，尽量细化接口，接口中的方法尽量少。 
- 5、迪米特法则【LOW OF DEMETER】：高内聚 低耦合 – high cohesion low coupling 
- 6、开闭原则【OPEN CLOSE PRINCIPLE】：一个软件实体如类、模块和函数应该对扩展开放，对修改关闭。 
- 7、组合/聚合复用原则【Composition/Aggregation Reuse Principle(CARP) 】：尽量使用组合和聚合少使用继承的关系来达到复用的原则。

## 一、23种设计模式      
- Abstract Factory [抽象工厂模式](./modules/abstract-factory/README.md) ——提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。 
- Adapter [适配器模式](./modules/adapter/README.md)—–将一个类的接口转换成客户希望的另外一个接口。Adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。 
- Bridge [桥接模式](./modules/bridge/README.md)——将抽象部分与它的实现部分分离，使它们都可以独立地变化。 
- Builder [生成器模式](./modules/builder/README.md)——将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。 
- Chain of Responsibility [职责链模式](./modules/chain-of-responsibility/README.md)——为解除请求的发送者和接收者之间耦合，而使多个对象都有机会处理这个请求。将这些对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它。 
- Command [命令模式](./modules/command/README.md)——将一个请求封装为一个对象，从而使你可用不同的请求对客户进行参数化；对请求排队或记录请求日志，以及支持可取消的操作。 
- Composite [组合模式](./modules/composite/README.md)——–将对象组合成树形结构以表示“部分-整体”的层次结构。Composite使得客户对单个对象和复合对象的使用具有一致性。 
- Decorator [装饰模式](./modules/decorator/README.md)——动态地给一个对象添加一些额外的职责。就扩展功能而言，Decorator模式比生成子类方式更为灵活。 
- Facade [外观模式](./modules/facade/README.md)——为子系统中的一组接口提供一个一致的界面， Facade模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。 
- Factory Method [工厂方法模式](./modules/factory-method/README.md)——定义一个用于创建对象的接口，让子类决定将哪一个类实例化。Factory Method使一个类的实例化延迟到其子类。 
- Flyweight [享元模式](./modules/flyweight/README.md)——运用共享技术有效地支持大量细粒度的对象。 
- Interpreter [解释器模式](./modules/interpreter/README.md)——给定一个语言, 定义它的文法的一种表示，并定义一个解释器, 该解释器使用该表示来解释语言中的句子。 
- Iterator [迭代器模式](./modules/iterator/README.md)—–提供一种方法顺序访问一个聚合对象中各个元素, 而又不需暴露该对象的内部表示。 
- Mediator [中介者模式](./modules/mediator/README.md)——用一个中介对象来封装一系列的对象交互。中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。 
- Memento [备忘模式](./modules/memento/README.md)——在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可将该对象恢复到保存的状态。 
- Observer [观察者模式](./modules/observer/README.md)：定义对象间的一种一对多的依赖关系,以便当一个对象的状态发生改变时,所有依赖于它的对象都得到通知并自动刷新。 
- Prototype [原型模式](./modules/prototype/README.md)——用原型实例指定创建对象的种类，并且通过拷贝这个原型来创建新的对象。 
- Proxy [代理模式](./modules/proxy/README.md)：为其他对象提供一个代理以控制对这个对象的访问。 
- Singleton [单态模式](./modules/singleton/README.md)——保证一个类仅有一个实例，并提供一个访问它的全局访问点。 
- State [状态模式](./modules/state/README.md)：允许一个对象在其内部状态改变时改变它的行为。对象看起来似乎修改了它所属的类。 
- Strategy [策略模式](./modules/strategy/README.md)——定义一系列的算法,把它们一个个封装起来, 并且使它们可相互替换。本模式使得算法的变化可独立于使用它的客户。 
- Template Method [模板方法模式](./modules/template-method/README.md)——定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。Template Method使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
- Visitor [访问者模式](./modules/visitor/README.md)—–表示一个作用于某对象结构中的各元素的操作。它使你可以在不改变各元素的类的前提下定义作用于这些元素的新操作。

## 二、事例：
### 1.创建型模式 
- FACTORY？加工工厂：给它“M4A1”，它给你产把警枪，给它“AK47”，你就端了把匪枪。CS里买枪的程序一定是用这个模式的。
- BUILDER？生产流水线：以前是手工业作坊式的人工单个单个的生产零件然后一步一步组装做，好比有了工业革命，现在都由生产流水线代替了。如要造丰田汽车，先制定汽车的构造如由车胎、方向盘、发动机组成。再以此构造标准生产丰田汽车的车胎、方向盘、发动机。然后进行组装。最后得到丰田汽车； 
- PROTOTYPE？印刷术的发明：以前只能临贴抄写费时费力，效率极低，有了印刷术，突突的； 
- SINGLETON？确保唯一：不是靠new的，是靠instance的，而且要instance地全世界就这么一个实例(这可怜的类，也配叫“类”)。 看SingleTon类代码。

### 2.结构型模式（structual patterns） 
- ADAPTER？翻译官：胡哥只会汉语，布什只会美语，翻译官既通汉又通美，Adapter了 ；
- DECORATOR？装饰：名字可以标识一个人，为了表示对一个人的尊重，一般会称其为“尊敬的”，有了装饰，好看多了； 
- BRIDGE？白马非马：马之颜色有黑白，马之性别有公母。我们说"这是马"太抽象，说"这是黑色的公马"又太死板，只有将颜色与性别和马动态组合，"这是（黑色的或白色的）（公或母）马"才显得灵活而飘逸，如此bridge模式精髓得矣。 
- COMPOSITE？大家族：子又生孙，孙又生子，子子孙孙，无穷尽也，将众多纷杂的人口组织成一个按辈分排列的大家族即是此模式的实现； 
- FACADE？求同存异：高中毕业需读初中和高中，博士也需读初中和高中，因此国家将初中和高中普及成九年制义务教育； 
- FLYWEIGHT？一劳永逸：认识三千汉字，可以应付日常读书与写字，可见头脑中存在这个汉字库的重要； 
- PROXY？垂帘听政：犹如清朝康熙年间的四大府臣，很多权利不在皇帝手里，必须通过辅佐大臣去办；

### 3.行为模式 
- CHAIN OF RESPONSIBILITY？租房：以前为了找房到处打听，效率低且找不到好的房源。现在有了房屋中介，于是向房屋中介提出租房请求，中介提供一个合适的房源，满意则不再请求，不满意继续看房，直到满意为止； 
- COMMAND？借刀杀人：以前是想杀谁就杀，但一段时间后领悟到，长此以往必将结仇太多，于是假手他人，挑拨他人之间的关系从而达到自己的目的； 
- INTERPRETER？文言文注释：一段文言文，将它翻译成白话文； 
- ITERATOR？赶尽杀绝：一个一个的搜索，绝不放掉一个； 
- MEDIATOR？三角债：本来千头万绪的债务关系，忽出来一中介，包揽其一切，于是三角关系变成了独立的三方找第四方中介的关系； 
- MEMENTO？有福同享：我有多少，你就有多少； 
- OBSERVER？看守者：一旦被看守者有什么异常情况，定会及时做出反应； 
- STATE？进出自由：如一扇门，能进能出，如果有很多人随时进进出出必定显得杂乱而安全，如今设一保安限制其进出，如此各人进出才显得规范； 
- STRATEGY？久病成良医：如人生病可以有各种症状，但经过长期摸索，就可以总结出感冒、肺病、肝炎等几种； 
- TEMPLATE METHOD？理论不一定要实践：教练的学生会游泳就行了，至于教练会不会则无关紧要； 
- VISITOR？依法治罪：因张三杀人要被处死，李四偷窃要被罚款。由此势必制定处罚制度，故制定法律写明杀人、放火、偷窃等罪要受什么处罚，经通过后须变动要小。今后有人犯罪不管是谁，按共条例处罚即是，这就是访问者模式诞生的全过程。
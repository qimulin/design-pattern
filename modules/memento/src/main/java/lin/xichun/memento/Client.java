package lin.xichun.memento;

/**
 * Created by Lin.XiChun on 2018/11/23.
 */
public class Client {
    public static void main(String[] args){
        // 原始类设置状态
        Originator originator = new Originator();
        originator.setState("状态1");
        System.out.println("初始状态:"+originator.getState());
        // 管理类设置创建原始类的备忘录
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());
        originator.setState("状态2");
        System.out.println("修改后状态:"+originator.getState());
        // 原始类通过设置管理类的获取备忘录里记得的状态
        originator.restoreMemento(caretaker.getMemento());
        System.out.println("撤銷后状态:"+originator.getState());
    }
}

package lin.xichun.demo1;

/**
 * 接口的实体类
 * 终结符表达式。实现与文法中的终结符相关的解释操作。实现抽象表达式中所要求的方法。
 * 文法中每一个终结符都有一个具体的终结表达式与之相对应。
 * Created by Lin.XiChun on 2018/11/19.
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}

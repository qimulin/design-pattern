package lin.xichun.demo2;

import java.util.Stack;

/**
 * Created by Lin.XiChun on 2018/11/22.
 */
public class Calculator {
    private String statement;
    private Node node;

    public void build(String statement) {
        Node left = null, right = null;
        // 用栈轮流去接收每个值
        Stack stack = new Stack();
        // 靠空格作为分隔符，得到各个符号
        String[] statementArr = statement.split(" ");

        for (int i = 0; i < statementArr.length; i++) {
            if (statementArr[i].equalsIgnoreCase("*")) {
                left = (Node) stack.pop();
                int val = Integer.parseInt(statementArr[++i]);
                right = new ValueNode(val);
                stack.push(new MulNode(left, right));
            } else if (statementArr[i].equalsIgnoreCase("/")) {
                left = (Node) stack.pop();
                int val = Integer.parseInt(statementArr[++i]);
                right = new ValueNode(val);
                stack.push(new DivNode(left, right));
            } else if (statementArr[i].equalsIgnoreCase("%")) {
                left = (Node) stack.pop();
                int val = Integer.parseInt(statementArr[++i]);
                right = new ValueNode(val);
                stack.push(new ModNode(left, right));
            } else {
                stack.push(new ValueNode(Integer.parseInt(statementArr[i])));
            }
        }
        this.node = (Node) stack.pop();
    }

    public int compute() {
        return node.interpret();
    }

}

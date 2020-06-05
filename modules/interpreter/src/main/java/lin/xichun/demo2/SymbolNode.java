package lin.xichun.demo2;

/**
 * 抽象类
 * NonterminalExpression:非终结符表达式
 * 自解：我认为这个就是抽象一些共同的部分和一些共同的方法
 * Created by Lin.XiChun on 2018/11/20.
 */
public abstract class SymbolNode implements Node{
    protected Node left;
    protected Node right;

    public SymbolNode(Node left,Node right)
    {
        this.left=left;
        this.right=right;
    }

}

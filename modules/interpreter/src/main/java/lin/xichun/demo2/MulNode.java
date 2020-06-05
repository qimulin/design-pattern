package lin.xichun.demo2;

/**
 * left*right乘积计算
 * Created by Lin.XiChun on 2018/11/22.
 */
public class MulNode extends SymbolNode
{
    public MulNode(Node left,Node right)
    {
        super(left,right);
    }

    public int interpret()
    {
        return super.left.interpret() * super.right.interpret();
    }

}

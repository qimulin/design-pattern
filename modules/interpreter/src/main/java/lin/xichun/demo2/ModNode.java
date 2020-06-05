package lin.xichun.demo2;

/**
 * 取余计算
 * Created by Lin.XiChun on 2018/11/22.
 */
public class ModNode extends SymbolNode
{
    public ModNode(Node left,Node right)
    {
        super(left,right);
    }

    public int interpret()
    {
        return super.left.interpret() % super.right.interpret();
    }

}

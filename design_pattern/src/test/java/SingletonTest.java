import com.hanxiao.singleton.MySingleton;
import com.hanxiao.singleton.Outer;
import org.junit.Test;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/24
 **/

public class SingletonTest {
    @Test
    public void test1() {
        MySingleton mySingleton = MySingleton.getInstance();
        MySingleton mySingleton1 = MySingleton.getInstance();
        MySingleton mySingleton2 = MySingleton.getInstance();
        System.out.println("mySingleton = " + mySingleton);
        System.out.println("mySingleton1 = " + mySingleton1);
        System.out.println("mySingleton2 = " + mySingleton2);
    }

    @Test
    public void testOuterInvoke() {
        Outer.invokeInnerMethod();
    }

    @Test
    public void testOuterNoInvoke() {
        Outer.noInvokeInnerMethod();
    }

    @Test
    public void testOuer() {
        Outer.invokeInnerMethod();
        Outer.invokeInnerMethod();
        Outer.invokeInnerMethod();
    }
}

import com.hanxiao.mybatis_in_spring.bean.User;
import com.hanxiao.mybatis_in_spring.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/1
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class MybatisInSpringTest {

    @Autowired
    UserService userService;
    @Test
    public void testSelectByPrimaryKey() {
        User user = userService.selectUserByPrimaryKey(2);
        System.out.println("user = " + user);
    }
}

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/applicationContext.xml")
public class TestFunction {
    @Autowired
    private UserService userService;
    @Autowired
    private UserDao userDao;
    @Test
    public void Testfunction(){

        System.out.println("12332");
        userService.register(new User(null,"zhangda","123",89.5));
    }
}

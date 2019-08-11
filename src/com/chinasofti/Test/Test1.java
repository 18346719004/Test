import com.chinasofti.dao.TestDao;
import com.chinasofti.pojo.User;

import com.chinasofti.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:com/chinasofti/application-context.xml"})
public class Test1 {
    @Autowired
    private TestService testService;
    @Test



    public void Test1(){
        User user = new User(147,"小er","123456");
        testService.insertTb(user);
    }
}


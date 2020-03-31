package cn.ah;

import cn.ah.mapper.UserMapper;
import cn.ah.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Project_Name springboot_test5
 * @Description TODO
 * @User Fortunate
 * @Date: 2020/3/29 19:30
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootTest5Application.class)
public class MyMapperTest {

    @Resource
    private UserMapper userMapper;
    @Test
    public void test(){
        List<User> users = userMapper.findAll();
        for(User u : users){
            System.out.println(u);
        }
    }
}

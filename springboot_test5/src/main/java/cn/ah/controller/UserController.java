package cn.ah.controller;

import cn.ah.mapper.UserMapper;
import cn.ah.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Project_Name springboot_test5
 * @Description TODO
 * @User Fortunate
 * @Date: 2020/3/29 19:16
 */
@Controller
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/findAll")
    @ResponseBody
    public List<User> findAll(){
        List<User> users = userMapper.findAll();
        return users;
    }
}

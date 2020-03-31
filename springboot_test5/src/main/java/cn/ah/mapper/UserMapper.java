package cn.ah.mapper;

import cn.ah.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Project_Name springboot_test5
 * @Description TODO
 * @User Fortunate
 * @Date: 2020/3/29 19:13
 */

@Mapper
public interface UserMapper {

    List<User> findAll();
}

package cuit.xsgw.service;

import cuit.xsgw.entity.User;
import cuit.xsgw.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public List<User> TNBlist() {
        return userMapper.TNBlist();
    }

    public List<User> GXYlist() {
        return userMapper.GXYlist();
    }

    public int AddUser(User user) {
        return userMapper.AddUser(user);
    }

    public int login(String id,String password) {

        if(userMapper.login(id) == null)
            return -1;
        if (userMapper.login(id).equals(password))
            return 1;
        else
            return 0;
    }
}

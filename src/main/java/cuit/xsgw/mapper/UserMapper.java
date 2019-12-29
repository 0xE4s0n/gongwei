package cuit.xsgw.mapper;

import cuit.xsgw.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<User> TNBlist();
    List<User> GXYlist();
    int AddUser(User user);
    String login(String id);
}

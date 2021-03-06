package team.scholarship.service;

import org.springframework.stereotype.Service;
import team.scholarship.bean.User;

import java.util.List;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author Brian.Z
 * @Date 2020/12/20 1:44
 */
@Service
public interface UserService {

    User getUserInfo(String userID);

    User login(String userID, String password);

    boolean register(String userID, String userName, String password);

    User getInfo(String token);

    boolean update(String userID, double score);

    boolean changePwd(String userID, String password);

    List<User> search(String userID, int startItem, int endItem);

    List<User> search(String userID);

}

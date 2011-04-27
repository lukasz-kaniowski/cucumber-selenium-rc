package org.springframework.samples.mvc.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO lkan; javadoc
 * User: Lukasz Kaniowski
 * Date: 11-04-27
 */
@Service
public class UserServiceImpl implements UserService {
    private ArrayList<User> users = new ArrayList<User>();

    @Override
    public User save(User user) {
        if (user.getName() == null) {
            throw new RuntimeException();
        }
        users.add(user);
        return user;
    }

    public List<User> list() {
        return users;
    }
}

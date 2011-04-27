package org.springframework.samples.mvc.user;

import java.util.List;

/**
 * TODO lkan; javadoc
 * User: Lukasz Kaniowski
 * Date: 11-04-27
 */
public interface UserService {

    User save(User user);

    List<User> list();
}

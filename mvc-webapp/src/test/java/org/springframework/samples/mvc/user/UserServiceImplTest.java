package org.springframework.samples.mvc.user;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

/**
 * TODO lkan; javadoc
 * User: Lukasz Kaniowski
 * Date: 11-04-27
 */
public class UserServiceImplTest {

    private UserServiceImpl userService;

    @Before
    public void setUp() throws Exception {
        userService = new UserServiceImpl();
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionWhenUserWithoutName() throws Exception {
        //given
        User user = new User();
        //when
        userService.save(user);
    }

    @Test
    public void shouldListSavedUser() throws Exception {
        //given
        User user = new User();
        user.setName("name");
        userService.save(user);
        //when
        List<User> users = userService.list();
        //then
        assertThat(users, is(notNullValue()));
        assertThat("User list is empty",users.size(), is(1));
        assertThat(users.get(0), is(user));
    }


}

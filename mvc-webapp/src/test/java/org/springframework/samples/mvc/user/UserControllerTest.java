package org.springframework.samples.mvc.user;

import org.junit.Before;
import org.junit.Test;

import static com.sun.javaws.JnlpxArgs.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;

/**
 * TODO lkan; javadoc
 * User: Lukasz Kaniowski
 * Date: 11-04-27
 */
public class UserControllerTest {


    private UserController userController;
    private UserService mock;

    @Before
    public void setUp() throws Exception {
        userController = new UserController();
        mock = mock(UserService.class);
        userController.setUserService(mock);
    }

    @Test
    public void shouldRedirectWhenUserSavedSuccessfully() throws Exception {
        //given
        User user = new User();
        //when
        String result = userController.processSubmit(null, user, null, null, null);
        //then
        verify(mock).save(user);
        assertThat(result, is("redirect:/user"));
    }


    @Test
    public void shouldRedirectToErrorPageWhenUserNotSavedSuccessfully() throws Exception {
        //given
        User user = new User();
        //when
        when(mock.save(user)).thenThrow(new RuntimeException());
        String result = userController.processSubmit(null, user, null, null, null);
        //then
        verify(mock).save(user);
        assertThat(result, is("redirect:/error"));
    }


}

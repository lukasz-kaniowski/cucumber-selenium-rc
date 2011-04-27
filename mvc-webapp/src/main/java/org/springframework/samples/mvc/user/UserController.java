package org.springframework.samples.mvc.user;

import org.springframework.samples.mvc.AjaxUtils;
import org.springframework.samples.mvc.flash.FlashMap;
import org.springframework.samples.mvc.flash.FlashMap.Message;
import org.springframework.samples.mvc.flash.FlashMap.MessageType;
import org.springframework.samples.mvc.form.FormBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @RequestMapping(method = RequestMethod.GET, value = "/add")
    public void form(@RequestHeader(value = "X-Requested-With", required = false) String requestedWith, HttpSession session, Model model) {
        model.addAttribute(new User());
    }

    @RequestMapping(method = RequestMethod.GET)
    public void list(@RequestHeader(value = "X-Requested-With", required = false) String requestedWith, HttpSession session, Model model) {
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(@RequestHeader(value = "X-Requested-With", required = false) String requestedWith, @Valid User user, BindingResult result, HttpSession session, Model model) {
        try {
            userService.save(user);
        } catch (Exception e) {
            return "redirect:/error";
        }
        return "redirect:/user";
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}

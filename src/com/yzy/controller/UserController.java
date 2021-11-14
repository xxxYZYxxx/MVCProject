package com.yzy.controller;

import com.yzy.beans.User;
import com.yzy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public String getUserList(Model model){

        List<User> userList=userService.getUserList();

        for (User user : userList) {
            System.out.println(user);
        }

        //将数据存到Model中
        model.addAttribute("userList",userList);

        return "list";
    }

    @RequestMapping("/addUser")
    public String addUser(User user, HttpServletRequest request) throws UnsupportedEncodingException {
        request.setCharacterEncoding("GBK");
        user.setPhoneNumber(request.getParameter("phoneNumber"));
        user.setUsername(new String(request.getParameter("username").getBytes("ISO-8859-1"),"utf-8"));
        user.setPassword(request.getParameter("password"));
        user.setMailAddress(request.getParameter("mailAddress"));
        int count=userService.addUser(user);
        System.out.println(user.getUsername());
        return "redirect:/index.jsp";
    }

}

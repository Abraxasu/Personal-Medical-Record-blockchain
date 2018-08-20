package com.sbtic.web.controllers;

import com.sbtic.web.form.LoginInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController
{
    @RequestMapping("/")
    public String showHome()
    {
        return "home";
    }

    @RequestMapping("/login")
    public String showLogin(String target, Model model)
    {
        LoginInfo loginInfo = new LoginInfo();
        if(target.equals("clients"))
            loginInfo.setLoginType("doctor");//normal default patient cannot apply in this case
        model.addAttribute("loginInfo", loginInfo);
        //could read from browser cookies and if present, auto redirect straight to next page
        //see https://www.logicbig.com/tutorials/spring-framework/spring-web-mvc/cookie-handling.html
        return "login";
    }

    @RequestMapping("/afterlogin")
    public String afterLogin(LoginInfo loginInfo)
    {
        System.out.println("afterLogin reached; info given is " + loginInfo);
        return "home";
    }

    @RequestMapping("/permissions")
    public String showPermissions()
    {
        return "permissions";
    }
}

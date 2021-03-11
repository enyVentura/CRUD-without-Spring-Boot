package com.controller;

import com.model.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class HomeController {

  /*  private UserService userService;
    private MessageSource messageSource;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }*/

   /* public HomeController() {
    }

    @Autowired
    public HomeController(UserService userService) {
        this.userService = userService;
    }*/


   // @RequestMapping(method = RequestMethod.GET)
  /* @GetMapping("/list")
    public String list(Model model){
        List<User> users=userService.findAll();
        model.addAttribute("users",users);
        return "list";
    }*/

    //@RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
    @GetMapping("/")
    public ModelAndView hello(HttpServletResponse response) throws IOException {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }






    /*@GetMapping("/")
    public String getIndex(){
        return "index";
    }*/

    @GetMapping("/welcome")
    public String getWelcome(){
        return "welcome";
    }
}

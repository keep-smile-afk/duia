package com.duia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.annotation.ModelAndViewResolver;

@Controller
public class UsersController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/new")
    public ModelAndView news(){
        ModelAndView mav = new ModelAndView ();
        mav.setViewName ("new");
        mav.addObject ("num",100);
        return mav;
    }
}

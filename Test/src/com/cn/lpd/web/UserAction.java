package com.cn.lpd.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cn.lpd.entity.User;
import com.cn.lpd.service.UserService;

@Controller  
@RequestMapping("/user")  
public class UserAction {
	
	@Resource 
    private UserService userService;  
      
    @RequestMapping(value="/showUser")  
    public Object toIndex(HttpServletRequest request){
    	ModelAndView model = new ModelAndView();
        int userId = Integer.parseInt(request.getParameter("id"));  
        User user = userService.findUserById(userId);  
        model.addObject("user", user);
        model.setViewName("showUser");
        return model;  
    }  
}

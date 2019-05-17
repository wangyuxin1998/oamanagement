package com.example.demo.controllers;

import com.example.demo.entity.User;
import com.example.demo.entity.UserChapter;
import com.example.demo.service.UsechapterService;
import com.example.demo.tools.Constans;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
public class UsechapterControllers {
    @Resource
    UsechapterService usechapterService;
    @RequestMapping("addUserChapter")
    public String addChapter(UserChapter userChapter, HttpSession session){
      User user=(User)session.getAttribute("name");
      User nextuser=(User)session.getAttribute("NextUser");
        userChapter.setUserID(user.getUserID());
        userChapter.setRequestTime(new Date());
        userChapter.setDepartmentID(user.getDepartmentID());
        userChapter.setState(Constans.STATE_APPROVAL);
        userChapter.setResonID(5);
        userChapter.setApprovaerID(nextuser.getUserID());
        return "chaptermanagement";
    }

}

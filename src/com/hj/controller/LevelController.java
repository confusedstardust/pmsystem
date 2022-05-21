package com.hj.controller;

import com.hj.pojo.Level;
import com.hj.service.LevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/level")
public class LevelController {
    @Autowired
    private LevelService levelService;
    @RequestMapping("/findlevelinfo")
    @ResponseBody
    public Level findLevel(int levelrank){
        return levelService.findLevelInfo(levelrank);
    }
}

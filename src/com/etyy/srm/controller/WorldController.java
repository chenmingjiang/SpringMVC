package com.etyy.srm.controller;

import com.etyy.srm.service.WorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by chenmingjiang on 2016/7/27.
 */
@Controller
@RequestMapping(value = "/user")
public class WorldController {

    @Autowired
    WorldService worldService;

    @RequestMapping(value = "/update")
    public String getUser(){
        return "success";
    }
}

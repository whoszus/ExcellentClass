package com.whoszus.controller;

import com.phn.model.UserEntity;
import com.phn.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by top on 2015/10/28.
 */

@Controller
@RequestMapping("/cc")
public class ControlTest {

    @Resource
    private IUserService userService;

    @ResponseBody
    @RequestMapping("gson")
    public List<UserEntity> gsonTest() {
        Map<String, String> map = new HashMap();

        List<UserEntity> list = userService.getoneUser();

//        Gson gson = new Gson();
        map.put("hello", "world");
        return list;
    }
}

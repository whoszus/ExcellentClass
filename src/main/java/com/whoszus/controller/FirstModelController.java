package com.whoszus.controller;

import com.whoszus.model.FirstModel.entity.ClassCatcher;
import com.whoszus.model.FirstModel.service.IFirstModelService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * Created by Administrator on 2015/10/29.
 */

@Controller
@RequestMapping("/first/")
public class FirstModelController {

    @Resource
    private IFirstModelService firstModelService;

    @RequestMapping("setCc")
    @ResponseBody
    public void hello(ClassCatcher cc) {

        String uuid = UUID.randomUUID().toString();
        cc.setUuid(uuid);
        System.out.println(cc);
        firstModelService.setCc(cc);
    }
}

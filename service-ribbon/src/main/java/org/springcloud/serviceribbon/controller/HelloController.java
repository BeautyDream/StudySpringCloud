package org.springcloud.serviceribbon.controller;

import org.springcloud.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: LiaoPeng
 * @Date: 2019/4/25
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/hi")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }

}

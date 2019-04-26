package org.springcloud.servicefeign.controller;

import org.springcloud.servicefeign.service.ServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: LiaoPeng
 * @Date: 2019/4/26
 */
@RestController
public class HiController {

    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
    @Autowired
    ServiceHi serviceHi;

    @GetMapping("/hi")
    public String sayHi(@RequestParam String name){
        return serviceHi.sayHiFromClientOne(name);
    }

}

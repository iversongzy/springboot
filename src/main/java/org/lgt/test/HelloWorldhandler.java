package org.lgt.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author liuguotai
 * @Date2021/2/2 0:01
 **/


//@Controller @ResponseBody
@RestController
public class HelloWorldhandler {
    //映射请求
    @RequestMapping("/hello")
    public String handler() {
        return "Hello Spring, My name is LiuGuotai!";
    }
}

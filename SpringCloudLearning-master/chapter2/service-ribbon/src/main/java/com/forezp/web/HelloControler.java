package com.forezp.web;

import com.forezp.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fangzhipeng on 2017/4/6.
 */
@RestController
public class HelloControler {

    static int connectNumber;

    protected static final Logger logger = LoggerFactory.getLogger(HelloControler.class);

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        connectNumber ++;
        logger.info("connectNumber ===> " + connectNumber);
        return helloService.hiService(name);
    }


}

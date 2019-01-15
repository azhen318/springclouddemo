package spring.cloud.serviceribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import spring.cloud.serviceribbon.service.HiService;

@RestController
public class HiController {

    @Autowired
    private HiService hiService;

    @GetMapping(value = "/hi")
    public String home(@RequestParam String name){
        return  hiService.hello(name);
    }

}

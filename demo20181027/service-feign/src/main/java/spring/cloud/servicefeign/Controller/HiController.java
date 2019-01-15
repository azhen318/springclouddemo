package spring.cloud.servicefeign.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import spring.cloud.servicefeign.Interface.HiInterface;

@RestController
public class HiController {

    @Autowired
    HiInterface hiInterface;

    @RequestMapping("hi")
    public String sayHi(@RequestParam String name){
        return hiInterface.getFromHiClient(name);
    }
}

package spring.cloud.servicefeign.Interface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spring.cloud.servicefeign.Impl.HiInterfaceImpl;

@FeignClient(value = "SERVICE-HI",fallback = HiInterfaceImpl.class)
public interface HiInterface {

    @RequestMapping(value = "hi")
    String getFromHiClient(@RequestParam(value = "name") String name);
}

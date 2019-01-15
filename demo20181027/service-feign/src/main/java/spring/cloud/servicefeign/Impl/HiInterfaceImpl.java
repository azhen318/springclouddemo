package spring.cloud.servicefeign.Impl;

import org.springframework.stereotype.Component;
import spring.cloud.servicefeign.Interface.HiInterface;

@Component
public class HiInterfaceImpl implements HiInterface {


    @Override
    public String getFromHiClient(String name) {
        return "sorry,"+name+",SERVICE-HI error。";
    }
}

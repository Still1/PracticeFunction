package com.oc.practicefunction.run;

import com.oc.practicefunction.RandomNumberService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class ConsumeTheService {
    public static void main(String[] args) {
        JaxWsProxyFactoryBean proxy = new JaxWsProxyFactoryBean();
        proxy.setAddress("http://localhost:8080/oc/getnumber");
        proxy.setServiceClass(RandomNumberService.class);
        RandomNumberService service = proxy.create(RandomNumberService.class);
        System.out.println(service.getARandomNumber());
    }
}

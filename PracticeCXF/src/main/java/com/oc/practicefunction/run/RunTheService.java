package com.oc.practicefunction.run;

import com.oc.practicefunction.impl.RandomNumberServiceImpl;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class RunTheService {
    public static void main(String[] args) {
        JaxWsServerFactoryBean server = new JaxWsServerFactoryBean();
        server.setAddress("http://localhost:8080/oc/getnumber");
        server.setServiceBean(new RandomNumberServiceImpl());
        server.create();
    }
}

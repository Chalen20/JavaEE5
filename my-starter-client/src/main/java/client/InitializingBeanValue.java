package client;

import org.springframework.beans.factory.InitializingBean;

public class InitializingBeanValue implements InitializingBean {

    @Override
    public void afterPropertiesSet() {
        System.out.println("InitializingBeanValue");
    }
}
package client;

import org.springframework.beans.factory.InitializingBean;

public class InitializingBeanCustom implements InitializingBean {

    @Override
    public void afterPropertiesSet() {
        System.out.println("InitializingBeanCustom");
    }
}
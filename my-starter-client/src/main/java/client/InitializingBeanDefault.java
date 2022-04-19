package client;

import org.springframework.beans.factory.InitializingBean;

public class InitializingBeanDefault implements InitializingBean {

    @Override
    public void afterPropertiesSet() {
        System.out.println("InitializingBeanDefault");
    }
}
package library;

import org.springframework.beans.factory.InitializingBean;

public class MyLibraryDefault implements MyLibraryInterface, InitializingBean {

    public void printInfo() {
        System.out.println("MyLibraryDefault.printInfo");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("MyLibraryDefault");
    }
}

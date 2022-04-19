package library;

import org.springframework.beans.factory.InitializingBean;

public class MyLibraryAdmin implements MyLibraryInterface, InitializingBean {

    public void printInfo() {
        System.out.println("MyLibraryAdmin.printInfo");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("MyLibraryAdmin");
    }
}

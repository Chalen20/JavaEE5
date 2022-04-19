package library;


import org.springframework.beans.factory.InitializingBean;

public class MyLibraryCustom implements MyLibraryInterface, InitializingBean {

    public void printInfo() {
        System.out.println("MyLibraryCustom.printInfo");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("MyLibraryCustom");
    }
}

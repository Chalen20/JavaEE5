package client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyStarterClient {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(MyStarterClient.class, args);
//        MyLibraryCustom myLibraryClassByClass = applicationContext.getBean(MyLibraryCustom.class);
//        myLibraryClassByClass.printInfo();
//
//        MyLibraryDefault myLibraryDefaultByClass = applicationContext.getBean(MyLibraryDefault.class);
//        myLibraryDefaultByClass.printInfo();

//        MyLibraryClass myLibraryClass = (MyLibraryClass) applicationContext.getBean("myLibraryClass");
//        myLibraryClass.printInfo();
    }
}

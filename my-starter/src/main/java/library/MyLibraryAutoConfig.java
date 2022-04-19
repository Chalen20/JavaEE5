package library;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyLibraryAutoConfig {

    @Bean
    @ConditionalOnProperty(value = "my.property", havingValue = "custom")
    MyLibraryInterface custom() {
        return new MyLibraryCustom();
    }

    @Bean
    @ConditionalOnProperty(value = "my.property", havingValue = "default", matchIfMissing = true)
    MyLibraryInterface defaultComponent() {
        return new MyLibraryDefault();
    }

    @Bean
    @ConditionalOnProperty(value = "my.property", havingValue = "admin")
    MyLibraryInterface admin() {
        return new MyLibraryDefault();
    }

//    @Bean
//    MyLibraryClass myLibraryClass(){
//        return new MyLibraryClass();
//    }
}

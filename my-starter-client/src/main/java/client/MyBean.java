package client;

import library.MyLibraryAutoConfig;
import library.MyLibraryCustom;
import library.MyLibraryDefault;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@AutoConfigureAfter(MyLibraryAutoConfig.class)
public class MyBean {

    @Bean
    @ConditionalOnBean(name = "custom")
    InitializingBeanCustom initializingBeanCustom(){
        return new InitializingBeanCustom();
    }

    @Bean
    @ConditionalOnMissingBean(name = "defaultComponent")
    InitializingBeanDefault initializingBeanDefault(){
        return new InitializingBeanDefault();
    }

    @Bean
    @ConditionalOnMissingBean(name = "custom")
    InitializingBeanValue initializingBeanValue(){
        return new InitializingBeanValue();
    }

}

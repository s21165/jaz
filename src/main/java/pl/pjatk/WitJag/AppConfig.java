package pl.pjatk.WitJag;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public Pojo pojo() {
        System.out.println("Hello from Pojo");
        return new Pojo("pojo1", 11);

    }

    @Bean
    public List<String> defaultData() {
        return List.of("1", "2", "3", "4", "5");
    }



}

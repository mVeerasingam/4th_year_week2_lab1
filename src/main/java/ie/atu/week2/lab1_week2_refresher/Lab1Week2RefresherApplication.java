package ie.atu.week2.lab1_week2_refresher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Lab1Week2RefresherApplication {
    public static void main(String[] args) {
        SpringApplication.run(Lab1Week2RefresherApplication.class, args);
    }

}

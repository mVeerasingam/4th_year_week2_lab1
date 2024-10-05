package ie.atu.week2.lab1_week2_refresher;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "notification-service", url = "http://localhost:8081")
public interface ProductClient {
}

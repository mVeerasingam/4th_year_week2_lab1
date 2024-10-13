package ie.atu.week2.lab1_week2_refresher;

import ie.atu.week2.lab1_week2_refresher.notificationRequest.NotificationRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "notification-service", url = "http://notification-service:8081")
public interface ProductClient {
    @PostMapping("/notifications/notify")
    String sendNotification(@RequestBody NotificationRequest notificationRequest);
}

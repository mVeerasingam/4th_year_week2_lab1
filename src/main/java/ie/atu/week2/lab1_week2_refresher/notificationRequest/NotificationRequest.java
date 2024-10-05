package ie.atu.week2.lab1_week2_refresher.notificationRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationRequest {
    private String action; // i.e. created/deleted/updated
    private String entityName; // in this case it is product
    private long entityId; // in this case it is the product ID
}

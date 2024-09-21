package ie.atu.week2.lab1_week2_refresher.excpetions;

import lombok.Data;

@Data
public class ErrorObject {
    private Integer statusCode;
    private String message;
    private Data timestamp;
}

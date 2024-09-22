package ie.atu.week2.lab1_week2_refresher.excpetions;

public class ProductValidationException extends RuntimeException{
    public ProductValidationException(String message){
        super(message);
    }
}

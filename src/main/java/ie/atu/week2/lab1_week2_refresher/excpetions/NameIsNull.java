package ie.atu.week2.lab1_week2_refresher.excpetions;

public class NameIsNull extends RuntimeException{
    private static final long serialVersionUID = 1;

    public NameIsNull(String message){
        super(message);
    }
}

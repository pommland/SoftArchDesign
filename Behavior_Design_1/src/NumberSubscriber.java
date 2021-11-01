import java.util.concurrent.Flow;



public class NumberSubscriber extends StringSubscriber{


    NumberSubscriber(){
        super.check = ".*[0-9].*";
    }
}

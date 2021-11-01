import java.util.concurrent.Flow;

public class AlphabetSubscriber extends StringSubscriber {
    AlphabetSubscriber(){
        super.check = ".*[a-zA-Z].*" ;
    }



}

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.concurrent.Flow;
import java.util.regex.Pattern;

public class AlphabetSubscriber extends StringSubscriber {
    AlphabetSubscriber(){
        super.check = ".*[a-zA-Z].*" ;

    }



    @Override
    public void onNext(String item){
        super.filename = "Alphabet";
       super.onNext(item);
    }



}

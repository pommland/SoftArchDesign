import java.util.concurrent.Flow;
import java.util.regex.Pattern;




public class SymbolSubscriber  extends StringSubscriber{
    SymbolSubscriber(){
        super.check = "[^a-zA-Z0-9.](.*)";


    }
    @Override
    public void onNext(String item){
        super.filename = "Symbol";
        super.onNext(item);
    }
}

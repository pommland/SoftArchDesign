import java.util.concurrent.Flow;



public class SymbolSubscriber  extends StringSubscriber{
    SymbolSubscriber(){
        super.check = "[a-zA-Z0-9.]*";
    }
}

import java.util.concurrent.Flow;



public class NumberSubscriber extends StringSubscriber{


    NumberSubscriber(){
        super.check = ".*[0-9].*";
    }


    @Override
    public void onNext(String item){
        super.filename = "Number";
        super.onNext(item);
    }
}

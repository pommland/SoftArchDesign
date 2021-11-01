import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.concurrent.Flow;

public abstract class StringSubscriber implements Flow.Subscriber<String> {
    private Flow.Subscription subscription;
    private String filename ;
    protected String check;



    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
    }

    @Override
    public void onNext(String item){
       if (item.matches(check)){
           try {
               Writer file = new FileWriter(filename + ".txt", true);
               file.write(item + "\n");
               file.close();
           } catch (IOException e) {
               e.printStackTrace();
           }
       }
    }
    @Override
    public void onError(Throwable exception) {
        exception.printStackTrace();
    }
    @Override
    public void onComplete() {
        System.out.println("Complete!");
    }


//    public abstract boolean check(String item);
}

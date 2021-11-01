import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.concurrent.Flow;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public abstract class StringSubscriber implements Flow.Subscriber<String> {
    private Flow.Subscription subscription;
    protected String filename ;
    protected String check;
    protected Matcher pattern;



    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
    }

    @Override
    public void onNext(String item){
        pattern =  Pattern.compile(check).matcher(item);
       if (pattern.find()){
           try {
               Writer file = new FileWriter(this.filename + ".txt", true);
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

}

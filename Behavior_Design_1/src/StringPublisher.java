
import java.util.LinkedList;
import java.util.concurrent.Flow;

public  class StringPublisher implements Flow.Publisher {

    private LinkedList<Flow.Subscriber> subscribers;

    StringPublisher(){
        this.subscribers = new LinkedList<Flow.Subscriber>();
    }

    public void subscribe(Flow.Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }



    public void publish(String item) {
        for (Flow.Subscriber subscriber: subscribers){

                subscriber.onNext(item);

        }

    }



}

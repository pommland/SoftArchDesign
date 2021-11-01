public class Main {

    public static void main(String[] args) {
        StringPublisher publisher = new StringPublisher();
        StringSubscriber alphabetSubscriber = new AlphabetSubscriber();
        StringSubscriber numberSubscriber = new NumberSubscriber();
        StringSubscriber symbolSubscriber = new SymbolSubscriber();

        publisher.subscribe(alphabetSubscriber);
        publisher.subscribe(numberSubscriber);
        publisher.subscribe(symbolSubscriber);

        String stringList[] = { "28594", "123ggEz", "old!?????", "COVID-19", "??", "Pomeranian"};
        for (String s : stringList) {
            publisher.publish(s);
        }


    }
}

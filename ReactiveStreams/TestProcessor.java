import java.util.concurrent.SubmissionPublisher;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;
import java.lang.Thread;

class PrintSubscriber implements Subscriber<Integer> {
    private Subscription subscription;
    @Override
    public void onSubscribe(Subscription subscription) {
        this.subscription = subscription;
        subscription.request(1);
    }
    @Override
    public void onNext(Integer item) {
        System.out.println("Received item: " + item);
        subscription.request(1);
    }
    @Override
    public void onError(Throwable error) {
        System.out.println("Error occurred: " + error.getMessage());
    }
    @Override
    public void onComplete() {
        System.out.println("PrintSubscriber is complete");
    }
}

class PlusTenProcessor extends SubmissionPublisher<Integer> implements Subscriber<Integer> {
    private Subscription subscription;
    @Override
    public void onSubscribe(Subscription subscription) {
        this.subscription = subscription;
        subscription.request(1);
    }
    @Override
    public void onNext(Integer item) {
        submit(item + 10);
        subscription.request(1);
    }
    @Override
    public void onError(Throwable error) {
        error.printStackTrace();
        closeExceptionally(error);
    }
    @Override
    public void onComplete() {
        System.out.println("PlusTenProcessor completed");
        close();
    }
}

public class TestProcessor {
    public static void main(String... args) throws InterruptedException {
        SubmissionPublisher<Integer> publisher = new SubmissionPublisher<>();
        PlusTenProcessor processor = new PlusTenProcessor();
        PrintSubscriber subscriber = new PrintSubscriber();
        publisher.subscribe(processor);
        processor.subscribe(subscriber);
        System.out.println("Submitting items...");
        for (int i = 0; i < 10; i++) {
            publisher.submit(i);
        }
        try {
            Thread.sleep(1000);
        } catch (Exception ex) {
            System.out.println("Thread exception: " + ex);
        }
        publisher.close();
    }
}
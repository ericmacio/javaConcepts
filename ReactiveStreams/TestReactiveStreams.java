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

public class TestReactiveStreams {
  public static void main(final String[] args) {
    SubmissionPublisher<Integer> publisher = new SubmissionPublisher<>();
    publisher.subscribe(new PrintSubscriber());
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
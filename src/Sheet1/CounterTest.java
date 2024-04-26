package Sheet1;
import Sheet1.Counter;

public class CounterTest {
    public static void main(String[] args) {
        Counter counter = new Counter();
        for (int i = 0; i < 10; i++) {
            counter.increment();
            System.out.println("Incremented: "+ counter.get());
            counter.decrement();
            System.out.println("Decremented: " + counter.get());
        }
    }

}

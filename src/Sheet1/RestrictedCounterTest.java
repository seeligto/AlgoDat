package Sheet1;
import Sheet1.RestrictedCounter;

public class RestrictedCounterTest {
    public static void main(String[] args) {
        RestrictedCounter counter = new RestrictedCounter(5);
        for (int i = 0; i < 20; i++) {
            counter.increment();
            System.out.println(STR."Counter: \{counter.get()} (Free Capacity: \{counter.freeCapacity()})");
        }
        for (int i = 0; i < 20; i++) {
            counter.decrement();
            System.out.println(STR."Counter: \{counter.get()} (Free Capacity: \{counter.freeCapacity()})");
        }
    }
}

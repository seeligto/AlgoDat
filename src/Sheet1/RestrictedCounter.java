package Sheet1;
import Sheet1.Counter;
public class RestrictedCounter extends Counter {
    private int capacity;
    public RestrictedCounter(int maxCapacity) {
        super();
        capacity = maxCapacity;

    }
    public void increment() {
        if (freeCapacity() > 0) {
            super.increment();
        }else{
            System.out.println("Capacity reached");
        }
    }
    public int freeCapacity() {
        return capacity - super.get();
    }
}

package Sheet2;
public class Bruch {
    private long numerator;
    private long denominator;

    // Constructor
    public Bruch(long numerator, long denominator) {
        this.numerator = numerator / ggt(numerator, denominator);
        this.denominator = denominator / ggt(numerator, denominator);
    }
    // add method, adds two fractions and automatically simplifies the result
    public void add(Bruch b) {
        long zaehler = this.numerator * b.denominator + b.numerator * this.denominator;
        long nenner = this.denominator * b.denominator;
        long ggt = ggt(zaehler, nenner);
        this.numerator = zaehler / ggt;
        this.denominator = nenner / ggt;
    }
    // returns the fraction as a string in the format "numerator/denominator"
    public String get() {
        return STR."\{this.numerator}/\{this.denominator}";
    }
    public long ggt(long a, long b){
        if (b > a)
            return this.ggt(b, a);
        else
            return ( (b==0) ? a : this.ggt(b, a %b) );
    }
    // method to approximate euler's number e with n iterations
    Bruch e(long n){
        Bruch result = new Bruch(1, 1);
        for (int i = 1; i < n; i++) {
            Bruch tmp = new Bruch(1, factorial(i));
            result.add(tmp);
        }
        return result;
    }
    // easy recursive factorial function
    private long factorial(long n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public long getNumerator() {
        return this.numerator;
    }
    public long getDenominator() {
        return this.denominator;
    }
}
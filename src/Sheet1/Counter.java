package Sheet1;
// in terminal: go to dir
// dir>         javac <FileName>.java
//dir>          C:\Users\SEELTODE\.jdks\openjdk-22\bin\java.exe <FileName> <Arg1> <Arg2> ...
public class Counter {
    private int zaehlerStand;

    private int savedZaehlerStand;

    public int get(){ return zaehlerStand; }

    public void reset(){ zaehlerStand = 0; }

    public Counter() { zaehlerStand = 0; }

    public void increment() { zaehlerStand++; }
    // Aufgabe 2
    public void decrement(){
        if(zaehlerStand > 0) {
            zaehlerStand--;
        }
    }

    public void save() {
        savedZaehlerStand = zaehlerStand;
    }

    public int restore() {
        // 0 is the standard value for an int
        if(savedZaehlerStand == 0) {
            System.err.println("No saved value found");
            return -1;
        }
        zaehlerStand = savedZaehlerStand;
        return 0;
    }
}

package Sheet3;

public class Textanalyse {
    public static void main (String[] args) {
        // print argv -> arg-count
        System.out.println(STR."Anzahl Argumente: \{args.length}");
        // Gebe länge von jedem einzelnen Arg aus
        for (int i = 0; i < args.length; i++) {
            System.out.println(STR."Argument \{i}: \{args[i]} mit Länge \{args[i].length()}");
        }
        int counts[] = countChars(args);
        // Ausgabe:
        // iteriere durch counts und gebe alle chars aus, die mindestens einmal vorkommen
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.print(STR."'\{(char) i}': \{counts[i]}x \t");
            }
        }
    }

    private static int[] countChars(String[] args){
        // Array von 256 chars, da ASCII 256 chars hat
        int[] counts = new int[256];

        // iteriere durch array von args
        for (String arg : args) {
            // iteriere durch string von args
            // und erhöhe den count für jedes vorkommen eines chars
            for (int i = 0; i < arg.length(); i++) {
                char c = arg.charAt(i);
                counts[toUpper(c)]++;
            }
        }
        return counts;
    }
    // works only for standard ASCII
    private static char toUpper(char c){
        if ('z' >= c && c >= 'a') {
            return (char) (c - ('a' - 'A'));
        }
        return c;
    }
}

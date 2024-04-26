package uebungenInVorlesung;

public class Hund {
    private String name;
    private int alter;
    private String rasse;

    public Hund(String name, int alter, String rasse) {
        this.name = name;
        this.alter = alter;
        this.rasse = rasse;
    }

    public void bellen() {
        System.out.println("Wuff Wuff");
    }

    public String getName() {
        return name;
    }
    public String getRasse() {
        return rasse;
    }
}

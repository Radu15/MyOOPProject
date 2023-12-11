public class Elev {
    static String diriginte = "Pop";
    String nume;

    public Elev(String nume) {
        this.nume = nume;
    }

    public static void metodaNonStatica() {
        System.out.println("metoda non statica");
    }

    public static void metodaStatica() {
        System.out.println("metoda statica");
    }

    public void metodastatica() {
        System.out.println("metoda statica");
    }


}

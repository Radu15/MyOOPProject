abstract class Sportiv {
    String tara;
    String sport;
    Abilitate abilitate;
    abstract void seAntreneaza();// nuare continut{}

    public void seOdihneste() {
        System.out.println("Sportivul se odihneste");
    }

    public Sportiv(String tara, String sport) {
        this.tara = tara;
    }
}

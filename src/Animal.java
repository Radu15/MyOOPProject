abstract class Animal1 {
    String nume;
    String culoare;
    boolean vegetarian;

    public Animal1() {
        nume = "unknown";
        culoare = "unknown";
        vegetarian = false;
    }

    public Animal1(String nume, String culoare, boolean vegetarian) {
        this.nume = nume;
        this.culoare = culoare;
        this.vegetarian = vegetarian;
    }

    void Animal1(String nume) {
        this.nume = nume;
    }

    void Animal1(String nume, String culoare) {
        this.nume = nume;
        this.culoare = culoare;
    }

    void mananca() {
        System.out.println(nume + " mananca");
    }

    public void doarme(){
        System.out.println(nume + " doarme");
    }
    public String afiseaza(){
        return nume+ " are culoarea "+ culoare;
    }

    public void scoateSunet() {
        System.out.println(nume + "scoateSunete");

    }

    public void miauna() {
        System.out.println(nume + "miauna");
    }


    abstract void scoateSunete();

}

public class Main {
    public static void main(String[] args) {
        Carte carte1 = new Carte();
        carte1.autor = "Mihai Eminescu";
        carte1.titlu = "Poezii";
        carte1.pret = 35;


        Carte carte2 = new Carte();
        carte2.autor = "Ion Creanga";
        carte2.titlu = "Amintiri din copilarie";



        System.out.println(carte1.getPret());
        System.out.println(carte1.afiseaza());

        System.out.println(carte2.getPret());
        System.out.println(carte2.afiseaza());

        carte1.titlu = "Basme"; // suprascriere
        System.out.println(carte1.afiseaza());

        Masina masina1 = new Masina();
        Masina masina2 = new Masina();
        System.out.println(masina1.marca);

        masina2.marca = "Dacia";
        System.out.println(masina2.marca);

// ------Exercitiu -------------------------

        Masina masina3 = new Masina();
        masina3.anFabricatie = 2010;

        Masina masina4 = new Masina();
        masina4.anFabricatie = 2020;

        System.out.println(masina3.getAnFabricatie());
        System.out.println(masina4.getAnFabricatie());

// ------- cu constructor -----------
        Persoana persoana1 = new Persoana();

        System.out.println(persoana1.nume);
        System.out.println(persoana1.prenume);

        Persoana persoana2 = new Persoana("Ion", "Popescu");
        System.out.println(persoana2.nume + persoana2.varsta + persoana2.sex);

        Persoana persoana3 = new Persoana(24,"M","Ionescu");
        System.out.println("Nume: "+ persoana3.nume);
        System.out.println("Varsta: "+ persoana3.varsta);
        System.out.println("Sex: "+ persoana3.sex);

        // Exercitii OOP


        //Animal1 caine= new Animal1("Rex","neagra",false);

        //Animal1 urs = new Animal1("Barny", "albastra", false);


        //caine.mananca();
        //caine.doarme();
        //System.out.println(caine.afiseaza());

        ///urs.mananca();
        //urs.doarme();
        //System.out.println(urs.afiseaza());

        //  masina masina5=new masina();
        //   System.out.println(masina5.marca);

        //  masina masina6=new masina("tesla",2022);
        //   System.out.println(masina6.marca+" ")
        Elev elev1 = new Elev("Ionescu");
        Elev elev2 = new Elev("Popescu");
        System.out.println(elev1.nume);
        System.out.println(elev2.nume);
        Elev.diriginte = "Pop";
        System.out.println(Elev.diriginte);

        elev1.metodastatica();
        Elev.metodaStatica();

        Film film1 = new Film();
        film1.setTitlu("Titanic");
        System.out.println(film1.getTitlu());

        Inotator inotator1 = new Inotator();
        inotator1.seAntreneaza();
        inotator1.seOdihneste();

        Mamifer mamifer1 = new Mamifer();
        mamifer1.scoateSunete();


        Maratonist maratonist1 = new Maratonist();
        maratonist1.seAntreneaza();
        maratonist1.seOdihneste();

        System.out.println("ex3");

        Caine caine1 = new Caine();
        caine1.scoateSunete();


        Pisica pisica1 = new Pisica();
        pisica1.scoateSunete();



    }
}
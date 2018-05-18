public class Main {
    public static void main(String[] args) {
        Buschauffeur chauffeur = new Buschauffeur("Kees");

        //bus
        Bus bus = new Bus(chauffeur);

        //bushalte 1
        Schoolkind kwik = new Schoolkind("kwik");
        Schoolkind kwek = new Schoolkind("kwek");
        Schoolkind kwak = new Schoolkind("kwak");

        System.out.println(bus);
        bus.instappen(kwik, kwek, kwak);
        System.out.println(bus);

        //bushalte 2
        Schoolkind donald = new Schoolkind("donald");
        bus.instappen(donald);
        System.out.println(bus);

        //bushalte 3
        OudeMeneer dagobert = new OudeMeneer("dagobert");
        bus.instappen(dagobert);
        System.out.println(bus);

        //bushalte 4
        Nameable uitgestapt = bus.uitstappen("kwik");
        System.out.println(bus);

//        bushalte 4
        Hond loebas = new Hond("loebas");
        bus.instappen(loebas);
        bus.info();

        bus.printNames();

        BusStation vlissingen = new BusStation();
        vlissingen.rijdtBinnen(bus);
//
//        bus.info();
//        bus.printNames();

    }
}

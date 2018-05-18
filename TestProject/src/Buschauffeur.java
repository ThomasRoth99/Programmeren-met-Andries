public class Buschauffeur {

    private String name;

    public Buschauffeur(String name){
        this.name = name;
    }

    public boolean zoekVerschillen(Hond hond, Kat kat){
        return hond.equals(kat);
    }

    public boolean vergelijkHonden(Hond hond, Hond hond2){
        return (hond == hond2);
    }
}

import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;


public class Bus {

    private Buschauffeur chauffeur;
    private HashMap<String, Nameable> stoelen = new LinkedHashMap<String, Nameable>();

    public Bus(Buschauffeur chauffeur){
        this.chauffeur = chauffeur;
    }

    public void instappen(Nameable nameable1, Nameable nameable2,
                          Nameable nameable3) {
        instappen(nameable1);
        instappen(nameable2);
        instappen(nameable3);
    }


    public void instappen(Nameable nameable) {
        String key = nameable.getName();
        Nameable value = nameable;
        this.stoelen.put(key, value);
        showInfo(nameable, " is ingestapt.");
    }


    private int getCount() {
        return stoelen.size();
    }

    private void showInfo(Nameable uitgestapte, String actie) {
        System.out.println(uitgestapte.getName() + actie);
    }

    public Nameable uitstappen(String name) {

        if (!stoelen.containsKey(name)) {
            System.out.println(name + " zit niet in de bus.");
            return null;
        }
        Nameable uitgestapte = stoelen.get(name);
        stoelen.remove(name);
        showInfo(uitgestapte, " is uitgestapt.");
        return uitgestapte;
    }

    public void info() {
        System.out.println(this);
    }

    public String toString() {
        return "Er zitten "+getCount()+" wezens in de bus.";
    }

    public String[] getNames() {
        String[] names = new String[getCount()];
        int i = 0;
        for ( String key : stoelen.keySet()){

            names[i] = key;
            i++;
        }
        return names;
    }

    public void printNames() {
        System.out.println("Deze wezens zitten in de bus:");
        for(Map.Entry<String, Nameable> entry : stoelen.entrySet()) {
            String key = entry.getKey();
            System.out.println("- "+key);
        }
    }

}

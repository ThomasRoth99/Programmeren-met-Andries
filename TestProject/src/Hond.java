public class Hond implements Nameable{

    private boolean head = true;
    private boolean tail = true;
    private String name;

    public Hond(String name){
        this.name = name;
    }

    public boolean hasHead(){
        return this.head;
    }

    public boolean hasTail(){
        return this.tail;
    }


    public boolean equals(Kat kat){

        boolean zijnHoofdenGelijk = kat.hasHead() == this.hasHead();
        boolean zijnStaartenGelijk = (kat.hasTail() == this.hasTail());
        return zijnHoofdenGelijk && zijnStaartenGelijk;
    }

    public String getName(){
        return this.name;
    }
}

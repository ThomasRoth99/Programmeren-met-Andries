import java.util.Stack;

public class BusStation {

    private Stack<Nameable> perron = new Stack<Nameable>();

    public void rijdtBinnen(Bus bus) {
        leegBus(bus);
        vulBus(bus);
    }

    private void leegBus(Bus bus) {

        for(String name : bus.getNames()) {
            Nameable uitgestapte = bus.uitstappen(name);
            perron.push(uitgestapte);
        }
    }

    private void vulBus(Bus bus) {
        while(!perron.isEmpty()) {
            Nameable opgestapelde = perron.pop();
            bus.instappen(opgestapelde);
        }
    }
}

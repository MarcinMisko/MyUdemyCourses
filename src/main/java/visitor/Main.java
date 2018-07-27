package visitor;

import java.util.Arrays;
import java.util.List;
import visitor.transport.Animal;
import visitor.transport.Person;
import visitor.transport.Shipment;
import visitor.transport.Transportable;
import visitor.visitor.NameTransportVisitor;
import visitor.visitor.PriceTransportVisitor;



public class Main {
    public static void main(String[] args) {
        Person person = new Person("Stephen", "Hawking", true);
        Animal animal = new Animal("Tyranosaurus Rex", 9000);
        Shipment shipment = new Shipment("PL", "007", true);
        List<Transportable> transportableList = Arrays.asList(person, animal, shipment);

        NameTransportVisitor nameTransportVisitor = new NameTransportVisitor();
        transportableList.forEach(transportable -> transportable.accept(nameTransportVisitor));

        System.out.println("-----------------------------------");

        PriceTransportVisitor priceTransportVisitor = new PriceTransportVisitor();

        transportableList.forEach(transportable -> transportable.accept(priceTransportVisitor));
    }
}

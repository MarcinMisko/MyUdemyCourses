package visitor.visitor;

import visitor.transport.Animal;
import visitor.transport.Person;
import visitor.transport.Shipment;

public class NameTransportVisitor implements TransportVisitor {
    TransportVisitor transportVisitor;

    @Override
    public void visit(Animal animal) {
        System.out.println(animal.getKind());
    }

    @Override
    public void visit(Person person) {
        System.out.println(person.getFirstName() + person.getLastName());
    }

    @Override
    public void visit(Shipment shipment) {
        System.out.println(shipment.getPrefix() + shipment.getSerialNumber());
    }
}

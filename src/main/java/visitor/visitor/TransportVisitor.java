package visitor.visitor;

import visitor.transport.Animal;
import visitor.transport.Person;
import visitor.transport.Shipment;

public interface TransportVisitor {
    void visit(Animal animal);

    void visit(Person person);

    void visit(Shipment shipment);
}

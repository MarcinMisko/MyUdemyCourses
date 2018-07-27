package visitor.visitor;

import visitor.transport.Animal;
import visitor.transport.Person;
import visitor.transport.Shipment;

public class PriceTransportVisitor implements TransportVisitor {
    PriceTransportVisitor priceTransportVisitor;

    @Override
    public void visit(Animal animal) {
        System.out.println("Price per kilometer for a person: " + animal.getWeight() * 0.2 + "PLN");
    }

    @Override
    public void visit(Person person) {
        int price = 6;
        if (person.isRegularCustomer()) {
            price = price / 2;
        }
        System.out.println("Price per kilometer for a person: "
                + price + " PLN");
    }

    @Override
    public void visit(Shipment shipment) {
        int price = 2;
        if (shipment.isLarge()) {
            price = price * 3;
        }
        System.out.println("Price per kilometer for a shipment: " + price + "PLN");
    }
}

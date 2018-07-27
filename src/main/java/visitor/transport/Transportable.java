package visitor.transport;

import visitor.visitor.TransportVisitor;

public interface Transportable {
    void accept(TransportVisitor transportVisitor);
}

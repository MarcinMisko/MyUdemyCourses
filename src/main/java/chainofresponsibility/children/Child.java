package chainofresponsibility.children;

import chainofresponsibility.request.MotherRequest;

abstract public class Child {

    private Child tallerChild;

    public void processRequest(MotherRequest motherRequest) {
    }

    public Child getTallerChild() {
        return tallerChild;
    }

    public void setTallerChild(Child tallerChild) {
        this.tallerChild = tallerChild;
    }
}

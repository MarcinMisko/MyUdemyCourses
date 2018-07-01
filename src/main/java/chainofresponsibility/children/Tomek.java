package chainofresponsibility.children;

import chainofresponsibility.request.MotherRequest;

public class Tomek extends Child {

    public Tomek() {
    }

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.HIGH)) {
            System.out.println("Tomek removed the jar from the shelf!");
        } else {
            getTallerChild().processRequest(motherRequest);
        }
    }
}

package chainofresponsibility.children;

import chainofresponsibility.request.MotherRequest;

public class Antek extends Child {

    public Antek() {
    }

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.LOW)) {
            System.out.println("Antek removed the jar from the shelf!");
        } else {
            getTallerChild().processRequest(motherRequest);
        }
    }
}

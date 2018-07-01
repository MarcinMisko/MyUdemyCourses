package chainofresponsibility.children;

import chainofresponsibility.request.MotherRequest;

public class Ania extends Child {

    public Ania() {
    }

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.MEDIUM)) {
            System.out.println("Ania removed the jar from the shelf!");
        } else {
            getTallerChild().processRequest(motherRequest);
        }
    }
}

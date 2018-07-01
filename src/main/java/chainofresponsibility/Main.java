package chainofresponsibility;

import chainofresponsibility.children.*;
import chainofresponsibility.request.MotherRequest;

public class Main {
    public static void main(String[] args) {
        MotherRequest motherRequest = new MotherRequest(Shelf.HIGH);
        Child tomek = new Tomek();
        Child ania = new Ania();
        Child antek = new Antek();
        antek.setTallerChild(ania);
        ania.setTallerChild(tomek);
        tomek.processRequest(motherRequest);
    }
}

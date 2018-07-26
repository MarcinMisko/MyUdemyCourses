package memento.operatingsystem;

public class OperatingSystemCaretaker {
    private OperatingSystemMemento operatingSystemMemento;


    public void addMemento(OperatingSystemMemento operatingSystemMemento) {
        this.operatingSystemMemento = operatingSystemMemento;
        System.out.println("Added backup number: " + operatingSystemMemento.getBackupNumer() + " with date: " + operatingSystemMemento.getBackupDate());
    }

    public OperatingSystemMemento getMemento() {
        System.out.println("Loaded backup with number: " + operatingSystemMemento.getBackupNumer() + " with date: " + operatingSystemMemento.getBackupDate());
        return operatingSystemMemento;
    }
}

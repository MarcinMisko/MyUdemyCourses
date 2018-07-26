package memento.operatingsystem;

import java.util.Date;

public class OperatingSystem {
    private int backupNumer = 0;
    private Date backupDate;

    public void createBackup() {
        this.backupNumer++;
        this.backupDate = new Date();
        System.out.println("Created backup number: " + this.backupNumer + " with date: " + this.backupDate);
    }

    public OperatingSystemMemento save() {
        return new OperatingSystemMemento(this.backupNumer, this.backupDate);
    }

    public void load(OperatingSystemMemento operatingSystemMemento) {
        this.backupNumer = operatingSystemMemento.getBackupNumer();
        this.backupDate = operatingSystemMemento.getBackupDate();
    }
}

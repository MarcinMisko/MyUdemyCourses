package memento.operatingsystem;

import java.util.Date;

class OperatingSystemMemento {
    private int backupNumer;
    private Date backupDate;

    OperatingSystemMemento(int backupNumer, Date backupDate) {
        this.backupNumer = backupNumer;
        this.backupDate = backupDate;
    }

    int getBackupNumer() {
        return backupNumer;
    }

    Date getBackupDate() {
        return backupDate;
    }
}

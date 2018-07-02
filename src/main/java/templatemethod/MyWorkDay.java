package templatemethod;

public class MyWorkDay extends WorkDay {
    @Override
    protected void work() {
        System.out.println("Work, work, work!");
    }

    @Override
    public int goToWork(TypeOfTranssport transportType) {
        switch (transportType) {
            case BIKE:
                return 45;
            case TRAM:
                return 30;
            case CAR:
                return 20;
            default:
                return 25;
        }
    }
}

package templatemethod;

public abstract class WorkDay {
    public final void weekDaySchedule(TypeOfTranssport typeOfTranssport) {
        wakeUp();
        getReady();
        int time = goToWork(typeOfTranssport);
        summary(time);
        work();
        goHome();
    }

    private void wakeUp() {
        System.out.println("Wake up!");
    }

    private void getReady() {
        System.out.println("Ready to go");
    }

    public abstract int goToWork(TypeOfTranssport transportType);


    protected void summary(int time) {
        System.out.println("Travel to work occured " + time + " minutes");
    }

    protected abstract void work();


    private void goHome() {
        System.out.println("ET go home!");
    }


}

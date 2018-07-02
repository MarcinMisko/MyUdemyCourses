package templatemethod;

public class Main {
    public static void main(String[] args) {
        WorkDay monday = new MyWorkDay();
        monday.weekDaySchedule(TypeOfTranssport.CAR);
        WorkDay tuesday = new MyWorkDay();
        tuesday.weekDaySchedule(TypeOfTranssport.BIKE);
    }
}

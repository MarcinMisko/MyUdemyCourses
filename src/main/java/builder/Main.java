package builder;

public class Main {
    public static void main(String[] args) {
        FlightLeg leg = new FlightLeg.FlightLegBuilder("Warsaw", "Moscow").buildPrice(100).build();

        System.out.println(leg);
    }
}

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Rule> rules = new ArrayList<>();

        rules.add(new SeatbeltRule());
        rules.add(new TruckSpeedRule());
        rules.add(new PrivateSpeedRule());

        Radar radar = new Radar(rules);

        Car car = new Car(
                "ABC123",
                LocalDate.now(),
                70,
                true,
                CarType.PRIVATE);

        Fine fine = radar.check(car);
        System.out.println("Traffic fine for car " + fine.getPlateNumber());
        System.out.println("Total Fine: " + fine.getTotalAmount() + " EGP");
        System.out.println("Violations:");

        for (Violation violation : fine.getViolations()) {
            System.out.println(
                    violation.getDescription() +
                            " : " +
                            violation.getAmount() +
                            " EGP");
        }
        if (fine.getViolations().isEmpty()) {
            System.out.println("Car doesn't have violations!");

        }
    }

}

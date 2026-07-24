
public class TruckSpeedRule implements Rule {

    @Override
    public Violation check(Car car) {
        if (car.getType() == CarType.TRUCK && car.getSpeed() > 60) {
            return new Violation(
                    "Speed exceeded max allowed 60",
                    300);
        }

        return null;
    }

}
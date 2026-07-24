public class PrivateSpeedRule implements Rule {
    @Override

    public Violation check(Car car) {

        if (car.getType() == CarType.PRIVATE && car.getSpeed() > 80) {
            return new Violation(
                    "Speed exceeded max allowed 80",
                    300);
        }
        return null;
    }
}
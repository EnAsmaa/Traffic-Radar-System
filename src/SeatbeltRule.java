public class SeatbeltRule implements Rule {

    @Override

    public Violation check(Car car) {
        if (!car.IsSeatbelt()) {
            return new Violation("Seatbelt not fastened", 100);
        }
        return null;

    }

}
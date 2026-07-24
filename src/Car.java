import java.time.LocalDate;

public class Car {

    private CarType type;
    private String plate;
    private LocalDate date;
    private int speed;
    private boolean seatbelt;

    public Car(String plate, LocalDate date, int speed, boolean seatbelt, CarType type) {
        this.date= date;
        this.plate = plate;
        this.speed = speed;
        this.type = type;
        this.seatbelt = seatbelt;
    }

    public int getSpeed() {
        return speed;
    }
    public CarType getType() {
        return type;
    }
    public String getPlate() {
        return plate;
    }
    public LocalDate getDate() {
        return date;
    }
    public boolean IsSeatbelt() {
        return seatbelt;
    }
}
import java.util.ArrayList;
import java.util.List;

public class Radar {

    private List<Rule> rules;

    public Radar(List<Rule> rules) {
        this.rules = rules;
    }

    public Fine check(Car car) {
        List<Violation> violations = new ArrayList<>();

        for (Rule rule : rules) {
            Violation violation = rule.check(car);
            if (violation != null) {
                violations.add(violation);
            }
        }
        return new Fine(car.getPlate(), violations);
    }
}
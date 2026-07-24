import java.util.List;

public class Fine {

    private int totalAmount ;
    private String plateNumber;
    private List<Violation> violations;
    public Fine( String plateNumber, List<Violation>violations)
    {
        this.plateNumber = plateNumber;
        this.violations = violations;
        totalAmount = 0;
        for(Violation violation :violations)
        {
            totalAmount += violation.getAmount();
        }
    }

    public int getTotalAmount()
    {
        return totalAmount;
    }
    public String getPlateNumber()
    {
        return plateNumber;
    }
    public List<Violation> getViolations()
    {
        return violations;
    }
}
package enumtype.position;

public enum Position {

    CEO(250_000, "car"),
    CFO(200_000, "health insurance"),
    COO(190_000, "stock options"),
    CTO(180_000, "company laptop"),
    CMO(170_000, "travel allowance"),
    CIO(160_000, "gym membership");

    private int salary;
    private String benefit;

    Position(int salary, String benefit) {
        this.salary = salary;
        this.benefit = benefit;
    }

    public int getSalary() {
        return salary;
    }

    public String getBenefit() {
        return benefit;
    }


}

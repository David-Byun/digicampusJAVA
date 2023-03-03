public class Sales extends Employee {
    private String loc;
    private double rate;

    public Sales() {
    }

    public Sales(String id, String name, double salary) {
        super(id, name, salary);
    }

    public Sales(String id, String name, double salary, String loc, double rate) {
        super(id, name, salary);
        this.loc = loc;
        this.rate = rate;
    }
}

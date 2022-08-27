package practiceSession;

public class P05 {
    private String salary;
    private String name = "Faizan";

    public String getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        P05 empl = new P05();
        System.out.println(empl.getName());
        empl.setSalary("32.00");
        System.out.println(empl.getSalary());
    }
}

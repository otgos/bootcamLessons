package day20;

public class VehicleRunner {
    public static void main(String[] args) {
        Vehicles v1 = new Vehicles("Subaru", "Forester", 2012, 1345425);
        Vehicles v2 = new Vehicles("Honda", "Civics", 12000);
        System.out.println(v1.model);
    }
}

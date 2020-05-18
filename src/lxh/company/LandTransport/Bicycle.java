package lxh.company.LandTransport;

public class Bicycle extends LandTransport{
    public void Bicycle(Bicycle bicycle){
        System.out.println(bicycle.getId());
        bicycle.LandTransport(bicycle);
        bicycle.drivingMethod();
    }

}

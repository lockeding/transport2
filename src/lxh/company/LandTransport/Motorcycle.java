package lxh.company.LandTransport;

public class Motorcycle  extends LandTransport{
    public void Motorcycle(Motorcycle motorcycle){
        System.out.println(motorcycle.getId());
        motorcycle.LandTransport(motorcycle);
        motorcycle.drivingMethod();
    }
}

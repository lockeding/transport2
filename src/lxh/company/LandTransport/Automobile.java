package lxh.company.LandTransport;

public class Automobile extends LandTransport{
    public void Automobile(Automobile automobile){
        System.out.println(automobile.getId());
        automobile.LandTransport(automobile);
        automobile.drivingMethod();

    }
}

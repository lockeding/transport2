package lxh.company.AirTransport;

public class Aircraft extends AirTransport{
    public void Aircraft(Aircraft aircraft){
                System.out.print(aircraft.getId());
                aircraft.AirTransport(aircraft);
                aircraft.drivingMethod();
    }
}

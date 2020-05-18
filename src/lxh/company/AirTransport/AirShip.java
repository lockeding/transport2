package lxh.company.AirTransport;

public class AirShip extends AirTransport {

    public void Airship(AirShip airShip){
        System.out.print(airShip.getId());
        airShip.AirTransport(airShip);
        airShip.drivingMethod();
    }
}

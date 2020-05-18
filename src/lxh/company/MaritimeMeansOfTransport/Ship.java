package lxh.company.MaritimeMeansOfTransport;

public class Ship extends MaritimeMeansOfTransport{
    public void Ship(Ship ship){
        System.out.println(ship.getId());
        ship.MaritimeMeansOfTransport(ship);
        ship.drivingMethod();
    }
}

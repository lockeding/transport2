package lxh.company;

import lxh.company.AirTransport.AirShip;
import lxh.company.AirTransport.Aircraft;
import lxh.company.AirTransport.HotAirBallon;
import lxh.company.LandTransport.Automobile;
import lxh.company.LandTransport.Bicycle;
import lxh.company.LandTransport.Motorcycle;
import lxh.company.LandTransport.Train;
import lxh.company.MaritimeMeansOfTransport.Hovercraft;
import lxh.company.MaritimeMeansOfTransport.Ship;
import lxh.company.MaritimeMeansOfTransport.Submarine;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setId("201902210");
        person.setP_Age(20);
        person.setP_Name("lxh");
        person.setP_Sex("man");

        Aircraft aircraft = new Aircraft();
        aircraft.setId("aircraft1");
        person.detaileMessa();
        aircraft.AirTransport(aircraft);
        person.drivingTransport(aircraft);
        System.out.println("-----------------");

        AirShip airShip = new AirShip();
        airShip.setId("airship1");
        airShip.AirTransport(airShip);
        person.drivingTransport(airShip);
        System.out.println("-----------------");

        HotAirBallon hotAirBallon = new HotAirBallon();
        hotAirBallon.setId("hotAirBallon1");
        hotAirBallon.AirTransport(hotAirBallon);
        person.drivingTransport(hotAirBallon);
        System.out.println("-----------------");

        Automobile automobile = new Automobile();
        automobile.setId("automobile1");
        automobile.LandTransport(automobile);
        person.drivingTransport(automobile);
        System.out.println("-----------------");

        Bicycle bicycle = new Bicycle();
        bicycle.setId("bicycle1");
        bicycle.LandTransport(automobile);
        person.drivingTransport(automobile);
        System.out.println("-----------------");

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.setId("motorcycle1");
        motorcycle.LandTransport(motorcycle);
        person.drivingTransport(motorcycle);
        System.out.println("-----------------");

        Train train = new Train();
        train.setId("train1");
        train.LandTransport(train);
        person.drivingTransport(train);
        System.out.println("-----------------");

        Hovercraft hovercraft = new Hovercraft();
        hovercraft.setId("hovercraft1");
        hovercraft.MaritimeMeansOfTransport(hovercraft);
        person.drivingTransport(hovercraft);
        System.out.println("-----------------");

        Ship ship = new Ship();
        ship.setId("ship1");
        ship.MaritimeMeansOfTransport(ship);
        person.drivingTransport(ship);
        System.out.println("-----------------");

        Submarine submarine = new Submarine();
        submarine.setId("submarine1");
        submarine.MaritimeMeansOfTransport(submarine);
        person.drivingTransport(submarine);


    }
}

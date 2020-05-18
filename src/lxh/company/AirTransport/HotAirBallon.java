package lxh.company.AirTransport;

public class HotAirBallon extends AirTransport{
    public void HotAirBallon(HotAirBallon hotAirBallon){
        System.out.println(hotAirBallon.getId());
        hotAirBallon.AirTransport(hotAirBallon);
        hotAirBallon.drivingMethod();
    }
}

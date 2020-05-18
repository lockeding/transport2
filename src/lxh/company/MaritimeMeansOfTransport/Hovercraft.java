package lxh.company.MaritimeMeansOfTransport;


public class Hovercraft extends MaritimeMeansOfTransport{
    public void Hovercraft(Hovercraft hovercraft){
        System.out.println(hovercraft.getId());
        hovercraft.MaritimeMeansOfTransport(hovercraft);
        hovercraft.drivingMethod();
    }
}

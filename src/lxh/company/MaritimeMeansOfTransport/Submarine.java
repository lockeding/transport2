package lxh.company.MaritimeMeansOfTransport;

public class Submarine extends MaritimeMeansOfTransport{
    public Submarine(Submarine submarine){
        System.out.println(submarine.getId());
        submarine.MaritimeMeansOfTransport(submarine);
        submarine.drivingMethod();
    }

    public Submarine() {

    }
}

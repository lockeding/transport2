package lxh.company.LandTransport;

public class Train extends LandTransport{
    public void Train(Train train){
        System.out.println(train.getId());
        train.LandTransport(train);
        train.drivingMethod();
    }
}

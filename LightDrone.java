public class LightDrone extends Drone{

    private int speed;


    private LightDrone(int speed, int weight, String name, int id, String status, int cargoCapacity, int currentCargoWeight) {
        super(id, status, cargoCapacity, currentCargoWeight);
        this.speed = speed;


    }

    @Override
    public double calculateFlightTime(double distance) {
        return distance/speed;
    }
}

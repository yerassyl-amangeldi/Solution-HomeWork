public class HeavyDrone extends Drone{
    private int speed;


    public HeavyDrone(int id, String status, int cargoCapacity, int currentCargoWeight) {
        super(id, status, cargoCapacity, currentCargoWeight);
        this.speed = speed;
    }

    @Override
    public double calculateFlightTime(double distance) {
        return (distance/speed)*1.5;
    }
}

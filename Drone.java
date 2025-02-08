public abstract class Drone {
    private int id;
    private String status;
    private int cargoCapacity;
    private int currentCargoWeight;

    Drone(int id, String status, int cargoCapacity, int currentCargoWeight) {
        this.id = id;
        this.status = status;
        this.cargoCapacity = cargoCapacity;
        this.currentCargoWeight = currentCargoWeight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getCurrentCargoWeight() {
        return currentCargoWeight;
    }

    public void setCurrentCargoWeight(int currentCargoWeight) {
        this.currentCargoWeight = currentCargoWeight;



    }

    public abstract double calculateFlightTime(double distance);

}

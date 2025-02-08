public class DeliveryTask {
    public CelestialBoy origin;
    public CelestialBoy destination;
    public Cargo requiredCargo;
    public Drone assignedDrone;

    public CelestialBoy getOrigin() {
        return origin;
    }

    public void setOrigin(CelestialBoy origin) {
        this.origin = origin;
    }

    public CelestialBoy getDestination() {
        return destination;
    }

    public void setDestination(CelestialBoy destination) {
        this.destination = destination;
    }

    public Cargo getRequiredCargo() {
        return requiredCargo;
    }

    public void setRequiredCargo(Cargo requiredCargo) {
        this.requiredCargo = requiredCargo;
    }

    public Drone getAssignedDrone() {
        return assignedDrone;
    }

    public void setAssignedDrone(Drone assignedDrone) {
        this.assignedDrone = assignedDrone;
    }

    public DeliveryTask(CelestialBoy origin, CelestialBoy destination, Cargo requiredCargo, Drone assignedDrone) {
        this.origin = origin;
        this.destination = destination;
        this.requiredCargo = requiredCargo;
        this.assignedDrone = assignedDrone;

    }
}

public class SpaceStation extends CelestialBoy{
    public String name;
    public int stationLevel;


    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStationLevel() {
        return stationLevel;
    }

    public void setStationLevel(int stationLevel) {
        this.stationLevel = stationLevel;
    }

    public SpaceStation(String name, int coordinateX, int coordinateY) {
        super(name, coordinateX, coordinateY);
        this.stationLevel = stationLevel;
    }
}

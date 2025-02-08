public class Planet extends CelestialBoy{
    public String name;
    public String atmosphereType;

    public Planet(String name, int coordinateX, int coordinateY) {
        super(name, coordinateX, coordinateY);
        this.atmosphereType = atmosphereType;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAtmosphereType() {
        return atmosphereType;
    }

    public void setAtmosphereType(String atmosphereType) {
        this.atmosphereType = atmosphereType;
    }
}

public class Cargo {
    public int weight;
    public String description;

    public Cargo(int weight, String description) {
        this.weight = weight;
        this.description = description;


    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

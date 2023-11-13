package linkedLists;

public class Town {
    private String name;
    private int distanceFromStartInKm;

    public Town(String name, int distanceFromStart) {
        this.name = name;
        this.distanceFromStartInKm = distanceFromStart;
    }

    public int getDistanceFromStartInKm() {
        return distanceFromStartInKm;
    }

    @Override
    public String toString() {
        return "Town{" +
                "name='" + name + '\'' +
                ", distanceFromStartInKm=" + distanceFromStartInKm +
                '}';
    }
}

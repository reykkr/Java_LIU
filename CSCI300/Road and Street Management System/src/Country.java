import java.util.ArrayList;

public class Country {
    private String name;
    private ArrayList<Road> roads;

    public Country(String name) {
        this.name = name;
        this.roads = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Road> getRoads() {
        return roads;
    }

    public void addRoad(Road r) {
        roads.add(r);
    }

    public int countStreets() {
        int streetCount = 0;
        for (Road road : roads) {
            if (road instanceof Street) {
                streetCount++;
            }
        }
        return streetCount;
    }

    public Street searchForStreet(String streetName) {
        for (Road road : roads) {
            if (road instanceof Street && ((Street) road).getName().equals(streetName)) {
                return (Street) road;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder("Country: " + name + "\n");
        for (Road road : roads) {
            info.append(road.toString()).append("\n");
        }
        return info.toString();
    }
}

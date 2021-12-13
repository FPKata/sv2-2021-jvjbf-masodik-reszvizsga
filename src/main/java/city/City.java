package city;

import java.util.List;

public class City {
    private String name;
    private long fullArea;
    private List<Building> buildings;

    public City(String name, long fullArea) {
        this.name = name;
        this.fullArea = fullArea;
    }

    public String getName() {
        return name;
    }

    public long getFullArea() {
        return fullArea;
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public void addBuilding(Building building){
        int sum = 0;
        for (Building actual : buildings){
            sum += actual.getArea();
            if (sum <= fullArea){
                buildings.add(actual);
            }
        }
    }

    public Building findHighestBuilding(){
        int max = buildings.get(0).getLevels();
        Building maxBuilding = null;

        for (Building actual : buildings){
            if (actual.getLevels() > max){
                max = actual.getLevels();
                maxBuilding = actual;
            }
        }
        return maxBuilding;
    }
    public List<Building> findBuildingsByStreet(String street){

    }
}

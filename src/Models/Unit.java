package Models;

/**
 * Created by jonathon on 11/28/15.
 */
public class Unit {
    String Name;
    Integer stationNumber;

    public Unit(String name, Integer stationNumber) {
        Name = name;
        this.stationNumber = stationNumber;
    }

    public Unit() {
    }

    public String getName() {
        return Name;
    }

    public Integer getStationNumber() {
        return stationNumber;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setStationNumber(Integer stationNumber) {
        this.stationNumber = stationNumber;
    }
}

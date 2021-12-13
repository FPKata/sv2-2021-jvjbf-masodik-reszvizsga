package city;

public abstract class Building {
    private int area;
    private int floor;
    private Address address;

    public Building(int area, int floor, Address address) {
        this.area = area;
        this.floor = floor;
        this.address = address;
    }

    public int getFullArea(){
        return area * floor;
    }

    public abstract int calculateNumberOfPeopleCanFit();

    public Building(int area, Address address) {
        this(area, 1, address);
    }

    public int getArea() {
        return area;
    }

    public int getFloor() {
        return floor;
    }

    public Address getAddress() {
        return address;
    }
}

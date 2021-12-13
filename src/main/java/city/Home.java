package city;

public class Home extends Building{

    protected static final int SQUARE_METERS_NEED_PER_PERSON = 20;

    public Home(int area, int floor, Address address) {
        super(area, floor, address);
        if (floor > 3){
            throw new IllegalArgumentException();
        }
    }
    
    public Home(int area, Address address) {
        super(area, address);
    }

    @Override
    public int calculateNumberOfPeopleCanFit() {
        return getFullArea() / SQUARE_METERS_NEED_PER_PERSON;
    }
}

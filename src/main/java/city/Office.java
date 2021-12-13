package city;

import java.util.List;

public class Office extends Building{
    private String company;
    private int numberOfTablesPerLevel;

    public Office(int area, int floor, Address address, String company, int numberOfTables) {
        super(area, floor, address);
        this.company = company;
        this.numberOfTablesPerLevel = numberOfTables;
        if (numberOfTables > area / 5){
            throw new IllegalArgumentException();
        }
    }

    public Office(int area, Address address, String company, int numberOfTables) {
        super(area, address);
        this.company = company;
        this.numberOfTablesPerLevel = numberOfTables;
    }

    public String getCompany() {
        return company;
    }

    public int getNumberOfTablesPerLevel() {
        return numberOfTablesPerLevel;
    }

    @Override
    public int calculateNumberOfPeopleCanFit() {
        return 0;
    }
}
